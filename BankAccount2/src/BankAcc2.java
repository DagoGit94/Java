

public class BankAcc2 {
    // Fields
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private double interestRate;
    private String accountType;
    private int yearOpened;

    //Constructor


    public BankAcc2(String accountNumber, String accountHolder, double balance, String accountType,
                    double interestRate, int yearOpened) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
        this.interestRate = interestRate;
        this.yearOpened = yearOpened;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getYearOpened() {
        return yearOpened;
    }

    // toString
    @Override
    public String toString(){
        return "Account number "+accountNumber+ ""+
                "Account Holder "+accountHolder+""+
                "Balance $"+balance+ ""+
                "Interest Rate "+interestRate+ ""+
                "Account type "+accountType+ ""+
                "Year opened "+yearOpened;
    }

  //
  // Method 1: Check if account is overdrawn
  public boolean isOverdrawn(){
        return balance < 0;

  }
    // Method 2: Calculate annual interest
  public double calculateInterest(){
        return balance * interestRate/100;

  }
    // Method 3: Print statement
  public void printStatement(){
      System.out.println(" The account number "+accountNumber+ " hold by "+accountHolder+ " has a current balance of $"+balance);
  }
    // Method 5: Check if same account type
  public boolean isOldAccount(){
        int currentYear = 2026;
        return (currentYear-getYearOpened()) > 10;

  }

    // Method 5: Check if same account type
  public boolean isSameType(BankAcc2 otherAccount){
        return this.accountType.equals(otherAccount.getAccountType());

  }
    // Method 6: Deposit money
  public void deposit(double amount){
      if (amount > 0){
          this.balance+= amount;
          System.out.println("Deposit $"+amount+ ".New balance: $"+balance);
      }

  }
    // Method 7: Withdraw money
  public boolean withdraw(double amount){
        if (amount <=0){
            System.out.println("Error: Withdrawal amount must be positive");
            return false;
        }
        if (this.balance >= amount){
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            return true;
        } else{
            System.out.println("Error: Insufficient funds. Current balance: $" + balance);
            return false;
        }

  }
    // Method 8: Get balance category
  public String getBalanceCategory(){
        if (balance <0){
            return "Negative";

        }else if (balance < 1000){
            return "Low";

        }else if (balance < 10000){
            return "Medium";

        }else{
            return "High";
        }
  }
    // Method 9: Apply interest to balance
  public void applyInterest(){
        double interest = calculateInterest();
        this.balance +=interest;
        System.out.println("Applied interest: $" + interest + ". New balance: $" + balance);
    }
    //Method 10: Check whether can transfer to another account
    public boolean canTransferTo(BankAcc2 otherAccount, double amount){
        if (amount <= 0){
            System.out.println("Error: Transfert amount must be positive");
            return false;
        }
        return this.balance >=amount;
    }
   // Method 11 : Compare balance with another account
    public BankAcc2 compareBalance(BankAcc2 otherAccount){
        if (this.balance > otherAccount.getBalance()){
            return this;
        }else{
            return otherAccount;
        }
    }
    // Method 12: Check if premium customer
    public boolean isPremiumCustomer(){
        int currentYear = 2026;
        int age = currentYear - yearOpened;
        return balance > 50000 || (age > 10 && balance >10000);
    }
    // Method 13: Transfer money to another account
    public void transferTo(BankAcc2 otherAccount, double amount) {
        if (amount <= 0) {
            System.out.println("Error: Transfer amount must be positive");
            return;
        }

        if (this.balance >= amount) {
            this.balance -= amount;
            otherAccount.balance += amount;
            System.out.println("Transferred $" + amount + " to account " + otherAccount.accountNumber);
            System.out.println("Your new balance: $" + this.balance);
        } else {
            System.out.println("Error: Insufficient funds for transfer");
        }
    }

    // Method 14: Calculate account age
    public int accountAge() {
        int currentYear = 2026;
        return currentYear - yearOpened;
    }

    // Method 15: Check if same account holder
    public boolean hasSameHolder(BankAcc2 otherAccount) {
        return this.accountHolder.equals(otherAccount.accountHolder);
    }
}

