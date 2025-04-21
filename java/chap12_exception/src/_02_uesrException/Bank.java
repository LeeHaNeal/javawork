package _02_uesrException;

public class Bank {
    private int balance;

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws UesrException {
        if (balance >= money)
            balance -= money;
        else
            throw new UesrException("잔고 부족: " + (money - balance) + " 모자람");
    }

    public void getBalance() {
        System.out.println("잔액: " + balance);
    }
}
