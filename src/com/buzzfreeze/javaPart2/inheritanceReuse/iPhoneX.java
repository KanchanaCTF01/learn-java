package com.buzzfreeze.javaPart2.inheritanceReuse;

public class iPhoneX extends iPhone {

	public static void main(String[] args) {
		PhoneCall();
		SMS();
		InternetSurfing();
		AppStore();
		FaceID();

	}
	public static void FaceID() {
		System.out.println("FaceID()");
	}
}
