package lecture3.examples.interfaceimpl;

public class BogTransaction implements Transaction {

    private int balance = 0;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Bog transaction deposited " + amount + " to " + balance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Bog transaction withdrawn " + amount + " to " + balance);
    }

    @Override
    public double getBalance() {
        System.out.println("Bog balance is " + balance);
        return balance;
    }
}
