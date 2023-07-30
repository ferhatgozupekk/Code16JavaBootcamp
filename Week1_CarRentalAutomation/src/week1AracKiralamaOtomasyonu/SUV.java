package week1AracKiralamaOtomasyonu;

public class SUV extends Araba{

	public SUV(int bagajKapasitesi, int gunlukUcret, int model, String renk) {
		super(bagajKapasitesi, gunlukUcret, model, renk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void kiralamaHesap(int kiralanacakGün) {
		if (getModel()<2018) {
			System.out.println((kiralanacakGün*getGunlukUcret())*0.9);
		}
		else if (getModel()>=2018) {
			System.out.println((kiralanacakGün*getGunlukUcret())*0.8);
		}
		else {
			System.out.println("hatali bir giris yaptiniz");
		}
	}

	
}
