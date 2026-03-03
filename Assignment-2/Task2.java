class AccountInfo{

double balance;

public void WithDraw(double amt){
if(amt <= balance){
   balance-=amt;
   double taken = amt;
   System.out.println("Successfully Withdrawn :"+taken);
}else{
   System.out.println("Insufficient Balance");
}
}
}
public class Task2 {
    
  public static void main(String[] args) {
    AccountInfo c1 = new AccountInfo();
    c1.balance= 5000.00;
    c1.WithDraw(500);
    System.out.println(c1.balance);

  }  
}
