package Control_Flow.Exercises;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args){
        // Formula --> A = P [1 + R/N]^NT

        Scanner scanner = new Scanner(System.in);

        double amount, principal, rate ;
        int years, timeCompounded ;
        boolean isRunning = true;

        while(isRunning){
            System.out.print("Enter the principal amount: ");
            principal = scanner.nextDouble();

            System.out.print("Enter the interest rate (in %): ");
            rate = scanner.nextDouble() / 100;

            System.out.print("Enter the # of times compounded per year: ");
            timeCompounded = scanner.nextInt();

            System.out.print("Enter the # of years: ");
            years = scanner.nextInt();
            scanner.nextLine();

            amount = principal * Math.pow(1 + rate / timeCompounded, years * timeCompounded) ;

            System.out.printf("The amount after %d years is: $%.2f \n",years, amount);

            System.out.print("Do you want to calculate again? (true/false): ");
            isRunning = scanner.nextBoolean();

        }
        System.out.print("Exiting.....");
    }
}
