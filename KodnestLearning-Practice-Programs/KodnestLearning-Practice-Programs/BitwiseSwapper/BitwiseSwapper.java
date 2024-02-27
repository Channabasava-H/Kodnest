
public class BitwiseSwapper {
	public static void swapUsingBitwise(int x,int y) {
		int z=x^y;
		System.out.println("After swapping: First = "+(z^x)+", Second = "+(z^y));
	}
}
