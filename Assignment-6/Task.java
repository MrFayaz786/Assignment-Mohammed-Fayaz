class Employee{
    int EmployeeID;
    String EmployeeName;
    
    Employee(){
        EmployeeID = 100;
        EmployeeName = "Not Assigned";
    }

    void display(){
        System.out.println("Employee ID : "+EmployeeID);
        System.out.println("Employee Name : "+EmployeeName);
    }
}
public class Task {
public static void main(String[] args){
    Employee e1 = new Employee();
    e1.display();
}    
}
