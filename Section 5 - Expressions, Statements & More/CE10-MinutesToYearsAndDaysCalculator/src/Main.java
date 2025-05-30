public class Main {
    public static void main(String[] args) {
        printYearsAndDays(527441);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0) {
            System.out.println("Invalid value");
        }

        long numberOfYears = minutes / 525600;
        long numberOfDays = minutes % 525600 / 1440;
    // XX min = YY y and ZZ d
        System.out.println(minutes + " min = " + numberOfYears + " y and " + numberOfDays + " d " );
    }
}