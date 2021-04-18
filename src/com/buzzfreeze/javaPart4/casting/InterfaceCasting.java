package com.buzzfreeze.javaPart4.casting;

public class InterfaceCasting {

	public static void main(String[] args) {
		CEO kan = new CEO("Kanchana","Saengdaeng", "CEO", 30000);
		IWebsiteCreator prog = new Programmer("Malai", "Sukdee", "UX", 40000);
		Programmer prog2 = (Programmer) prog;
		AI sung = new AI("Sangwan", "Sang");
		IWebsiteCreator sung2 = sung;
		
		kan.orderWebsite(prog);
		kan.orderWebsite(prog2);
		kan.orderWebsite(sung);
		kan.orderWebsite(sung2);
		
	}

}
