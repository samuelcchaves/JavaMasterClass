import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] newArray = new int[]{5, 10, 20, 30};
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(reverseArray(newArray)));

    }



    private static int[] reverseArray(int[] array){
        int[] reverseArray = new int[array.length];
        int length = array.length - 1;
        for(int i = 0; i < array.length; i++){
            reverseArray[i] = array[length-i];

        }
    return reverseArray;
    }
}