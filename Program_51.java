//Program 51+52
import java.util.Scanner;
class Vehicle{
    int v_num, in_num;
    String color;

    void getVehicleDetails(int vn, int inum, String c){
        v_num = vn;
        in_num = inum;
        color = c;
    }
    void showDetails(){
        System.out.println("Vehicle Number : "+v_num);
        System.out.println("Insurance Number : "+in_num);
        System.out.println("Color : "+color);
    }
}

class TwoWheeler extends Vehicle{
    float average_ ;
    String type, company;
    void getVehicleDetails(int vn, int inum, String c, float av){
        super.getVehicleDetails(vn, inum, c);
        average_ = av;
    }
    void getType(String type){
        this.type = type;
    }
    void getCompany(String company){
        this.company = company;
    }

    void showDetails(){
        super.showDetails();
        System.out.println("Average : "+average_);
        System.out.println("Type : "+type);
        System.out.println("Company : "+company);       
    }

}

class FourWheeler extends Vehicle{
    float average_ ;
    void getVehicleDetails(int vn, int inum, String c, float av){
        super.getVehicleDetails(vn, inum, c);
        average_ = av;
    }
    void showDetails(){
        super.showDetails();
        System.out.println("Average  : "+average_);      
    }


}

//Main Class
public class Program_51{
    public static void main(String args []){
        TwoWheeler bike = new TwoWheeler();
        Scanner in = new Scanner(System.in);
        System.out.println(">> For Two Wheeler : ");
        System.out.print("Vehicle Number : ");
        int vn = in.nextInt();
        System.out.print("Insurance Number : ");
        int inum = in.nextInt();
        in.nextLine();
        System.out.print("Color : ");
        String c = in.nextLine();
        System.out.print("Average : ");
        float av = in.nextFloat();
        bike.getVehicleDetails(vn, inum, c, av);
        in.nextLine();
        System.out.print("Type : ");
        String type = in.nextLine();
        bike.getType(type);
        System.out.print("Company : ");
        String company = in.nextLine();
        bike.getCompany(company);
        System.out.println("--------Vehicle Details : ----------");
        bike.showDetails();
    }
}


