public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("1234", 1000.0, "Default name", "Default email", "Default PhoneNumber"
                );
        System.out.println("Empty constructor called");

    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void depositFund(double amount){
        this.accountBalance += amount;
        System.out.println("Deposit of " + amount + "€ made. New balance is " + this.accountBalance + "€");
    }

    public void withdrawFunds(double amount){
        if(this.accountBalance - amount < 0){
            System.out.println("Insufficient funds. You have only " + this.accountBalance + "€ available") ;
        }else{
            this.accountBalance -= amount;
            System.out.println(amount + "€ withdrawed from the account. New balance is " + this.accountBalance + "€");
        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


}
