public class Main {
    public static void main(String[] args) {
    System.out.println(getDurationString(3678));
    System.out.println(getDurationString(61, 18));
    }

    public static String getDurationString(int seconds){
        if(seconds < 0) {
            return seconds + " is not a valid time value";
        }
        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        int secondsLeft = seconds % 3600 % 60;
        return hours + "h " + minutes + "m " + secondsLeft + "s";
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes <= 0 ){
            return  minutes + " is not a valid time value for minutes";
        }
        if(seconds <= 0 || seconds > 59){
            return seconds + " is not a valid time value for seconds";
        }
        int totalSeconds = minutes * 60 + seconds;
        return getDurationString(totalSeconds);
    }
}