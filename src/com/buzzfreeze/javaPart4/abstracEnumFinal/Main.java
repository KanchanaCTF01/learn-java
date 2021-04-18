package com.buzzfreeze.javaPart4.abstracEnumFinal;

public class Main {

	public static void main(String[] args) {

		Product a = new Product("iPhoneX", "34,000", "xxx", "Sold 10");
		a.productStatus = ProductStatus.Status.PUBLISH;
		a.priceStatus = ProductStatus.PriceStatus.DISCOUNT;

		System.out.println(a);
		System.out.println("Product status is " + a.productStatus);
		System.out.println("Price status is " + a.priceStatus);

	}

}
