import java.util.ArrayList;

public class Branch
{
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String branchName)
    {
        this.name = branchName;
        this.customers = new ArrayList<Customer>(500);
    }

    public String getName(){
        return name;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction)
    {
        if(findCustomer(customerName) == null){
            Customer customer = new Customer(customerName, initialTransaction);
            customers.add(customer);
            return true;
        }
        return false;

    }
    public boolean addCustomerTransaction(String customerName, double transaction)
    {
            Customer customer = findCustomer(customerName);
            if (customer != null)
            {
                customer.addTransaction(transaction);
                return true;
            }
            return false;
    }

    private Customer findCustomer(String customerName){
        for (var customer : customers)
        {
            if (customer.getName().equalsIgnoreCase(customerName))
            {
                return customer;
            }
        }
        return null;
    }
}


