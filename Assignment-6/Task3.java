class LibrarySystem{
    int MemberID ;
    String MemberShipType;

    LibrarySystem(){
        MemberID = 501;
        MemberShipType = "Regular";
    }
    void display(){
        System.out.println("Member ID : "+MemberID);
        System.out.println("MemberShip Type : "+MemberShipType);
    }
}
public class Task3 {
public static void main(String[] args) {
    LibrarySystem l1 = new LibrarySystem();
    l1.display();
}    
}
