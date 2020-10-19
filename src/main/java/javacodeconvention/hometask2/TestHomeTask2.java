package javacodeconvention.hometask2;


public class TestHomeTask2 {


    public static void main(String[] arg) {


        BankAccount MargoOne = new BankAccountCredit("MargoOne");

        System.out.println("Account money = " + MargoOne.addMoney(-1200.0));
        System.out.println("Account money = " + MargoOne.addMoney(1200.0));
        System.out.println(MargoOne.withdraw(800.0));
        System.out.println(MargoOne.withdraw(1100.0));
        System.out.println("PaymentFee = " + MargoOne.calculatePaymentFee(1100.0));


        BankAccount MargoSecond = new BankAccountDebit("MargoSecond");

        System.out.println("Account money = " + MargoSecond.addMoney(1300.0));
        System.out.println(MargoSecond.withdraw(800.0));
        System.out.println(MargoSecond.withdraw(1100.0));
        System.out.println("PaymentFee = " + MargoSecond.calculatePaymentFee(1100.0));


    }


}
