public class Task3 {
      static class EmployeeInfo{

        int empId ;
        int empSal;
       public void bonus(){
           if(empSal >= 20000){
               empSal += 2000;
           }
           else if(empSal >= 10000){
              empSal +=2000;
           }
       }
      } 
   public static void main(String[] args) {
    EmployeeInfo e1 = new EmployeeInfo();
    e1.empId = 1;
    e1.empSal = 20000;
    e1.bonus();
    System.out.println(e1.empSal);
   } 
}


