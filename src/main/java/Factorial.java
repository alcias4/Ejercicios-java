import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Factorial number: ");
        int number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= number ; i++){
            result = result*i;
        }
        System.out.println("Result: " + result);
    }
}
