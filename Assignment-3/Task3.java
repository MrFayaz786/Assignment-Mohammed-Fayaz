import java.util.Scanner;

public class Task3 {
public static int numOfDigits(int num){

    if(num < 10){
        return 1;
    }
    return 1 + numOfDigits(num/10);
}
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    System.out.println("Enter A number : ");
 
    int digit = in.nextInt();

  System.out.println( numOfDigits(digit)); 
}    
}
