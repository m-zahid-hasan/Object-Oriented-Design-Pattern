
import java.util.HashMap;
import java.util.Map;

public class BankService {
    private Map<Integer, IAccount> bankAccounts;
    private int accountCounter;

    public BankService() {
        this.bankAccounts = new HashMap<>();
        this.accountCounter = 1; // Start with account number 1
    }

    public Integer createNewAccount(String type, Double initAmount) {
        IAccount newAccount = null;

        switch (type.toLowerCase()) {
            case "chequing":
                newAccount = new Chequing(initAmount);
                break;
            case "saving":
                newAccount = new Saving(initAmount);
                break;
            case "investmen":
                newAccount = new Investment(initAmount);
                break;
            default:
                System.out.println("Invalid account type");
                return null;
        }

        if (newAccount != null) {
            int accountNumber = accountCounter++;
            bankAccounts.put(accountNumber, newAccount);
            return accountNumber;
        }
        return null; // Return null to indicate failure
    }

    public IAccount getAccountByAccountNumber(int accountNumber) {
        return bankAccounts.get(accountNumber);
    }
}

