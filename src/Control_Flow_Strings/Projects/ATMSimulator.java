package Control_Flow_Strings.Projects;

import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        double amount;
        boolean isAuthenticated = false;
        boolean isRunning = true;
        int option;
        int pin = 1749;

        for(int i = 0; i < 3; i++){
            System.out.print("Enter your pin: ");
            if(scanner.nextInt() == pin){
                System.out.println("Correct pin");
                System.out.println("Authenticating....");
                isAuthenticated = true;
                break;
            }
            else{
                System.out.println("Incorrect pin, Try again");
            }
        }

        if(isAuthenticated) {
            while (isRunning) {
                System.out.println("==========BANKING PROGRAM==========");
                System.out.println("1. Show Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("===================================");

                System.out.print("Enter your option (1-4): ");
                option = scanner.nextInt();

                switch (option) {
                    case 1 -> System.out.printf("Your balance is: %.2f$\n", balance);
                    case 2 -> {
                        System.out.print("Enter the amount to deposit: ");
                        amount = scanner.nextDouble();
                        if(amount <= 0){
                            System.out.println("INVALID AMOUNT!");
                        }
                        else{
                            balance += amount ;
                            System.out.printf("Deposit successful! Your balance is: %.2f$\n", balance);
                        }
                    }
                    case 3 -> {
                        System.out.println("Enter the amount to withdraw: ");
                        amount = scanner.nextDouble();
                        if(amount <= 0){
                            System.out.println("INVALID AMOUNT!");
                        }
                        else if(amount > balance){
                            System.out.println("INSUFFICIENT BALANCE!");
                        }
                        else{
                            balance -= amount ;
                            System.out.printf("Withdraw successful! Your balance is: %.2f$\n", balance);
                        }
                    }
                    case 4 -> {
                        System.out.println("Exiting....");
                        isRunning = false;
                    }
                    default -> System.out.println("INVALID OPTION!");
                }
            }
        }
        else{
            System.out.println("Maximum number of attempts reached!");
            System.out.println("Account Locked");
            System.out.println("Exiting....");
        }

        scanner.close();
    }
}
