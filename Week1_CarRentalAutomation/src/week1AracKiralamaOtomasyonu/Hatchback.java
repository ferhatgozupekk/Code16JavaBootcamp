package week1AracKiralamaOtomasyonu;

import org.w3c.dom.ls.LSOutput;

public class Hatchback extends Araba {

	public Hatchback(int bagajKapasitesi, int gunlukUcret, int model, String renk) {
		super(bagajKapasitesi, gunlukUcret, model, renk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void kiralamaHesap(int kiralanacakGün) {
		// TODO Auto-generated method stub
		if (kiralanacakGün == 1) {
			System.out.println(getGunlukUcret());
		}
		else {
			System.out.println("hatchbak arabalar sadece gunluk kiralanabiliyor.");
		}
		
	}

}
