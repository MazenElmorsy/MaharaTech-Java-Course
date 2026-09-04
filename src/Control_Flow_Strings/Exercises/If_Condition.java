package Control_Flow_Strings.Exercises;

import java.util.Scanner;

public class If_Condition {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        //GROUP 1

        if(name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }
        else{
            System.out.println("Hello "+name+"!");
        }

        //GROUP 2

        if(age >= 60){
            System.out.println("You are a senior!");
        }
        else if(age >= 18){
            System.out.println("You are an adult!");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet!");
        }
        else{
            System.out.println("You are a child!");
        }

        //GROUP 3

        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are NOT a student!");
        }

        scanner.close();
    }
}
