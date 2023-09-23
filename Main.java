import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        PersonalAccount p1 = new PersonalAccount(99,"Gomer");
        p1.deposit(99.0);
        p1.withdraw(33.0);
        System.out.println(p1.getBalance());
        p1.printTransactionHistory();

    }
}
