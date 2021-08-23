class Program_09{
	public static void main(String args []){
		Program_09 obj1 = new Program_09();
		obj1.selection();
		obj1.iteration();
		obj1.transfer();
		
	}
	void selection(){
		int n = 2;
		switch(n){
			case 1:
				System.out.println("Selection is Done.\n");
				break;
			case 2:
				System.out.println("Selection is Done.\n");
				break;
			default:
				System.out.println("Selection is Done.\n");
			
		}
	}
	void iteration(){
		for (int i=0; i<=5; i++){
			System.out.println(i);
		}
		System.out.println("iteration is Done.\n");
	}
	void transfer(){
		for (int i=0; i<=5; i++){
			continue;
		}
		System.out.println("Transfer is Done.\n");
	}
}