public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int by3And5 = 0;
        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                sum+= i;
                System.out.println(i + " is divisible by 3 and 5 simultaneosly");
                by3And5++;
            }

            if(by3And5 == 5){
                break;
            }
        }
        System.out.println("The sum of the numbers divisible by 3 and 5 is: " + sum);

    }
}