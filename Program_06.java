class Program_06{
	public static void main(String args []){
		int result = 1;
		for (int i = 2; i<=15; i++){
			if (i%2==1)
				result *= i;
			else
				continue;
		}
		System.out.println("Product of Integers from 1-15 is =  "+ result);
	}
}