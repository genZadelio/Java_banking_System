public class Banking 
{
    private double balance;

    public Banking(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Banking myBank = new Banking(1000.0);
        System.out.println("Initial Balance: " + myBank.getBalance());
        myBank.deposit(500.0);
        System.out.println("Balance after deposit: " + myBank.getBalance());
        myBank.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + myBank.getBalance());
        myBank.withdraw(1500.0); // Attempt to withdraw more than balance
    }
}