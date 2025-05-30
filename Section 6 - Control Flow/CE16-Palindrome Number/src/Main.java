public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number){
        if(number < 0){
            number = -number;
        }

        int originalNumber = number;
        int reversedNumber = 0;

        System.out.println(number);

        while(number > 0){
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}