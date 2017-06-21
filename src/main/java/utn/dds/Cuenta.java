package utn.dds;

/**
 * Created by sebastianrosenberg on 6/21/17.
 */
public class Cuenta {

    private Integer balance;


    public Cuenta() {
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Cuenta(Integer balance) {
        super();
        this.balance = balance;
    }

    public void withdraw(int money) {
        balance -= money;
    }
}
