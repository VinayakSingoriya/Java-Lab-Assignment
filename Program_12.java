import java.util.Scanner;
class Program_12{
	public static void main(String args []){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter principle : ");
		float p = in.nextFloat();
		float rate = 5f;
		int T = 10;
		double amount;
		System.out.println("Calculating compund interest with interest rate of 5% for 10 years......");
		for(int year=1; year<=T; year++){
			amount = p*Math.pow(1.0+rate, year);
			System.out.println(year +"> "+amount);
		}		
	}
}