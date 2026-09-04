package Control_Flow_Strings.Projects;

import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text;
        int words;
        int vowels;
        int consonants;
        int digits;
        int uppercase;
        int lowercase;
        boolean isPalindrome;

        System.out.print("Enter a text: ");
        text = scanner.nextLine();

        words = getWords(text) ;
        System.out.println("Number of words is: "+ words);

        vowels = getVowels(text) ;
        System.out.println("Number of vowels is: "+ vowels);

        consonants = getConsonants(text) ;
        System.out.println("Number of consonants is: "+ consonants);

        digits = getDigits(text) ;
        System.out.println("Number of digits is: "+ digits);

        uppercase = getUppercase(text) ;
        System.out.println("Number of uppercases is: "+ uppercase);

        lowercase = getLowercase(text) ;
        System.out.println("Number of lowercases is: "+ lowercase);

        isPalindrome = isPalindrome(text) ;
        if(isPalindrome){
            System.out.println("The text you entered is palindrome");
        }
        else{
            System.out.println("The text you entered is NOT palindrome");
        }

    }

    static int getWords(String text){
        int number = 0 ;
        for(int i = 0; i < text.length(); i++){

            if(Character.isLetter(text.charAt(i))){
                if(i == 0){
                    number++;
                }
                else if(Character.isWhitespace(text.charAt((i) - 1))){
                    number++;
                }
            }
        }
        return number ;
    }

    static int getVowels(String text){
        int number = 0 ;
        String vowels = "aeiouAEIOU" ;
        for(int i = 0; i < text.length() ; i++){
            for(int j = 0; j < vowels.length() ; j++){
                if(text.charAt(i) == vowels.charAt(j)){
                    number++;
                }
            }
        }
        return number ;
    }

    static int getConsonants(String text){
        int number = 0;
        String vowels = "aeiouAEIOU" ;
        boolean isVowel = false;

        for(int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                for (int j = 0; j < vowels.length(); j++) {
                    if(text.charAt(i) == vowels.charAt(j)) {
                        isVowel = true;
                        continue;
                    }
                }
                if(isVowel){
                    isVowel = false;
                }
                else{
                    number++;
                }
            }
        }
        return number ;
    }

    static int getDigits(String text){
        int number = 0 ;
        for(int i = 0; i < text.length() ; i++){
            if(Character.isDigit(text.charAt(i))){
                number++;
            }
        }
        return number ;
    }

    static boolean isPalindrome(String text){
        String reversedText = "";
        for(int i = text.length() - 1; i >= 0; i--){
            reversedText += text.charAt(i);
        }

        return reversedText.equalsIgnoreCase(text) ;
    }

    static int getUppercase(String text){
        int number = 0 ;
        for(int i = 0; i < text.length() ; i++){
            if(Character.isUpperCase(text.charAt(i))){
                number++;
            }
        }
        return number ;
    }

    static int getLowercase(String text){
        int number = 0 ;
        for(int i = 0; i < text.length() ; i++){
            if(Character.isLowerCase(text.charAt(i))){
                number++;
            }
        }
        return number ;
    }
}
