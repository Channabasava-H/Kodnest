
public class V {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if((j+i==n && i<=n/2) || (i-j==0 && i<=n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
