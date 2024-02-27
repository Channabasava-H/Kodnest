import java.util.Scanner;

public class TimeConversion01 {

	public static void main(String[] args) {
		
		String time=new Scanner(System.in).next();
		StringBuilder milTym=new StringBuilder();
		String _time=time.substring(0, 8);
		String[] t1=_time.split(":");
		
		if(time.charAt(time.length()-2)=='P') {
			int mtym=12+Integer.parseInt(t1[0]);
			t1[0]=String.valueOf(mtym);
		}
		
		for(int i=0;i<t1.length;i++) {
			milTym.append(t1[i]);
			if(i!=t1.length-1) {
				milTym.append(":");
			}
		}
		
		System.out.println(milTym);
	}

}
