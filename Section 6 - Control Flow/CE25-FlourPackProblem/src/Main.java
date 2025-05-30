public class Main {
    public static void main(String[] args) {
        System.out.println(canPack (1, 0, 4));
        System.out.println(canPack (1, 0, 5));
        System.out.println(canPack (0, 5, 4));
        System.out.println(canPack (2, 2, 11));
        System.out.println(canPack (-3, 2, 12));

        System.out.println(canPack (2, 7, 18));

    }

    // big count - 5 kilos
    // smallCount - 1 kilos
    // goal - how much kilos are needed
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        int maxBigBagsUsed = Math.min(goal / 5, bigCount); // Use as many big bags as possible without exceeding goal
        int remainingWeight = goal - (maxBigBagsUsed * 5); // Calculate remaining weight to be filled by small bags

        return smallCount >= remainingWeight;

    }
}