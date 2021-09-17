// Program 61
import java.util.Scanner;

interface Vehicle{
    void getColor( String c);
    void getNumber(int num);
    double getConsumption(float totalDistance, float average );
}

class TwoWheeler implements Vehicle{

    String color;
    int number;
    public void getColor(String c){
        color = c;
    }
    public void getNumber(int num){
        number = num;
    }
    public double getConsumption(float totalDistance, float average ){
        return (totalDistance/average);
    }

    public void showDetails(){
        System.out.println("Number : "+number);
        System.out.println("Color : "+color);       
    }
    

}

class FourWheeler implements Vehicle{
    String color;
    int number;
    public void getColor(String c){
        color = c;
    }
    public void getNumber(int num){
        number = num;
    }
    public double getConsumption(float totalDistance, float average ){
        return (totalDistance/average);
    }

    void showDetails(){
        System.out.println("Number : "+number);
        System.out.println("Color : "+color);       
    }
    
}

//main class
class Program_61{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        TwoWheeler obj = new TwoWheeler();
        System.out.println(">>For two wheeler");
        System.out.print("Color : ");
        String color = in.nextLine();
        obj.getColor(color);
        System.out.print("Number : ");
        int num = in.nextInt();
        obj.getNumber(num);
        System.out.print("Total distance travelled (in km): ");
        float distance = in.nextFloat();
        System.out.print("Average of vehicle (in km/h): ");
        float average = in.nextFloat();
        System.out.println("-----Vehicle Details : -------");
        obj.showDetails();
        double fuelconsumed = obj.getConsumption(distance, average);
        System.out.print("Fuel consumed (in litres): "+fuelconsumed);
        
    }
}