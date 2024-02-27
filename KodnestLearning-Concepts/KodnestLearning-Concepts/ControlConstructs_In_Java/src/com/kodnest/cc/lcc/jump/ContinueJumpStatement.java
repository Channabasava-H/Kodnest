package com.kodnest.cc.lcc.jump;

public class ContinueJumpStatement {

	public static void main(String[] args) {
		System.out.println("Start");
		for(int i=1;i<=5;i++) {
			if(i==3) {
			System.out.println("Kodnest ");
			continue;
			}
			System.out.println("Technologies");
		}

	}

}

//continue will make the control to look back.