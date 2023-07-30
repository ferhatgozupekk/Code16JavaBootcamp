package week1AracKiralamaOtomasyonu;

public class Araba {
	private int bagajKapasitesi;
	private int gunlukUcret;
	private int model;
	private String renk;
	
	public Araba(int bagajKapasitesi, int gunlukUcret, int model, String renk) {
		this.bagajKapasitesi = bagajKapasitesi;
		this.gunlukUcret = gunlukUcret;
		this.model = model;
		this.renk = renk;
	}

	public int getBagajKapasitesi() {
		return bagajKapasitesi;
	}

	public void setBagajKapasitesi(int bagajKapasitesi) {
		this.bagajKapasitesi = bagajKapasitesi;
	}

	public int getGunlukUcret() {
		return gunlukUcret;
	}

	public void setGunlukUcret(int gunlukUcret) {
		this.gunlukUcret = gunlukUcret;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	public void kiralamaHesap(int kiralanacakGün) {
		System.out.println("herhangi bir indrim söz konusu değil");
		System.out.println("toplam tutar: " + kiralanacakGün*gunlukUcret);
	}
	
	
	
}
