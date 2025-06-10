//* program on multiple inheritance using a BankAccount and SavingsAccount 
//* scenario.

// Interface defining interest-related operations
interface InterestAccount {
    void setInterestRate(double interestRate);

    void addInterest();
}

// Base class representing a generic bank account
class BankAccount {
    String name; // Account holder's name
    String accountNumber = "318202822"; // Account number (auto-incremented)
    String accountType; // Type of account (e.g., Saving)
    double balance; // Current balance
    double interestRate; // Interest rate

    // Constructor to initialize name and balance
    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;

        // Automatically assign next account number
        accountNumber = Integer.toString(Integer.parseUnsignedInt(accountNumber) + 1);
    }

    // Deposit amount into account
    void deposit(double amount) {
        balance += amount;
        System.out.println("Rs" + amount + " is added to A/c");
    }

    // Withdraw amount from account if sufficient balance
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Rs" + amount + " is withdrawn from A/c");
        } else {
            System.out.println("Balance Insufficient");
        }
    }

    // Display current balance
    void getBalance() {
        System.out.println("Current balance = Rs" + balance);
    }
}

class SavingsAccount extends BankAccount implements InterestAccount {

    // Constructor to initialize name, balance, and interest rate
    SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance); // Call the constructor of BankAccount
        this.interestRate = interestRate;
        accountType = "Saving";
    }

    // Set the interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Add interest to the balance
    public void addInterest() {
        balance += balance * interestRate / 100;
        System.out.println("\nInterest added at rate " + interestRate + "%");
    }

    // Display account information
    void showInfo() {
        System.out
                .println("A/C No: " + accountNumber + ", Name: " + name + ", Balance: " + balance + ", Interest Rate: "
                        + interestRate);
    }
}

// Main class to test the functionality
public class p16_Multiple_Inheritance {

    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount s1 = new SavingsAccount("Shailav Malik", 1000.00, 2.25);
        s1.deposit(100);
        s1.withdraw(500);
        s1.showInfo();
        s1.addInterest();
        s1.showInfo();

    }

}
