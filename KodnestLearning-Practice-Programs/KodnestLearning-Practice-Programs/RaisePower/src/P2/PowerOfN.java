package P2;

public class PowerOfN {

	public static int raisePowerOfN(int N, int n) {
		// TODO Auto-generated method stub
		int finalResult=1;
		while(n-->0) {
			finalResult=finalResult*N;
		}
		return finalResult;
	}
}
