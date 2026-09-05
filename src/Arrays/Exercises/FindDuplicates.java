package Arrays.Exercises;

public class FindDuplicates {
    public static void main(String[] args){
        int[] numbers = {1, 7, 7, 7, 1, 4, 4, 4, 4, 5, 6, 3};
        boolean isDuplicate = false;
        boolean hasDuplication = false;
        int numberOfAppearance = 1;

        for(int i = 0; i < numbers.length; i++){

            boolean alreadyProcessed = false;

            for(int j = 0 ; j < i; j++){
                if(numbers[i] == numbers[j]){
                    alreadyProcessed = true;
                    break;
                }
            }

            if(alreadyProcessed){
                continue;
            }

            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    isDuplicate = true ;
                    hasDuplication = true;
                    numberOfAppearance++ ;
                }
            }
            if(isDuplicate){
                System.out.printf("The number %d appeared %d times\n", numbers[i], numberOfAppearance);
                numberOfAppearance = 1 ;
                isDuplicate = false;
            }
        }

        if(!hasDuplication){
            System.out.println("no duplication found in the array");
        }
    }
}
