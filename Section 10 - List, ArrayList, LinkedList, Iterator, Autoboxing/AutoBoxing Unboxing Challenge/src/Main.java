import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){
    public Customer(String name, double initialDeposit)
    {
        this(name.toUpperCase(), new ArrayList<>(500));
        transactions.add(initialDeposit);

    }
}


public class Main {
    public static void main(String[] args) {


        Bank bank = new Bank("Novo Banco S.A");
        bank.addNewCustomer("Rafael Leão", 1000);

        bank.addTransaction("Rafael Leão", 500);

        bank.printStatement("Rafael Leão");
    }


}