import java.util.Scanner;
class CommunityMember{
    String name, address, contact, doj;
    void getName(String n){
        name = n;
    }
    void getAdress(String a){
        address = a;
    }
    void getContact(String c){
        contact = c;
    }
    void getDate_of_join(String d){
        doj = d;
    }
    void showDetails(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Contact : "+contact);
        System.out.println("Date of joining : "+doj);
    }
}

class Employee extends CommunityMember{

    String qualification;
    
    void getQualification(String q){
        qualification = q;
    }
    void showDetails(){
        super.showDetails();
        System.out.println("Qualifications : "+qualification);
    }

    

}

class Student extends CommunityMember{
    String qualification;

    void getQualification(String q){
        qualification = q;
    }

    void showDetails(){
        super.showDetails();
        System.out.println("Qualifications : "+qualification);
    }

    
}

//main class
class Program_53{
    public static void main(String [] args){
        Employee emp = new Employee();
        Scanner in = new Scanner(System.in);
        System.out.print(">> For Employee : ");
        System.out.print("Enter Name : ");
        String name = in.nextLine();
        System.out.print("Enter Address : ");
        String address = in.nextLine();
        System.out.print("Enter contact : ");
        String contact = in.nextLine();
        System.out.print("Enter Date of joining : ");
        String doj = in.nextLine();
        System.out.print("Enter Qualification : ");
        String qua = in.nextLine();
        emp.getName(name);
        emp.getContact(contact);
        emp.getAdress(address);
        emp.getDate_of_join(doj);
        emp.getQualification(qua);
        System.out.println("---Details: ----------");
        emp.showDetails();




    }
}