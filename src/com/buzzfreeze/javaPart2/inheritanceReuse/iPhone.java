package com.buzzfreeze.javaPart2.inheritanceReuse;

public class iPhone extends MobilePhone {

	public static void main(String[] args) {
		PhoneCall();
		SMS();
		InternetSurfing();
		AppStore();

	}
	public static void AppStore() {
		System.out.println("AppStore()");
	}

}
