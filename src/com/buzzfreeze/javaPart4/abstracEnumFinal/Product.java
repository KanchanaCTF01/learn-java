package com.buzzfreeze.javaPart4.abstracEnumFinal;

public final class Product extends AbstractProductFrontPage {
	public String title;
	public String price;
	public String urlImage;
	public String soldText;
	public ProductStatus.Status productStatus;
	public ProductStatus.PriceStatus priceStatus;

	public Product(String title, String price, String urlImage, String soldText) {
		this.title = title;
		this.price = price;
		this.urlImage = urlImage;
		this.soldText = soldText;

	}

	// final keyword
	final String quality = "Supper good";

	public final String getQuality() {
		return quality;
	}

	@Override
	public String toString() {
		return "Title : " + title + ", Price : " + price + ", " + soldText;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getPrice() {
		return price;
	}

	@Override
	public String getUrlImage() {
		return urlImage;
	}

	@Override
	public String getSoldText() {
		return soldText;
	}

}
