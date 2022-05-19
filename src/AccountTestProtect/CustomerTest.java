//p-236(尚硅谷)
package AccountTestProtect;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("tom", "Smith");

        Account account = new Account(867909501, 1000, 0.023);

        customer.setAccount(account);
        customer.getAccount().desposit(100);//存钱
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

    }
}
