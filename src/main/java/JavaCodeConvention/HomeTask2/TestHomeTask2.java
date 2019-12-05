package JavaCodeConvention.HomeTask2;


import java.io.IOException;

public class TestHomeTask2 {



    public static void main(String [] arg) {


        BankAccount MargoOne = new BankAccountCredit("MargoOne");

        System.out.println(MargoOne.addMoney(1200.0));
        System.out.println(MargoOne.addMoney(1200.0));
        System.out.println(MargoOne.withdraw(800.0));
        System.out.println(MargoOne.withdraw(1100.0));
        System.out.println(MargoOne.calculatePaymentFee(1100.0));


        BankAccount MargoSecond = new BankAccountDebit("MargoSecond");

        System.out.println(MargoSecond.addMoney(1300.0));
        System.out.println(MargoSecond.withdraw(800.0));
        System.out.println(MargoSecond.withdraw(1100.0));
        System.out.println(MargoSecond.calculatePaymentFee(1100.0));


    }


}
