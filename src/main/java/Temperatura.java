import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double result=0;
        String t="";

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("1) Convertir de Celsius a Fahrenheit. \n2) Convertir de Fahrenheit a Celsius.");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Ingrese la temperatura en grados celcius: ");
                result = scanner.nextDouble();
                result = (result * 9/5) + 32;
                t="F";
                break;
            case 2:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Ingrese la temperatura en grados Fahrenheit: ");
                result = scanner.nextDouble();
                result = (32 - result) * 5/9;
                t="C";
                break;
            default:
                System.out.println("Opcion incorrecto");
                break;
        }

        System.out.println("Temperatura: " + result +  " " + t);

        scanner.close();
    }
}
