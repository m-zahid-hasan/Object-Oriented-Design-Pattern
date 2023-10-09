
public class Customer{
    public static void main(String args[]) {


        BankService bankService=new BankService();


        // Create Saving account ,account Number=1;
        int accountNumber=bankService.createNewAccount("saving",100.0);
        System.out.println("\n\nSaving Account Number :"+accountNumber);

        IAccount account=bankService.getAccountByAccountNumber(1);
        System.out.println("Balance of saving Account :"+account.getBalance());

        //Deposit in Saving account
        account.deposit(500.0);
       

        // Withdraw in saving account
        account.withdraw(300.0);

        //Create Investment account
        int invesAccountNumber=bankService.createNewAccount("investmen",400.0);
        System.out.println("\n\nInvestment accountNumber "+invesAccountNumber);

        IAccount account2=bankService.getAccountByAccountNumber(invesAccountNumber);
        
        //deposite Investment account
        account2.deposit(5000.0);


        //Withdraw from Investment account
        account2.withdraw(300.0);


        



    }
}
