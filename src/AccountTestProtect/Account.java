//p-236(尚硅谷)
package AccountTestProtect;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    //写方法

    public void withdraw(double amount) {//取钱
        if (amount > balance) {
            System.out.println("对不起，你余额不足");
        } else {
            balance -= amount;
            System.out.println("取钱成功");
        }
    }

    public void desposit(double amount) {//存钱
        balance += amount;
        System.out.println("存款成功");
    }
}
