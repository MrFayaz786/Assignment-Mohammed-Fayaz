class BankAccount{
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int ac,String acN,int bal){
     this.accountNumber = ac;
     this.accountHolderName = acN;
     this.balance = bal;
    }
    void deposit(double amount){
     balance += amount;
    }
    void displayBalance(){
        System.out.println("Account Balance : "+balance);
    }
}

public class Task4 {
 public static void main(String[] args) {
    BankAccount b1 = new BankAccount(13222321,"saravana",7500);
        b1.displayBalance();
        b1.deposit(3300);
        b1.displayBalance();
 }   
}
