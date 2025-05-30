public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // true (shared digit: 2)
        System.out.println(hasSharedDigit(15, 55)); // true (shared digit: 5)
        System.out.println(hasSharedDigit(12, 45)); // false
        System.out.println(hasSharedDigit(99, 99)); // true (shared digit: 9)
        System.out.println(hasSharedDigit(9, 99));
    }

    public static boolean hasSharedDigit(int a, int b){
        if(a < 10 || a > 99 || b < 10 || b > 99){
            return false;
        }

        int firstDigitA = a / 10;
        int lastDigitA = a % 10;

        int firstDigitB = b / 10;
        int lastDigitB = b % 10;

        return (firstDigitA == firstDigitB || firstDigitA == lastDigitB || lastDigitA == firstDigitB || lastDigitA == lastDigitB);


    }
}