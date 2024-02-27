
public class Palindrome {
	public static boolean checkPalindrome(int n) {
		int original=n;
		int reverse=0;
		while(n>=1) {
			reverse=reverse*10+(n%10);
			n=n/10;
		}
		if(original==reverse) {
			return true;
		}
		else {
			return false;
		}
	}
}
