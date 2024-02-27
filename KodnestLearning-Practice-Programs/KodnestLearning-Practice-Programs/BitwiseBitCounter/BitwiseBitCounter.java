
public class BitwiseBitCounter {
	public static int countSetBits(int x) {
		int count=0;
		while(x>0) {
			count +=x&1;
			x>>=1;
		}
		return count;
	}
}
