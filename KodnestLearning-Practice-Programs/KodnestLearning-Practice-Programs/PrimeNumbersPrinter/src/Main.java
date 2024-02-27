import java.util.Scanner;

public class Main {
	public static void printPrimes(int n)

	{
		int i=2;
		int count=0;
		while(count<n)
			{
			
			if(checkPrime(i)) {
					System.out.print(i+" ");
					count++;
				}
				i++;
			}
	}
	
	public static boolean checkPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}	
		}
		return true;
		
	}
	

	public static void main(String[] args) {
		int n=new Scanner(System.in).nextInt();
		printPrimes(n);
		
	} 
	
}
