public class Task4 {
   public static void main(String[] args) {
    int price = 200;
    int quantity = 5;
    int stock = 20;
    int total;
    if(stock > 0){
    total = price*quantity;
    }else{
        total = 0;
    }
    System.out.println(total);
   } 
}
