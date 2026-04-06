import java.util.*;

public class Task2 {
public static void main(String[]args){

    Scanner in = new Scanner(System.in);
    
    String username = "User13";
    
    String password = "User@1312";
    
    int attempt = 0;
    
    int maxAttempt = 3;

    
    
        while(attempt < maxAttempt){
         try{

             System.out.println("Enter UserName:");
             
             String nameIn = in.nextLine();
             
             if(!nameIn.equals(username)){ 
                 
                 attempt++;
     
                 throw new Exception("Invalid UserName");
     
             }
     
             System.out.println("Enter Password:");
         
             String passIn = in.nextLine();
     
             if(!passIn.equals(password)){
            
                 attempt++;
     
                 throw new Exception("Invalid Password");
             
             }
     
             System.out.println("Login Successfull");
     
             return;
             
         }
         catch (Exception e) {
            
          System.out.println("Too Many Attempt Program Terminated");
          
          System.exit(0);

         }
    

}    

