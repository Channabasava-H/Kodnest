import java.util.Arrays;

public class FillArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,12,45,32};
		Arrays.fill(arr,1,3,3);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
