package techin.lt.pd9_1;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("LT12232321414", "Emilija");
        System.out.println(myAccount.getBalance());
        myAccount.deposit(500);
        System.out.println(myAccount.getBalance());
        myAccount.deposit(256);
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.withdraw(500));
        System.out.println(myAccount.getBalance());

    }
}
