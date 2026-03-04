class BankAccount{
    int accountNumber;
    String accountHolderName;
    int balance;

    void deposit(int amt){
      balance += amt;
      System.out.println("Amount Credited : "+amt);
      System.out.println("Balance : "+balance);
    }
    void withDraw(int amt){
    balance -= amt;
    System.out.println("Amount Debited : "+amt);
    System.out.println("Remaining Balance : "+balance);
    }
    void displayBalance(){
        System.out.println("Account Balance : "+balance);
    }
}
public class Task2 {
   public static void main(String[] args) {
    BankAccount b1 = new BankAccount();
    b1.accountNumber = 1;
    b1.accountHolderName = "Kishore";
    b1.balance = 40000;
    b1.deposit(25555);

    BankAccount b2 = new BankAccount();
    b2.accountNumber = 2;
    b2.accountHolderName = "Sakthi";
    b2.balance = 100000;
    b2.withDraw(46060);

    BankAccount b3 = new BankAccount();
    b3.accountNumber = 3;
    b3.accountHolderName = "ramesh";
    b3.balance = 750000;
    b3.displayBalance();
   } 
}
