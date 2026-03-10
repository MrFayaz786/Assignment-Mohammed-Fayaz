
class Product{
    int productId;
    String productName;
    int price;
    int quantity;

    Product(int pId,String pN,int pr,int qu){
    this.productId = pId;
    this.productName = pN;
    this.price = pr;
    this.quantity = qu;
    }
    int calculateTotalPrice(){
        return price * quantity;
    }
}
public class Task2 {
    public static void main(String[] args) {
     Product p1 = new Product(1,"enji",35,2);   
     System.out.println("Total Amount : "+p1.calculateTotalPrice());
     Product p2 = new Product(2,"munch",10,5);
     System.out.println("Total Amount : "+p2.calculateTotalPrice());
    }
}
