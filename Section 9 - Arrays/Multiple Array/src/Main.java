import java.util.Arrays;

public class Main
{
    private static int width = 5;
    private static int heigth = 5;

    public static void main(String[] args)
    {
        int[][] array = new int[width][heigth];

        System.out.println(Arrays.toString(array));
        System.out.println("Length " + array.length);
        separator("-", 20);
        for(int[] outer : array)
        {
            System.out.println(Arrays.toString(outer));
        }
        separator("-", 20);

        array[width-1][0] = 50;

        for (int i = 0; i < array.length; i++)
        {
            var inner = array[i];
            for(int j = 0; j < inner.length; j++){
                array[i][j] = (i * 10) + (j + 1);
                System.out.print(" | " + array[i][j] + " | ");
            }
            System.out.println();
        }
        separator("-", 20);



        for(var outer : array){
            for(var element : outer){
                System.out.print(" | " + element + " | ");
            }
            System.out.println();

        }

        separator("-", 20);

        System.out.println(Arrays.deepToString(array));
        array[1] = new int[] {10,20,30};
        System.out.println(Arrays.deepToString(array));

        Object[] objArray = new Object[3];
        System.out.println(Arrays.deepToString(objArray));

        separator("-", 20);


        objArray[0] = new String[] {"a","b","c"};
        System.out.println(Arrays.deepToString(objArray));

        objArray[1] = new String[][] {{"1","2"},{"3","4","5"},{"6","7","8","9"}};
        System.out.println(Arrays.deepToString(objArray));

        objArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(objArray));
        separator("-", 20);



        for(Object element : objArray){
            System.out.println("Element type: " + element.getClass().getSimpleName());
            System.out.println("Element toString(): " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
            separator("*", 5);

        }
    }

    private static void separator(String delimiter, int count)
    {
        System.out.println();
        System.out.println(("" + delimiter + "").repeat(count));

    }
}