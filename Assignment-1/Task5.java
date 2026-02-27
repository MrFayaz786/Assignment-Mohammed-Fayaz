public class Task5 {
    public static void main(String[] args) {
       System.out.println(validate(0)); 
    }

    private static int validate(int input){
     
     int value;

     if (input > 0) {
        value = input * 2;
     }else{
        value = 0;
     }
     return value;
    }
}
