package Oops_encapsulation;


class BankAccount {
    private double balance;

  
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    
    public double getBalance() {
        return balance;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }
}

public class bank_problem {

    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(1000);

        
        System.out.println("Initial Balance: $" + account.getBalance());

       
        account.deposit(500);

       
        System.out.println("Updated Balance after deposit: $" + account.getBalance());
        
        account.withdraw(200);

       
        System.out.println("Updated Balance after withdrawal: $" + account.getBalance());
    }
}

