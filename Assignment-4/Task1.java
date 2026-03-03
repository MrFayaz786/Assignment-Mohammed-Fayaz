import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = in.nextInt();

        int count = 0;

        while(num != 0){
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
