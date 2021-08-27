//Selection sort
import java.util.*;
class Program_20{
	public static void main(String args []){
		Scanner in = new Scanner(System.in);		
		System.out.print("Enter Numbers : ");
		String s[] = in.nextLine().split(" ");
		int a[] = new int[s.length];
		for (int i=0; i<s.length; i++){
			a[i]= Integer.parseInt(s[i]);
		}
		int result[] = selectionSort(a, s.length);
		System.out.print("Sorted Numbers : ");
		for(int item : result){
			System.out.print(item+" ");
		}
				
	}
	static int[] selectionSort(int [] arr, int n){
		int temp, min=arr[0], counter=0, loc=0;
		for(int i=0; i<n; i++){
			counter=0;
			min = arr[i];
			for(int j = i+1; j<n; j++){
				if(min>arr[j]){
					min = arr[j];
					loc = j;
					counter+=1;
				}
			}
			if(counter>0){
				temp = arr[i];
				arr[i] = min;
				arr[loc] = temp;
			}
		}
		return arr;
	}
}
