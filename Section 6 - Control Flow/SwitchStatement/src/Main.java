public class Main {
    public static void main(String[] args) {
        int switchValue = 5;
        // Traditional switch statements
        switch (switchValue) {
            case 1:
                System.out.println("Switch value is 1");
                break;
            case 2:
                System.out.println("Switch value is 2");
            case 3:
                System.out.println("Switch value is 3");
            case 4:
            case 5:
            case 6:
                System.out.println("Switch value is 4, 5 or 6 ");
                System.out.println("It is precisely " + switchValue);
            default:
                System.out.println("None of the switch case values was found.");
        }

        natoReplacement('a');

        // Enhanced switch statement

        switch (switchValue) {
            case 1 -> System.out.println("Switch value is 1");
            case 2 -> System.out.println("Switch value is 2");
            case 3 -> System.out.println("Switch value is 3");
            case 4, 5, 6 -> System.out.println("Switch value is 4, 5, 6");
            default -> System.out.println("None of the switch case values was found");
        }

        System.out.println(getQuarterMonth("MAY"));
        printDayOfWeek(0);
    }

    public static String getQuarterMonth(String month) {
            /*
                traditional switch
            switch(month){
                case "JANUARY":
                case "FEBRUARY":
                case "MARCH":
                    return "1st";
                case "APRIL":
                case "MAY":
                case "JUNE":
                    return "2nd";
                case "JULY":
                case "AUGUST":
                case "SEPTEMBER":
                    return "3rd";
                case "OCTOBER":
                case "NOVEMBER":
                case "DECEMBER":
                    return "4th";
                default:
                    return "The month " + month + " is not valid";

            } */
        // enhanced switch
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "The month " + month + " is not valid";
        };
    }

    // switch challenge

    // nato standardized alphabet to replace a character or letter


    public static void natoReplacement(char letter) {
        switch (letter) {
            case 'a':
                System.out.println("Able");
                break;
            case 'b':
                System.out.println("Baker");
                break;
            case 'c':
                System.out.println("Charlie");
                break;
            case 'd':
                System.out.println("Dog");
                break;
            case 'e':
                System.out.println("Easy");
                break;
            case 'f':
                System.out.println("Fox");
                break;
            case 'g':
                System.out.println("George");
                break;
            case 'h':
                System.out.println("How");
                break;
            case 'i':
                System.out.println("Item");
                break;
            case 'j':
                System.out.println("Jig");
                break;
            case 'k':
                System.out.println("King");
                break;
            case 'l':
                System.out.println("Love");
                break;
            case 'm':
                System.out.println("Mike");
                break;
            case 'n':
                System.out.println("Nan");
                break;
            case 'o':
                System.out.println("Oboe");
                break;
            case 'p':
                System.out.println("Peter");
                break;
            case 'q':
                System.out.println("Queen");
                break;
            case 'r':
                System.out.println("Roger");
                break;
            case 's':
                System.out.println("Sugar");
                break;
            case 't':
                System.out.println("Tare");
                break;
            case 'u':
                System.out.println("Uncle");
                break;
            case 'v':
                System.out.println("Victor");
                break;
            case 'w':
                System.out.println("William");
                break;
            case 'x':
                System.out.println("X-Ray");
                break;
            case 'y':
                System.out.println("Yoke");
                break;
            case 'z':
                System.out.println("Zebra");
                break;
            default:
                System.out.println(letter + " is not valid ");


        }

    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }
}