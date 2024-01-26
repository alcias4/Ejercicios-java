

import  java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator operation = new Calculator();


        System.out.println("----- CALCULATOR -----");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");

        System.out.print("Enter the operation you want to perform (1 - 4): ");
        int option = scanner.nextInt();
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2  = scanner.nextDouble();


        switch (option) {
            case 1 -> System.out.println("Result Addition: " + operation.addition(num1,num1));
            case 2 -> System.out.println("Result Subtraction: " + operation.subtraction(num1,num2));
            case 3 -> System.out.println("Result Multiplication: " + operation.multiplication(num1,num2));
            case 4 -> System.out.println("Result Division: " + operation.division(num1,num2));
            default -> System.out.println("Error option!");
        }

        scanner.close();
    }


    double addition(double num1, double num2){
        return  num1 + num2;
    }

    double subtraction(double num1, double num2){
        return  num1 - num2;
    }
    double multiplication(double num1, double num2){
        return  num1 * num2;
    }
    double division(double num1, double num2){

        return  num2 != 0 ? num1/num2 : 0;
    }

}
