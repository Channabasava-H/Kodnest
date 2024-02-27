package BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={16,22,23,48,55};
		int key=48;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
		int mid=(low+high)/2;
		
		if(key==arr[mid]) {
			System.out.println("Key "+key+"found at "+mid+" index.");
			return;
		}
		else if(key>arr[mid]) {
			low=mid+1;
		}
		else {
			high=mid-1;
		}
		
		}
		System.out.println("Key not found");
		
	}

}
