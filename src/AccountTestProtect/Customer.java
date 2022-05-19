//p-236(尚硅谷)
package AccountTestProtect;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    //构造器
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account){
        this.account=account;
    }


}
