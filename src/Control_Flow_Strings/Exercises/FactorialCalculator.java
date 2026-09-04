package Control_Flow_Strings.Exercises;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number, result = 1;

        System.out.print("Enter a number to get its factorial: ");
        number = scanner.nextInt();

        if(number < 0){
            System.out.println("The number can't be negative!");
        }
        else{
            for(int i = number; i > 0 ;i--){
                result *= i ;
            }
        }

        System.out.printf("The factorial of %d is %d.", number, result);

        scanner.close();
    }
}
