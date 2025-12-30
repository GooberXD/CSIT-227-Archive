// Write a banking application with a method that throws a custom InsufficientFundsException 
// if the account balance is insufficient for a withdrawal.

// Class - InsufficientFundsException (extends Exception):

// Constructor:
// public InsufficientFundsException(): Calls the constructor of Exception using 
// super() to set a default error message. Uses super() to set the exception 
// message to "Insufficient funds for withdrawal."
 

// Class - BankAccount:

// Private Property:
// private double balance: Stores the balance in the bank account.
// Constructor:
// public BankAccount(double initialBalance): Initializes balance with initialBalance.
// Method withdraw:
// Parameter:
// double amount - the amount to withdraw from the account.
// Throws InsufficientFundsException if the withdrawal amount is greater than the balance.
// Decreases balance by amount if the withdrawal is successful.
// Prints "Withdrawal successful. Remaining balance: <balance>" upon successful withdrawal.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); // Initialize account with a balance of $1000

        try {
            // Simulate some withdrawal operations
            account.withdraw(500.0);
            account.withdraw(800.0); // This will throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}