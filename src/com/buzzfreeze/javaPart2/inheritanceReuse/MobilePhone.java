package com.buzzfreeze.javaPart2.inheritanceReuse;

public class MobilePhone {

	public static void main(String[] args) {
		PhoneCall();
		SMS();
		InternetSurfing();

	}
	
	public static void PhoneCall() {
		System.out.println("PhoneCall()");
	}
	
	public static void SMS() {
		System.out.println("SMS()");
	}
	
	public static void InternetSurfing() {
		System.out.println("InternetSurfing()");
	}

}
