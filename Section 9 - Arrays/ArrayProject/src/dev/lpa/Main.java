package dev.lpa;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;

        myIntArray[5] = 50;


        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("First = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of array = " + arrayLength);
        System.out.println("Last = "+ firstTen[arrayLength-1]);

        int[] newArray;
        newArray = new int[5];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = newArray.length - i;
        }
        for(int i = 0; i< newArray.length; i++){
            System.out.println(newArray[i] + " ");
        }

        System.out.println("-".repeat(30) + "\n");
        for(int element : newArray){
            System.out.print(element + " ");
        }
        System.out.println("-".repeat(30) + "\n");

        System.out.println(Arrays.toString(newArray));

        Object objectVar = newArray;
        if(objectVar instanceof int[]){
            System.out.println("objectVar is really an int array");
        }
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;


    }
}