class Employee{
    int empId;
    String empName;
    float basicSalary;

    void salaryCal(){
        float HRA = 0.20f*basicSalary;
        float DA = 0.10f*basicSalary;
        float GrossSalary = basicSalary + HRA + DA;
        if(basicSalary > 50000){
            float bonus = 0.05f*basicSalary;
            GrossSalary += bonus;
        }
        System.out.println("Gross Salary : "+GrossSalary);
    }
}

public class Task1 {
public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.empId = 1;
    e1.empName = "Raj";
    e1.basicSalary = 51000;
    e1.salaryCal();

    Employee e2 = new Employee();

    e2.empId = 2;
    e2.empName = "ganesh";
    e2.basicSalary = 22000;
    e2.salaryCal();

    Employee e3 = new Employee();
    
    e3.empId = 3;
    e3.empName = "Niran";
    e3.basicSalary = 10350;
    e3.salaryCal();
}  

}
