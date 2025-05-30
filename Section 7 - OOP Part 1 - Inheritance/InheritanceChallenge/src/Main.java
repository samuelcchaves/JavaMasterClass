public class Main
{
    public static void main(String[] args)
    {
        Employee tim = new Employee("Tim", "28/05/2002", "27/11/2024");

        System.out.println(tim);
        System.out.println("Age: " + tim.getAge());
        System.out.println("Pay: " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "05/06/2005", "15/12/2024", 50000.0);
        System.out.println(joe);
        System.out.println("Age: " + joe.getAge());
        System.out.println("Pay: " + joe.collectPay());
        joe.retire();
        System.out.println("Joe's pension check " + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck: " + mary.collectPay());
        System.out.println("Mary's Holiday Pay " + mary.getDoublePay());
    }
}