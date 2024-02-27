package com.kodnest.typecasting;

public class char_ {

	public static void main(String[] args) {
		char x = 'a';
		char y; 
		y=x;//No Conversion required
		System.out.println(y);
		
		byte y1;
		//y1=x; Error, implicit conversion not possible
		y1=(byte)x; // Explicit Conversion required,but there is a chance of data loss
		System.out.println(y1);
		
		short y2;
		//y2=x; Error, implicit conversion not possible
		y2=(short)x; // Explicit Conversion required,but there is a chance of data loss
		System.out.println(y2);
		
		int y3;
		//y3=x; Error, implicit conversion not possible
		y3=(int)x; // Explicit Conversion required,but there is a chance of data loss
		System.out.println(y3);
		
		long y4;
		//y4=x; Error, implicit conversion not possible
		y4=(long)x; // Explicit Conversion required,but there is a chance of data loss
		System.out.println(y4);
		
		float y5;
		//y5=x; Error, implicit conversion not possible
		y5=(float)x; // Explicit Conversion required,but there is a chance of data loss
		System.out.println(y5);
		
		double y6;
		//y6=x; Error, implicit conversion not possible
		y6=(double)x; // Explicit Conversion required,but there is a chance of data loss
		System.out.println(y6);

//		boolean y7;
//		y7=x; Error, implicit conversion not possible
//		y7=(boolean)x; //Error, Explicit conversion not possible
//		System.out.println(y7);
	}

}
