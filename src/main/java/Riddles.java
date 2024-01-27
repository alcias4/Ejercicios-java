
import java.util.Scanner;

public class Riddles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Riddles riddles = new Riddles();

        boolean finish = false;
        double numRandom = Math.ceil(Math.random()*10);
        boolean start = true;

        while (start){
            System.out.println("------ MENU ------");
            System.out.println("1) Star game \n2) Exit ");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    finish = riddles.starGame(numRandom);
                    start = false;
                    break;
                case 2:
                    start = false;
                    break;
                default:
                    System.out.println("Incorrect Option!");
                    break;
            }
        }
        System.out.println("--------------------- Game Result ---------------------");
        String result = finish ? "!\uD83E\uDD73 Win game":"\uD83D\uDE1E Lost the game";
        System.out.println(result);
    }


    boolean  starGame (double num){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------- GAME ---------------------");
        int lives = 5;

        while (lives != 0){

            System.out.println("Riddles game: guess a number between 0-10 ");
            String heart = "";
            for(int i = 0; i < lives; i++){
                heart = heart + "❤";
            }
            System.out.println(heart);
            System.out.print("Enter number: ");
            int number = scanner.nextInt();

            if (number != num){
                lives--;
                System.out.println("--------------------- GAME ---------------------");
                String n = num < number ? "!\uD83D\uDD14 It is minor a number: " + number:"\uD83D\uDD14 It is large a number: " + number;
                System.out.println(n);
            }  else {
                return  true;
            }
        }

        return false;
    }

}
