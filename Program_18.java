import java.util.Scanner;
public class Program_18
{

	int power(int x, long y)
	{
		if( y == 0)
			return 1;
		if (y%2 == 0)
			return power(x, y/2)*power(x, y/2);
		return x*power(x, y/2)*power(x, y/2);
	}

	int order(int x)
	{
		int n = 0;
		while (x != 0)
		{
			n++;
			x = x/10;
		}
		return n;
	}

	boolean isArmstrong (int x)
	{
		
		int n = order(x);
		int temp=x, sum=0;
		while (temp!=0)
		{
			int r = temp%10;
			sum = sum + power(r,n);
			temp = temp/10;
		}


		return (sum == x);
	}

	
	public static void main(String[] args)
	{
		Program_18 ob = new Program_18();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int x = in.nextInt();
		System.out.println(ob.isArmstrong(x));

	}
}
