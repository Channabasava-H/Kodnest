
public class AmstrongNumber {
	public static int calculateAmstrong(int n) {
		int digitCount=countDigit(n);
		int sum=0;
		int digit;
		while(n!=0) {
			digit=n%10;
			int power=1;
			int i=0;
			while(i++<digitCount) {
				
					power=power*digit;
				
				}
				sum=sum+power;
				n=n/10;
		}
		return sum;
	}
	
	
	
	public static int countDigit(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}
}
