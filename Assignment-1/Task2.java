import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int marks = in.nextInt();
        String grade ;
        if(marks >= 90){
            grade = "Grade A";
        }
        else if(marks >= 80){
            grade = "Grade B";
        }
        else if(marks >= 60){
            grade = "Grade C";
        }
        else if(marks >= 35){
            grade = "Grade D";
        }
         else{
            grade = "Grade F";
         }

        System.out.println(grade);

    }
}
