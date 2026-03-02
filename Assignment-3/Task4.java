import java.util.Scanner;

public class Task4 {
public static int sumofN(int num){

    if(num == 1){
        return 1;
    }
    return num + sumofN(num-1);
}
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    System.out.println("Enter A number : ");
 
    int digit = in.nextInt();

  System.out.println(sumofN(digit)); 
}    
}
