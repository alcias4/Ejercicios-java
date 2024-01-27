package bank;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        List<Account> list = new ArrayList<>();

        boolean start = true;
        System.out.print("Enter the total money: ");
        double total = scanner.nextDouble();

        while (start){
            System.out.println("--------- Menu ---------");
            System.out.println("1) Create account \n2) Add an account money \n3) Remove Account \n4) Send money \n5) View account list \n6) Exit");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    total = bank.createAccount(list,total);
                    break;
                case 2:
                    bank.transfer(list,total);
                    break;
                case 3:
                    list = bank.removeAccount(list,total);
                    break;
                case 4:
                    total = bank.sendingMoney(total);
                    System.out.println("Press the key enter for return: ");
                    break;
                case 5:
                    bank.seeAccounts(list, total);
                    break;
                case 6:
                    System.out.println("Hello world");
                    break;
                case 7:
                    start = false ;
                    break;
                default:
                    System.out.println("Option incorrect!");
                    break;
            }

        }

    }

    double createAccount(List<Account> listAccount, double total){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------- Create Account -------");
        System.out.println("Enter name of the Account: ");
        String name = scanner.nextLine();
        System.out.println("Enter Account amount: ");
        double money = scanner.nextDouble();
        if (money <= total){
            listAccount.add(new Account(name, money));
            total = total - money;
        } else {
            System.out.println("lacks money!");
        }
        return total;
    }


    void seeAccounts (List<Account> list, double total){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Transfer ----");
        System.out.println(" Total money: " + total);
        for(Account se : list){
            System.out.println(se.seeInfo());
        }
        System.out.print("Press the key enter for return: ");
        scanner.nextLine();
    }

    void transfer (List<Account> list, double total){
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("---- Transfer ----");
        bank.seeAccounts(list, total);
        System.out.print("Enter name of the Account you want transfer: ");
        String nam = scanner.nextLine();
        for (Account account : list) {
            String n = account.name;
            if(Objects.equals(n, nam)){
                System.out.print("Enter Amount: ");
                account.money = account.money + scanner.nextDouble();
            } else {
                System.out.println("⚠ Name incorrect: ");
            }
        }
        System.out.print("Press the key enter for return: ");
        scanner.nextLine();

    }

    List<Account>  removeAccount (List<Account> list, double total){
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        System.out.println("---- Remove ----");
        bank.seeAccounts(list,total);
        System.out.print("Enter name of the Account you want remove: ");
        String nam = scanner.nextLine();
        for (Account account:list){
            if(Objects.equals(account.name, nam)){
                return list.stream().filter(m -> Objects.equals(m.name,nam)).toList();
            }
        }
        System.out.println("⚠ Name incorrect: ");
        System.out.print("Press the key enter for return: ");
        scanner.nextLine();
        return list;
    }

    double  sendingMoney(double total){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Sending money ----");
        System.out.print("Enter number card: ");
        String numberCard = scanner.nextLine();
        System.out.print("Enter card name: ");
        String name = scanner.nextLine();
        System.out.print("Enter amount money: ");
        double money = scanner.nextDouble();

        if (money <= total){
            System.out.println("---- Sending info ----");
            System.out.println("Money was send");
            System.out.println("Name: " + name);
            System.out.println("Number Card: " + numberCard);
            System.out.println("Amount: " + money);
            System.out.print("Press the key enter for return: ");
            scanner.nextLine();

            return total - money;
        }
        System.out.println("lacks money!");
        System.out.print("Press the key enter for return: ");
        scanner.nextLine();
        return total;

    }

}
