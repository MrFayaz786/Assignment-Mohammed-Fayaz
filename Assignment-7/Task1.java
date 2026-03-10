class Employee{
    int empId;
    String empName;
    int salary;

    Employee(int eId, String eN,int sal){
          this.empId = eId;
          this.empName = eN;
          this.salary = sal;
    }
    void displayEmployee(){
        System.out.println("Employee Id : "+empId);
        System.out.println("Employee Name : "+empName);
        System.out.println("Salary : "+salary);
    }
}
public class Task1 {
public static void main(String[] args) {
    Employee e1 = new Employee(1, "Syed", 30000);
    Employee e2 = new Employee(2,"riz",24000);
    Employee e3 = new Employee(3,"isac",50000);
    e1.displayEmployee();
    e2.displayEmployee();
    e3.displayEmployee();
}    
}
