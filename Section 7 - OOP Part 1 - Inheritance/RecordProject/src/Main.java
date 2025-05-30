public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        for(int i = 1; i<= 5; i++){
            LPAStudent s = new LPAStudent("s92300" + i,
                    switch(i){
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "JavaMasterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "JavaMasteclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", JAVA OCP Exam 829 ");
       // recordStudent.classList(recordStudent.classList() + ", JAVA OCP Exam 829");



        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}