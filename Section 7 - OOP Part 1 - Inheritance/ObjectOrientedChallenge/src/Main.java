public class Main {
    public static void main(String[] args) {
        BankAccount samuelAccount = new BankAccount("123", 1000.0, "Samuel Chaves", "samuelcchaves@email",
                "351912428087");

        samuelAccount.depositFund(100);
        samuelAccount.withdrawFunds(200);

        System.out.println(samuelAccount.getAccountBalance());

    }}