import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    private static String userInput;
    private static int[] userInputArray;
    private static int minValue;

    public static void main(String[] args)
    {
        int[] myarray = readNumbers();

        System.out.println("Length:  " + myarray);
        System.out.println("Find min:  " + findMin(myarray));


    }

    private static int[] readNumbers()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a comma-delimited set of numbers");
        userInput = scanner.nextLine();
        System.out.println("Here's your list " + userInput);

        String[] userInputArray = userInput.split(",");
        int[] values = new int[userInputArray.length];


        for(int i = 0; i < userInputArray.length; i++){
            values[i] = Integer.parseInt(userInputArray[i].trim());
        }
        return values;
    }

    private static int findMin(int[] input)
    {
        System.out.print("FINDMIN");

        minValue = Integer.MAX_VALUE;
        for (int el : input)
        {
            System.out.print(minValue + " > " + el + " -> ");
            System.out.println(minValue > el ? "Condition met" : "Condition not met");
            if (el < minValue)
            {

                minValue = el;
            }
        }

        return minValue;

    }
}