package com.buzzfreeze.javaPart4.abstracEnumFinal;

public abstract class AbstractProductFrontPage {

	private String shopTitle = "Kanchana Shop";
	private String description = "More informaetion, please contact tell: 02 222 2222 ";

	public abstract String getTitle();
	public abstract String getPrice();
	public abstract String getUrlImage();
	public abstract String getSoldText();

	public void printShopTitle() {
		System.out.println(this.shopTitle);
	}

	public void printDescription() {
		System.out.println(this.description);
	}

}
