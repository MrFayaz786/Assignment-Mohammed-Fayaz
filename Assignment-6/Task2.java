class MobileShop{
    String Model;
    int Price;

    MobileShop(){
      Model = "Samsung";
      Price = 20000;
    }
    void display(){
        System.out.println("Model : "+Model);
        System.out.println("Price : "+Price);
    }
}
public class Task2 {
public static void main(String[] args) {
    MobileShop m1 = new MobileShop();
    m1.display();
}    
}
