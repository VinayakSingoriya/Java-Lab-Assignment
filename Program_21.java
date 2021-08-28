//Bubble sort
import java.util.*;
class Program_21{
	public static void main(String args []){
		Scanner in = new Scanner(System.in);		
		System.out.print("Enter Numbers : ");
		String s[] = in.nextLine().split(" ");
		int a[] = new int[s.length];
		for (int i=0; i<s.length; i++){
			a[i]= Integer.parseInt(s[i]);
		}
		int result[] = bubbleSort(a, s.length);
		System.out.print("Sorted Numbers : ");
		for(int item : result){
			System.out.print(item+" ");
		}
				
	}
	static int[] bubbleSort(int [] arr, int n){
		int temp, isSwap = 0;
		for (int i=0; i<n; i++){
			isSwap = 0;
			for(int j = 0; j<n-(i+1); j++){
				if (arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwap+=1;
				}
			}
			if(isSwap==0){
				break;
			}
		}
		return arr;
	}
}
