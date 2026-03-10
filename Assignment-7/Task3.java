class Student{
    int studentId;
    String studentName;
    int marks;

    Student(int id, String name,int mark){
    this.studentId = id;
    this.studentName = name;
    this.marks = mark;
    }

    void calculateGrade(){
        if(marks >= 90){
         System.out.println("Grade A");
        }
        else if(marks >= 75){
            System.out.println("Grade B");
        }
        else if(marks >= 50){
        System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
public class Task3 {
public static void main(String[] args) {
    Student s1 = new Student(1,"suresh",74);
    s1.calculateGrade();
    Student s2 = new Student(1,"rajes",91);
    s2.calculateGrade(); 
}    
}
