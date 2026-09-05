package Arrays.Exercises;

import java.util.Scanner;

public class ArrayLinearSearch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 5, 3, 7, 2, 4, 8} ;
        int target;
        int index;

        System.out.print("Enter a number to search for: ");
        target = scanner.nextInt();

        index = linearSearch(numbers, target);

        if(index == -1){
            System.out.println("Element NOT found in the array");
        }
        else{
            System.out.println("Element found at index: " + index);
        }

        scanner.close();
    }

    static int linearSearch(int[] numbers, int target){
        for(int i = 0; i < numbers.length ; i++){
            if(numbers[i] == target){
                return i ;
            }
        }
        return - 1;
    }
}
