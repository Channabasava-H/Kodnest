package com.kodnest.constructor;

public class CameraApp {

	public static void main(String[] args) {
		Camera cam=new Camera("Black","Sony",50000);
		cam.captureImage();
		cam.displayImage();
	}

}
