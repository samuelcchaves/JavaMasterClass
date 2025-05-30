import java.util.ArrayList;
import java.util.Arrays;

/*


Bank


listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions) and returns a boolean. Return true if the branch exists or false otherwise. This method prints out a list of customers
*/
public class Bank
{
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name)
    {
        this.name = name;
        this.branches = new ArrayList<Branch>(500);
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null)
        {
            Branch branch = new Branch(branchName);
            branches.add(branch);
            return true;
        }
            return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null)
        {
            branch.newCustomer(customerName, initialTransaction);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null)
        {
            branch.addCustomerTransaction(customerName, transaction);
            return true;
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null)
        {
            for (var customer : branch.getCustomers()){
                System.out.println(customer.getName());
                if(printTransactions){
                    System.out.println(customer.getTransactions());
                }
            }
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName)
    {
        for (var branch : branches)
        {
            if (branch.getName().equalsIgnoreCase(branchName))
            {
                return branch;
            }
        }
        return null;
    }
}

