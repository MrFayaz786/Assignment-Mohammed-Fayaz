import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int InitialBalance = 10000;
        System.out.println("Enter withdrawal amount");
    int withdrawal = in.nextInt();
    
    if(withdrawal > InitialBalance){
        System.out.println("Insuffient Balance !");
    }else if(withdrawal <= 0){
        System.out.println("Invalid Amount !");
    }else{
        InitialBalance -= withdrawal;
    }
    System.out.println("Remaining Balance : "+InitialBalance);
}    
}
