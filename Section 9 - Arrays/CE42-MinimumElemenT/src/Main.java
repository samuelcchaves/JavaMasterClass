import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int numberOfElements = readInteger();
        int[] elements = readElements(numberOfElements);
        System.out.println("Minimum element: " + findMin(elements));


    }

    public static int readInteger()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you want to give me? ");
        return scanner.nextInt();

    }

    public static int[] readElements(int elements)
    {
        int[] array = new int[elements];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array)
    {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < minValue)
            {
                minValue = array[i];
            }
        }
        return minValue;
    }

    private static void reverse(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];

        }
    }

}
