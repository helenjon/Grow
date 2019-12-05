package JavaCodeConvention.HomeTask2;

//"Create a Banking Application classes: the hierarchy should contains an abstract bank account class with an ability to add money, to withdraw and to calculate a payment fee.
// Create different account plans with customizable fee amount and an ability to limit withdrawal: debit account – it is impossible to get more money than the account currently has,
// credit account – it is possible to get a credit line for this account.
// The fees should be 1% for debit account and 1% for credit account type in case of positive balance and 5% in case of negative balance.
// Create a special class which will print the account logs using the Observer pattern (https://en.wikipedia.org/wiki/Observer_pattern).
// Create a test application which will use all application features."



class BankAccountCredit extends BankAccount {


    BankAccountCredit(String accountname){
        super(accountname);
    }

    @Override
    public Double addMoney(Double money){
        accountMoney = accountMoney + money;
        checkForMoney.objectAddMoney(accountMoney.toString());
        return accountMoney;
    }


    @Override
    String withdraw(Double ammountMoney) {
        accountLimit = 1000;
        if (ammountMoney<accountMoney && ammountMoney<=accountLimit) {
            accountMoney  = accountMoney - ammountMoney;
            checkForMoney.objectWithdrawMoney(ammountMoney.toString());
            return ammountMoney.toString();
        }
        if (ammountMoney>accountMoney){
            checkForMoney.objectWithdrawMoney("not money");
            return "Not enough money";
        }
        if (ammountMoney>accountLimit){
            checkForMoney.objectWithdrawMoney("Limit");
            return "Limit for this type of account";
        }
        return "test";

        }

    @Override
    public Double calculatePaymentFee(Double withdraw){
        accountFee = 0.005;
        return withdraw*accountFee;
    }


}


