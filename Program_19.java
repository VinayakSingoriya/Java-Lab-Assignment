import java.util.Scanner;
class Program_19{
	public static void main(String args []){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = in.nextInt();
		int i = 2;
		boolean isPrime = true;
		while(i<=num/2){
			if(num%i==0){
				isPrime = false;
				break;
			}
			i++;
		}
		if(isPrime==true)
			System.out.println(num + " is Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
		
	}
}