import java.util.Scanner;
class shapeArea{
	//Circle
	float area(float r){
		 return (float)(3.14*r*r);		
	}
	//Rectangle
	float area(float l, float b){
		return (float)(l*b);
	}
	//Triangle
	float area(int x, float b, float h){
		return (float)(0.5*b*h);
	}
	
}

class Program_11{
	public static void main(String args []){
		Scanner in = new Scanner(System.in);
		shapeArea obj = new shapeArea();
		System.out.println("Enter 1 for area of Circle >");
		System.out.println("Enter 2 for area of Rectangle >");
		System.out.println("Enter 3 for area of Traingle >");
		System.out.print("Enter : ");
		int choice = in.nextInt();
		switch(choice){
			case 1:
				System.out.print("Enter Radius : ");
				float r = in.nextFloat();
				float areaCircle = obj.area(r);
				System.out.println("Area of circle is : " + areaCircle);
				break;
			case 2:
				System.out.print("Enter Length : ");
				float l = in.nextFloat();
				System.out.print("Enter Breadth: ");
				float b = in.nextFloat();
				float areaRect = obj.area(l, b);
				System.out.println("Area of Rectangle is : " + areaRect);
				break;
			case 3:
				System.out.print("Enter Base : ");
				float B = in.nextFloat();
				System.out.print("Enter Height: ");
				float h = in.nextFloat();
				float areaTraingle = obj.area(0, B, h);			
				System.out.println("Area of Traingle is : " + areaTraingle);
				break;
			default:
				System.out.println("Invalid Choice.");
		}
		
	}
}