public class Main {
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }
        if(year % 4 == 0){
            if(year % 100 != 0){
                return true;
            }else {
                if (year % 400 == 0){
                    return true;
                }else {
                    return false;
                }
            }
        }else{
            return false;
        }

    }

    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12){
            return -1;
        }
        if(year < 1 || year > 9999){
            return -1;
        }

        switch (month) {
            case 1,3,5,7,8,10,12:
                return 31;
            case 2:
                if(isLeapYear(year)){
                    return 29;
                }else{
                    return 28;
                }
            default:
                return 30;

        }

    }
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(8, 2020));
    }
}