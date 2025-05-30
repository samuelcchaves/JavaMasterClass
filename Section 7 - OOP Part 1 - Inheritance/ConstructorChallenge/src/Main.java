public class Main {
    public static void main(String[] args)
    {
       Customer customer = new Customer("Samuel", 100.0, "samuelemail@.com");

       System.out.println(customer.getName());
       System.out.println(customer.getCreditLimit());
       System.out.println(customer.getEmail());


    }
}