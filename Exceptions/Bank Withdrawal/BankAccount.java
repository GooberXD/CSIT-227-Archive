public class BankAccount{
    private double balance;
    
    
    public BankAccount(double InitialBalance){
        this.balance = InitialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance){
            throw new InsufficientFundsException();
        }
        
        else{
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
        
    }    
}