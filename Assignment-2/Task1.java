
class StudentInfo{
String name;
int rollNumber;
 void marks(int mark1,int mark2,int mark3){
int total = mark1 + mark2 + mark3;
System.out.println("Marks : "+total);
}

}
public class Task1 {

    public static void main(String[] args) {

        StudentInfo s1 = new StudentInfo();
    s1.name = "Jack";
    s1.rollNumber = 21; 
    System.out.println("Name : "+s1.name);   
    System.out.println("Roll Number : "+s1.rollNumber);   
    s1.marks(20,30,40);  
    }
  
}
