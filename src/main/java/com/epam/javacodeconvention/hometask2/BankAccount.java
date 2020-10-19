package com.epam.javacodeconvention.hometask2;


//"Create a Banking Application classes: the hierarchy should contains an abstract bank account class with an ability to add money, to withdraw and to calculate a payment fee.
// Create different account plans with customizable fee amount and an ability to limit withdrawal: debit account – it is impossible to get more money than the account currently has,
// credit account – it is possible to get a credit line for this account.
// The fees should be 1% for debit account and 1% for credit account type in case of positive balance and 5% in case of negative balance.
// Create a special class which will print the account logs using the Observer pattern (https://en.wikipedia.org/wiki/Observer_pattern).
// Create a test application which will use all application features."


abstract class BankAccount {

    final Observer checkForMoney;
    Double accountMoney = 0.0;
    Integer accountLimit;
    Double accountFee;


    BankAccount(String accountName) {
        String accountName1 = accountName + ".txt";
        // create observer for account
        checkForMoney = new AccountObserver(accountName1);
    }


    abstract Double addMoney(Double money);

    abstract String withdraw(Double amountMoney);

    public Double calculatePaymentFee(Double withdraw) {
        return withdraw * accountFee;
    }


}
