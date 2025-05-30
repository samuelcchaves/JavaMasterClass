import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] myArray = new int[5];
        int[] anotherArray = myArray;
        System.out.println("myArray = " + Arrays.toString(myArray));
        System.out.println("anotherArray = " + Arrays.toString(myArray));

        anotherArray[0] = 1;
        System.out.println("\n\nAfter change in anotherArray ");

        System.out.println("myArray = " + Arrays.toString(myArray));
        System.out.println("anotherArray = " + Arrays.toString(myArray));

        modifyArray(myArray);
        System.out.println("\n\nAfter change in myArray trought a method ");

        System.out.println("myArray = " + Arrays.toString(myArray));
        System.out.println("anotherArray = " + Arrays.toString(myArray));


    }

    public static void modifyArray(int[] array){
        array[2] = 99;
    }



}