import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,23,26,56,89,76,45,23,49};
		
		int element=56;
		
		System.out.println(element+" present at index : "
						+Arrays.binarySearch(arr, element));

	}

}
