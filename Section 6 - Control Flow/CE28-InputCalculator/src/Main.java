import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner =  new Scanner(System.in);

        int loopCounter = 0;
        int loopSumCounter = 0;
        while(true){
            try{
                String number = scanner.nextLine();
                loopSumCounter += Integer.parseInt(number);
                loopCounter++;
            }catch (NumberFormatException nfe){
                break;
            }
        }
        double average = (double) loopSumCounter /loopCounter;
        System.out.println("SUM = " + loopSumCounter + " AVG = " + Math.round(average));
    }
}