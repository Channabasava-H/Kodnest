import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
	
		int arr[]= {10,20,23,26,56,89,76,45,23,49};
		Arrays.sort(arr);
		System.out.println("Sorted Array : "); 
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}


