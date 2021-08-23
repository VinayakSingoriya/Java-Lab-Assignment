class Program_03{
	public static void main(String args []){
		int a = 3;
		int b = 10;
		int c = 2;
		int d = 30;
		int e = 15;
		if (a>b&&a>c&&a>d&&a>e)
			System.out.println("A is greatest integer.");
		else if(b>c&&b>d&&b>e)
			System.out.println("B is greatest integer.");
		else if(c>d&&c>e)
			System.out.println("D is greatest integer.");
		else if(d>e)
			System.out.println("D is greatest integer.");
		else
			System.out.println("E is greatest integer.");			
	}
}