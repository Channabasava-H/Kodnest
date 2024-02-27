package P3;

public class PowerOfDigit {
	public static int powerOfDigit(int n, int digit) {
		int finalResult=1;
		while(digit-->0) {
			finalResult=finalResult*n;
		}
		return finalResult;
	}
	
	public static int countDigit(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		return count;
	}
}
