package lecture3.examples.interfaceimpl;

public interface Transaction {

    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();
}
