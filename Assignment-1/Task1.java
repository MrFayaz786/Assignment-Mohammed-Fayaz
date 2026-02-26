import java.util.Scanner;

public class Task1 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        double amount = in.nextInt();

        double discountPercent = 10;

        if (amount > 5000){
        
        double discount = (discountPercent*amount)/100;

        double price = amount - discount;

        System.out.println("Price : "+price);

        }else{
            
            System.out.println("No Discount Applied!");

        }

    }
    
}

