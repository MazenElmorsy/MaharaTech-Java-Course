package Control_Flow.Exercises;

import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);

        int option ;
        String name;
        double num1 , num2 ;
        double result ;
        char operator ;

        do{
            System.out.println("----------Simple Menu----------");
            System.out.println("1. Say Hello");
            System.out.println("2. Calculate");
            System.out.println("3. Exit");
            System.out.println("-------------------------------");

            System.out.print("Enter your option (1 - 3): ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1 -> {
                    System.out.print("Enter your name: ");
                    name = scanner.nextLine() ;
                    System.out.printf("Hello %s!\n", name);
                }
                case 2 -> {
                    System.out.print("Enter the First Number: ");
                    num1 = scanner.nextInt() ;
                    System.out.print("Enter the Second Number: ");
                    num2 = scanner.nextInt();
                    System.out.print("Enter the operator (+, - , * , /): ");
                    operator = scanner.next().charAt(0) ;

                    switch(operator){
                        case '+' -> {
                            result = num1 + num2;
                            System.out.printf("The Sum of %.2f and %.2f is: %.2f\n", num1 , num2, result);
                        }
                        case '-' -> {
                            result = num1 - num2;
                            System.out.printf("The Subtraction of %.2f and %.2f is: %.2f\n", num1 , num2, result);
                        }
                        case '*' -> {
                            result = num1 * num2;
                            System.out.printf("The Multiplication of %.2f and %.2f is: %.2f\n", num1 , num2, result);
                        }
                        case '/' -> {
                            if(num2 == 0) {
                                System.out.println("Can't divide on ZERO!");
                            }else {
                                result = num1 / num2;
                                System.out.printf("The Division of %.2f and %.2f is: %.2f\n", num1, num2, result);
                            }
                        }
                        default -> System.out.println("Invalid Operator!");
                    }
                }
                case 3 -> System.out.println("Exiting....");
                default -> System.out.println("Invalid option!");
            }
        }while(option != 3) ;

        scanner.close();
    }
}
