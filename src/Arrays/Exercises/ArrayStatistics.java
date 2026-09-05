package Arrays.Exercises;

public class ArrayStatistics {
    public static void main(String[] args){

        int[] numbers = {3, 2, 1, 4};
        int sum = 0;
        double average;
        int max = numbers[0];
        int min = numbers[0];


        for(int number : numbers){
            sum += number;

            if(number > max){
                max = number ;
            }
            else if(number < min) {
                min = number ;
            }

        }

        average = (double) sum / numbers.length ;



        System.out.print("Sum: " + sum + " " + "Average: " + average + " " + "Maximum: " + max + " " + "Minimum: " + min);
    }
}
