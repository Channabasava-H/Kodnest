
public class Pattern_Assign3_31Aug {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			for(int j=1;j<=5;j++) {
				for(int i=1;i<=5;i++) {
					if(j==1 || j==5 || i==1 || i==5 || (j==2 && i==2) || (j==3 && i==3) || (j==4 && i==4) ) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}

}
