package JavaCodeConvention.HomeTask2;

public class BankAccountDebit extends BankAccount{

    BankAccountDebit(String accountname){
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
        accountLimit = 10000;
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
        accountFee = 0.05;
        return withdraw*accountFee;
    }


}
