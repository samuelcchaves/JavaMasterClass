public class Main {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
    }
    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int min = Math.min(first, second);
        int greatestCommonDivisor = 1;
        for (int j = 1; j <= min; j++) {
            if (first % j == 0 && second % j == 0) {
                greatestCommonDivisor = j;
            }
        }
        return greatestCommonDivisor;
    }
}