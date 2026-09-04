package Control_Flow_Strings.Exercises;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String word ;
        String reversedWord = "";

        System.out.print("Enter a word to check for palindrome: ");
        word = scanner.nextLine();

        for(int i = word.length() - 1; i >= 0; i--){
            reversedWord += word.charAt(i) ;
        }

        if(reversedWord.equals(word)){
            System.out.printf("%s is a palindrome", word);
        }
        else{
            System.out.printf("%s is NOT a palindrome", word);
        }
    }
}
