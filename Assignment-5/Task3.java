import javax.security.auth.Subject;

class Student{
    int rollNo;
    String name;
    int mark1;
    int mark2;
    int mark3;

    void calculate(){
        int total = mark1 + mark2 + mark3;
        int average = total / 3;

        if(average >= 80){
            System.out.println("Grade A");
        }
        else if(average >= 60){
            System.out.println("Grade B");
        }
        else if(average >= 40){
            System.out.println("Grade C");
        }else{
            System.out.println("Fail");
        }
    }
}

public class Task3 {
public static void main(String[] args) {
    Student s1 = new Student();
    s1.rollNo = 1;
    s1.name = "Rakesh";
    s1.mark1 = 80;
    s1.mark2 = 40;
    s1.mark3 = 55;
    s1.calculate();

    Student s2 = new Student();
    s2.rollNo = 2;
    s2.name = "Ram";
    s2.mark1 = 99;
    s2.mark2 = 95;
    s2.mark3 = 98;
    s2.calculate();

    Student s3 = new Student();
    s3.rollNo = 3;
    s3.name = "prakash";
    s3.mark1 = 78;
    s3.mark2 = 75;
    s3.mark3 = 72;
    s3.calculate();

    Student s4 = new Student();
    s4.rollNo = 4;
    s4.name = "arvind";
    s4.mark1 = 48;
    s4.mark2 = 45;
    s4.mark3 = 47;
    s4.calculate(); 

    
    Student s5 = new Student();
    s4.rollNo = 5;
    s4.name = "arvind";
    s4.mark1 = 76;
    s4.mark2 = 62;
    s4.mark3 = 58;
    s4.calculate();
}
}
