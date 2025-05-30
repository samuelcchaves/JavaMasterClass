public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int evenSum = 0;

        do{
            int lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                evenSum += lastDigit;
            }
            number /= 10;
        }while(number != 0);


        return evenSum;
    }

}