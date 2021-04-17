package com.buzzfreeze.javaPart2.inheritanceReuse;

public class iPhone8 extends iPhone {

	public static void main(String[] args) {
		PhoneCall();
		SMS();
		InternetSurfing();
		AppStore();
		TouchID();

	}
	public static void TouchID() {
		System.out.println("TouchID()");
	}

}
