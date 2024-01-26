import java.util.Scanner;

public class ManejoCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean option = true;
        String result = "Prueba";
        while (option) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Ingrese opcion que desea realizar: \n");
            System.out.println("1) Ingresesar cadena de texto. \n2) Muestra la longitud de la cadena. \n3) Convertir la cadena a mayusculas. \n4) Convertir cadena a minusculas. \n5) Verificar si la cadena tiene la palabra java. \n6) Salir");
            System.out.print("\nNumero de operacion: ");
            int caso = scanner.nextInt();
            switch (caso) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.print("Ingresa una cadena de text sin espacios: ");
                    result = scanner.next();
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println( "Longitud de la cadena: " +result.length());
                    System.out.print("Presione enter para volvers:  ");
                    scanner.nextLine();
                    break;
                case 3: 
                    System.out.print("\033[H\033[2J");
                    System.out.flush(); 
                    System.out.println("Palabra en Mayuscula: " + result.toUpperCase());
                    System.out.print("Presione enter para volvers:  ");
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Palabra en Minuscula: " + result.toLowerCase());
                    System.out.print("Presione enter para volvers:  ");
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    int h = result.indexOf("java");
                    String comprovacion = h == -1 ? "No esta la palabra java": "Si esta la palabra  java";
                    System.out.println(comprovacion);
                    System.out.print("Presione enter para volvers:  ");
                    scanner.nextLine();
                    break;
                case 6:
                    option = false;
                    break;
                default:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Opcion incorrecta");
                    System.out.print("Presione enter para volvers:  ");
                    scanner.nextLine();
                    break;
            }
            scanner.nextLine();
        }

        scanner.close();
    }
    
}
