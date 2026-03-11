

public static void main(String[] args){

    // Create Accounts
    BankAcc2 account1 = new BankAcc2("7327409421", "James Varrick", 5000.0,"Savings",2.5,2018);
    BankAcc2 account2 = new BankAcc2("7345091236","Bobby Lash",-200.0,"Checking",1.5,2020);
    BankAcc2 account3 = new BankAcc2("7921638192","Pierro de Souza",75000.0,"Business",3.0,2010);

    // Test 1: isOverdrawn()
    System.out.println("=== Test 1: isOverdrawn() ===");
    System.out.println("Is account1 overdrawn? " + account1.isOverdrawn());
    System.out.println("Is account2 overdrawn? " + account2.isOverdrawn());
    System.out.println();

    // Test 2: calculateInterest()
    System.out.println("=== Test 2: calculateInterest() ===");
    System.out.println("Account1 annual interest: $" + account1.calculateInterest());
    System.out.println("Account2 annual interest: $" + account2.calculateInterest());
    System.out.println();

// Test 3: printStatement()
    System.out.println("=== Test 3: printStatement() ===");
    account1.printStatement();
    account2.printStatement();
    account3.printStatement();
    System.out.println();

    // Test 4: isOldAccount()
    System.out.println("=== Test 4: isOldAccount() ===");
    System.out.println("Is account1 old? " + account1.isOldAccount());
    System.out.println("Is account3 old? " + account3.isOldAccount());
    System.out.println();

    // Test 5: isSameType()
    System.out.println("=== Test 5: isSameType() ===");
    System.out.println("Account1 and Account2 same type? " + account1.isSameType(account2));
    System.out.println();

    // Test 6: deposit()
    System.out.println("=== Test 6: deposit() ===");
    System.out.println("Account1 balance before deposit: $" + account1.getBalance());
    account1.deposit(500);
    System.out.println("Account1 balance after deposit: $" + account1.getBalance());
    account1.deposit(-100);
    System.out.println();

    // Test 7: withdraw()
    System.out.println("=== Test 7: withdraw() ===");
    System.out.println("Account1 balance: $" + account1.getBalance());
    System.out.println("Withdraw $2000: " + account1.withdraw(2000));
    System.out.println("New balance: $" + account1.getBalance());
    System.out.println("Withdraw $10000: " + account1.withdraw(10000));
    System.out.println("Balance after failed withdrawal: $" + account1.getBalance());
    System.out.println();

    // Test 8: getBalanceCategory()
    System.out.println("=== Test 8: getBalanceCategory() ===");
    System.out.println("Account1 balance category: " + account1.getBalanceCategory());
    System.out.println("Account2 balance category: " + account2.getBalanceCategory());
    System.out.println("Account3 balance category: " + account3.getBalanceCategory());
    System.out.println();

    // Test 9: applyInterest()
    System.out.println("=== Test 9: applyInterest() ===");
    System.out.println("Account1 balance before interest: $" + account1.getBalance());
    account1.applyInterest();
    System.out.println("Account1 balance after interest: $" + account1.getBalance());
    System.out.println();

    System.out.println("=== Test 10: canTransferTo() ===");
    System.out.println("Can account1 transfer $1000 to account2? " + account1.canTransferTo(account2, 1000));
    System.out.println("Can account2 transfer $1000 to account1? " + account2.canTransferTo(account1, 1000));
    System.out.println();

    // Test 11: compareBalance()
    System.out.println("=== Test 11: compareBalance() ===");
    BankAcc2 richer = account1.compareBalance(account3);
    System.out.println("The account with higher balance: " + richer.getAccountNumber() + " ($" + richer.getBalance() +"");
    System.out.println();

    // Test 12: isPremiumCustomer()
    System.out.println("=== Test 12: isPremiumCustomer() ===");
    System.out.println("Is account1 premium? " + account1.isPremiumCustomer());
    System.out.println("Is account3 premium? " + account3.isPremiumCustomer());
    System.out.println();


    // Test 13: transferTo()
    System.out.println("=== Test 13: transferTo() ===");
    System.out.println("Before transfer:");
    System.out.println("Account1 balance: $" + account1.getBalance());
    System.out.println("Account2 balance: $" + account2.getBalance());

    account1.transferTo(account2, 1000);

    System.out.println("After transferring $1000 from account1 to account2:");
    System.out.println("Account1 balance: $" + account1.getBalance());
    System.out.println("Account2 balance: $" + account2.getBalance());
    System.out.println();

    // Test 14: accountAge()
    System.out.println("=== Test 14: accountAge() ===");
    System.out.println("Account1 age: " + account1.accountAge() + " years");
    System.out.println("Account3 age: " + account3.accountAge() + " years");
    System.out.println();

    // Test 15: hasSameHolder()
    System.out.println("=== Test 15: hasSameHolder() ===");
    System.out.println("Account1 and Account2 same holder? " + account1.hasSameHolder(account2));
    System.out.println("Account1 and Account3 same holder? " + account1.hasSameHolder(account3));
    System.out.println();

    // Test toString()
    System.out.println("=== Testing toString() ===");
    System.out.println("Account1: " + account1.toString());
    System.out.println("Account2: " + account2.toString());
    System.out.println("Account3: " + account3.toString());


   }





