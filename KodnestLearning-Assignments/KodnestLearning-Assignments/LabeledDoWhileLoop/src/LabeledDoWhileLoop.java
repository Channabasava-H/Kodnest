
public class LabeledDoWhileLoop {

	public static void main(String[] args) {
		int j=0;
		System.out.println("Start...");
		loop1: do {
					int i=0;
					loop2: do {
								System.out.print("Kodnest ");
								break loop1;
							}while(i++<5);
					//System.out.println();
				}while(j++<5);
		System.out.println("Ended");
	}
}
