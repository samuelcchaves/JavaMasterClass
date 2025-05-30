import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(getInputFromConsole(2025));

        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(2025));
        }
    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");


        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear- Integer.parseInt(dateOfBirth);

        return "So you are "+ age + " years old";

        // java src/Main.java
    }

    public static String getInputFromScanner(int currentYear){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");


        System.out.println("What year were you born? ");
        boolean validDob = false;

        int age = 0;

        do{
            System.out.println("Enter a year of birth >= " + (currentYear-125) + " and  <=" + (currentYear));
            String dateOfBirth = scanner.nextLine();

            try{
                age = checkData(currentYear, dateOfBirth);
                validDob = age < 0 ? false : true;
            }catch(NumberFormatException badUserData){
               System.out.println("Characters are not allowed. Try Again!");
            }

        }while(!validDob);


        return "So you are "+ age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }

        return (currentYear - dob);

    }}