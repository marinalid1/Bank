// codeCademy Bank tutorial converted from Python to Java
import java.text.DecimalFormat;

public class Bank {
    // set balance to 0
    double balance = 0;
    // String name
    String name;
    // Decimal Format to properly format balance
    DecimalFormat decimalFormat = new DecimalFormat("0.00");


    // bank constructor
    public Bank(String accountName) {
        this.name = accountName;
    }

    // represents users name and balance
    public void repr() {
        String formattedBalance = decimalFormat.format(this.balance);
        System.out.println(this.name + "'s account balance: $" + formattedBalance);
    }

    // showBalance method displays account's balance
    public void showBalance() {
        System.out.println(this.balance);
    }

    // deposit method adds depoist to balance
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be greater than $0.00");
        } else {
            System.out.println("Deposit Amount: $" + amount);
            this.balance += amount;
            this.showBalance();
        }
    }

    // withdraw method subtracts from balance
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds");
        } else {
            System.out.println("Withdrawl Amount: $" + amount);
            this.balance -= amount;
            this.showBalance();
        }
    }

    public static void main(String[] args) {
        Bank myAccount = new Bank("Account 1");
        System.out.println(myAccount.name);
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        myAccount.repr();
    }
    
}
