class Program_07{
	public static void main(String args []){
		int n = 5;
		Program_07 obj = new Program_07();
		int result = obj.factorial(n);
		System.out.println("Result = "+ result);
	}
	int factorial(int n){
		if (n==1)
			return 1;
		else
			return n*factorial(n-1);
		
	}
}