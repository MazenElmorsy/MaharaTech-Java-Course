package Control_Flow.Exercises;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess ;
        int attempts = 0;
        int max = 100;
        int min = 1;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("-----Number Guessing Game-----");
        System.out.printf("Guess a number between %d and %d\n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again");
            }
            else{
                System.out.printf("YOU GOT IT! The number was %d.\n", randomNumber);
                System.out.printf("# of attempts: %d", attempts);
            }
        }while(guess != randomNumber);

        scanner.close();
    }
}
