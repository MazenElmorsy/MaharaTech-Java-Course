package Arrays.Exercises;


public class ReverseArray {
    public static void main(String[] args){

        String[] fruits = {"apple", "banana", "coconut", "watermelon", "mango"};
        String[] reversedFruits = new String[fruits.length];
        int index = 0 ;

        for(int i = fruits.length - 1; i >= 0 ; i--){
            reversedFruits[index] = fruits[i] ;
            index++;
        }


        System.out.println("original fruits: ");
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }

        System.out.println("\nReversed fruits: ");
        for(String fruit : reversedFruits){
            System.out.print(fruit + " ");
        }
    }
}
