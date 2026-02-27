import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String username = in.nextLine();
        int password = in.nextInt();
        String status;

        if(username.equals("admin") && password == 1234){
            status = "Login Successful";
        }else{
            status = "Login Failed";
        }

        System.out.println(status);
    }
}
