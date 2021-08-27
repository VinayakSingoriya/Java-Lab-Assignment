import java.util.Scanner;
class Program_16{
	public static void main(String args []){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = in.nextInt();
		int result = factorial(number);
		System.out.println("Factorial of a "+ number +" is :"+result);
		
	}
	static int factorial(int num){
		if (num==1 || num==0)
			return 1;
		else
			return num*factorial(num-1);
	}
}