package SearchingSorting;

public class SelectionSort {
	
	public static int[] selectionSort(int arr[]) {
		for(int i=0;i<=arr.length-2;i++) {
			
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]<min) {
					min=arr[j];
					pos=j;
				}
			}
			arr[pos]=arr[i];
			arr[i]=min;
		}
		
		return arr;
	}
}
