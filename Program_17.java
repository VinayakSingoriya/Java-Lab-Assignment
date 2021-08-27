import java.util.Scanner;
class Program_17{
	public static void main(String args []){
		Program_17 obj = new Program_17();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = in.nextInt();
		obj.fibonacci(number);		
	}
	void fibonacci(int num){
		int a=0, b=1, c;
		System.out.print(a+" "+b+" ");
		
		for(int i=0; i<num-1; i++){
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}		
	}
}
