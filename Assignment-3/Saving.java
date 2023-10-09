public class Saving implements IAccount{
    private Double balance;
  

    public Saving(Double balance){
        this.balance=balance;
        
    }

    @Override
    public void deposit(Double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited "+amount+" into savings account.");   
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }


    @Override
    public void withdraw(Double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawn "+amount+" from saving account.");
        }
        else{
            System.out.println("Insufficient funds or invalid withdrawel amount.");
        }
    }


    @Override
    public double getBalance (){
        return  balance;
    }
}

