import java.util.Scanner;

public class Adivinanzas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean  empezar = true;

        while (empezar) {

            System.out.print("\033[H\033[2J");
            System.out.flush(); 
            System.out.println("------- Menú -------");
            System.out.println("1) Empezar a jugar. \n2) Reglas. \n3) Salir.");
            System.out.print("Ingresar una opcion: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:

                    break;
                case 3:
                    empezar = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
                    break;
            }
        }

        scanner.close();
    }



    Double numberRandow (){
        double number = Math.round(Math.random()*10);
        return number;
    }

    void jugar(){
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Intenta adivinar el número: ");
        System.out.print("Ingrese ");
        scanner.close();
    }
}
