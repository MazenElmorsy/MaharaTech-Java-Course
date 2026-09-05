package Arrays.Exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayBinarySearch {
    public static void main(String[] args) {

        int size = 1000 ;
        int[] numbers = new int[size];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < size; i++){
            numbers[i] = random.nextInt(10000);
        }

        int max = numbers[0];
        int min = numbers[0];

        for(int i = 0; i < size; i++){
            if(numbers[i] > max) max = numbers[i] ;
            if(numbers[i] < min) min = numbers[i] ;
        }

        System.out.println("The maximum number is: "+ max);
        System.out.println("the minimum number is: "+ min);

        int[] sorted = numbers.clone();
        Arrays.sort(sorted);
        System.out.println("Enter a number to search for: ");
        int target = scanner.nextInt() ;

        int resultIndex = binarySearch(sorted, target) ;

        if(resultIndex == -1){
            System.out.println("No result found!");
        }
        else{
            System.out.println("Search result index is: " + resultIndex);
        }


        scanner.close() ;
    }

    public static int binarySearch(int[] sortedArray, int target){
        int low = 0;
        int high = sortedArray.length - 1 ;

        while(low <= high){
            int mid = (low + high) / 2;
            if(sortedArray[mid] == target){
                return mid ;
            }
            else if(sortedArray[mid] < target){
                low = mid + 1 ;
            }
            else {
                high = mid - 1 ;
            }
        }
        return -1 ;
    }
}
