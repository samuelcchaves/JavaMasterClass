import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        int[] firstArray = getRandomArray(10, 10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));

        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10, 10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        String key = "Mark";
        if(Arrays.binarySearch(sArray, key) >= 0){
            System.out.println("Found " + key + " in the list.");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {5,2,3,4,1};
        if(Arrays.equals(s1, s2)){
            System.out.println("This arrays - " + Arrays.toString(s1) + " and " + Arrays.toString(s2)+ " - are equal");
        }else{
            System.out.println("This arrays - " + Arrays.toString(s1) + " and " + Arrays.toString(s2)+ " - are different");

        }


    }

    private static int[] getRandomArray(int len, int bound){
        Random random = new Random();
        int[] intArray = new int[len];
        for(int i = 0; i < len; i++){
            intArray[i] = random.nextInt(bound);
        }
        return intArray;
    }
}