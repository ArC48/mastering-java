package lecture3.examples.interfaceimpl;

public class TransactionTest {

    public static void main(String[] args) {
        Transaction bog = new BogTransaction();
        Transaction tbc = new TbcTransaction();

        bog.deposit(100);
        tbc.deposit(200);

        bog.withdraw(10);
        tbc.withdraw(150);

        bog.getBalance();
        tbc.getBalance();
    }
}
