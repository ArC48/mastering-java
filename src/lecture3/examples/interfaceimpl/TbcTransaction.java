package lecture3.examples.interfaceimpl;

public class TbcTransaction implements Transaction {

    private int balance = 0;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Tbc transaction deposited " + amount + " to " + balance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Tbc transaction withdrawn " + amount + " to " + balance);
    }

    @Override
    public double getBalance() {
        System.out.println("Tbc balance is " + balance);
        return balance;
    }
}
