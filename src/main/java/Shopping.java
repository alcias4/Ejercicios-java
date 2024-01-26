



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shopping shopping = new Shopping();

        List<String> listCart = new ArrayList<>(); 
        
        listCart.add("Apple");
        listCart.add("Orange");
        Boolean condition = true;
        
        while (condition) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("--------- Menu --------- ");
            System.out.println("1) See shopping list  \n2) Add product \n3) Remove product \n4) Exit ");
            System.out.print("Enter an option between (1-4): ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("--------- List ---------");
                    for(int i =0; i < listCart.size();i++){
                        System.out.println((i + 1) + ") " + listCart.get(i));
                    }
                    System.out.print("Enter for return : ");
                    scanner.nextLine();
                    break;
                case 2:
                    listCart.add(shopping.addList());
                    break;
                case 3: 
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println(" --- remove ---  ");
                    for(int i =0; i < listCart.size();i++){
                        System.out.println((i + 1) + ") " + listCart.get(i));
                    }
                    System.out.println("Enter the  product  position you want remove: ");
                    int position = scanner.nextInt();
                    if (position > 0 && position <= listCart.size()){
                        listCart.remove(position);
                    } else {
                        System.out.println("no esta en la lista");
                    }

                    System.out.print("Enter for return : "); 
                    scanner.nextLine();
                    break;
                case 4: 
                    condition = false;
                    break;
                default:
                    System.out.println("Option incorrect!");
                
            }
            scanner.nextLine();
        }
        
        scanner.close();

    }
    

    String addList(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Enter the product name \n");
        String product = scanner.nextLine();
        return product;
    }
}
