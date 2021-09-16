//Program 49 + 50
import java.util.Scanner;
class Employee{
    String firstName, lastName;

    void getFirstName(String fname){
        firstName = fname;
    }

    void getLastName(String lname){
        lastName = lname;
    }

}

class ContractEmployee extends Employee{
    String department, designation;
    int salary;

    void empDetails(String f, String l){
        super.getFirstName(f);
        super.getLastName(l);
    }

    void getDepartment(String dp){
        department = dp;
    }
    void getDesignation(String dgn){
        designation = dgn;
    }
    void displayFullName(){
        System.out.println("First Name : "+firstName);
        System.out.println("Last Name : "+lastName);
    }
}

class RegularEmployee extends Employee{
    String department, designation;
    int salary;

    void getDepartment(String dp){
        department = dp;
    }
    void getDesignation(String dgn){
        designation = dgn;
    }
    void displayFullName(){
        System.out.println("First Name : "+firstName);
        System.out.println("Last Name : "+lastName);
    }
}

class HourlyEmployee extends ContractEmployee{
    double hour, wages_hr;
    String designation;

    void empDetails(String f, String l){
        super.empDetails(f, l);
    }

    void getHourDetails(double h, double w){
        hour = h;
        wages_hr = w;
    }
    double calculateWages(){
        return (hour*wages_hr);
    }

    void getDesignation(String dgn){
        designation = dgn;
    }
}

class WeeklyEmployee extends ContractEmployee{
    int week, wages_wk;
    String designation;
    void empDetails(String f, String l){
        super.empDetails(f, l);
    }

    void getWeekDetails(int w, int wg){
        week = w;
        wages_wk = wg;
    }
    double calculateWages(){
        return (week*wages_wk);
    }

    void getDesignation(String dgn){
        designation = dgn;
    }
}

// main class
class Program_49{
    public static void main(String [] args){
        HourlyEmployee emp = new HourlyEmployee();
        System.out.println(">> For Hourly Employee : ");
        Scanner in = new Scanner(System.in);
        System.out.print("First Name : ");
        String fname = in.nextLine();
        System.out.print("Last Name : ");
        String lname = in.nextLine();
        emp.empDetails(fname, lname);
        System.out.print("Department: ");
        String dp = in.nextLine();
        emp.getDepartment(dp);
        System.out.print("Designation: ");
        String dsg = in.nextLine();
        emp.getDesignation(dsg);
        System.out.print("Enter number of hours worked : ");
        float n_hours = in.nextFloat();
        System.out.print("Enter wages per hour (INR): ");
        float wages = in.nextFloat();
        emp.getHourDetails(n_hours, wages);
        System.out.println("----Employee Details : -----");
        emp.displayFullName();
        double salary = emp.calculateWages();
        System.out.println("Total salary (INR): "+salary);
        System.out.println("Department : "+emp.department);
        System.out.println("Designation : "+emp.designation);
    }
}