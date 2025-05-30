import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main
{
    private int[] array;

    public static void main(String[] args)
    {
        int[] array = generateRandomArray(3, 3);
        System.out.println(" Initial Array = " + Arrays.toString(array));

        int[] sortedArray = sortArray(array);

    }

    private static int[] generateRandomArray(int size, int bound){
        Random random = new Random();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = random.nextInt(bound);
        }
        return array;


    }

    private static int[] sortArray(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        System.out.println(" Initial Array Sorted = " + Arrays.toString(sortedArray));

        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("        Count: " + i + " State: " + Arrays.toString(sortedArray));
                }


            }
        }
        System.out.println("Initial state: "+ Arrays.toString(array));

        System.out.println("Final state: "+ Arrays.toString(sortedArray));

a
        return sortedArray;



    }
}