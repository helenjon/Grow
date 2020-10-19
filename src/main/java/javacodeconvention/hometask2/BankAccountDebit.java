package javacodeconvention.hometask2;

public class BankAccountDebit extends BankAccount {

    BankAccountDebit(String accountName) {
        super(accountName);
    }

    @Override
    public Double addMoney(Double money) {
        TestException belowZero = new TestException();
        try {
            belowZero.testException(money);
            accountMoney = accountMoney + money;
            checkForMoney.objectAddMoney(accountMoney.toString());
            return accountMoney;
        } catch (MeException e) {
            checkForMoney.exceptionInfo(e.myFirstException());
            return accountMoney;
        }
    }

    @Override
    String withdraw(Double amountMoney) {
        accountLimit = 10000;
        if (amountMoney < accountMoney && amountMoney <= accountLimit) {
            accountMoney = accountMoney - amountMoney;
            checkForMoney.objectWithdrawMoney(amountMoney.toString());
            return amountMoney.toString();
        }
        if (amountMoney > accountMoney) {
            checkForMoney.objectWithdrawMoney("not enough money ");
            return "Not enough money ";
        }
        if (amountMoney > accountLimit) {
            checkForMoney.objectWithdrawMoney("Limit ");
            return "Limit for this type of account ";
        }
        return "";
    }

    @Override
    public Double calculatePaymentFee(Double withdraw) {
        accountFee = 0.05;
        return withdraw * accountFee;
    }
}
