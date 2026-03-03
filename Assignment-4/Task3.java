import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a number");
    
    int num = in.nextInt();

    int orginalNum = num;

    int sum = 0;
    while (num > 0) {
        int digit = num % 10;
        
        sum = sum+(digit*digit*digit);

        num = num/10;

    }
   if(sum == orginalNum){
    System.out.println("It is a Armstrong Number");
   }else{
    System.out.println("It is not Armstrong Number");
   }
}    
}
