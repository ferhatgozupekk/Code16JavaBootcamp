package week1AracKiralamaOtomasyonu;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Kirala {
	public void arabaKirala(){
		Sedan sedan1 = new Sedan(100, 400, 2018, "kirmizi");
		Sedan sedan2 = new Sedan(150, 500, 2020, "siyah");
		Sedan sedan3 = new Sedan(200, 300, 2014, "beyaz");
		
		SUV suv1 = new SUV(200, 600, 2022, "beyaz");
		SUV suv2= new SUV(250, 750, 2023, "kirmizi");
		SUV suv3= new SUV(250, 550, 2017, "yeşil");
		 
		Hatchback hatchback1 = new Hatchback(120, 450, 2015, "siyah");
		Hatchback hatchback2 = new Hatchback(150, 650, 2020, "beyaz");
		Hatchback hatchback3 = new Hatchback(130, 550, 2017, "kirmizi");
		
		System.out.println("kim icin kiraliyorsunuz ? lutfen seciminizi yapin.\n 1. sirket \n 2.sahis \n");
		Scanner scanner = new Scanner(System.in);
		int secim = scanner.nextInt();
		
		if (secim == 1) {
		
			System.out.println("lutfen hangi model aractan kiralamak istediginizi seciniz:");
			System.out.println("Tum modellerimiz assagidadir.");
			System.out.println("------------------------------");
			System.out.println("1.sedan arabalar");
			System.out.println("2.suv arabalar");
			System.out.println("3.hatchback arabalar");
			
			int secim2 = scanner.nextInt();
			if (secim2 == 1) {
				System.out.println("1.sedan arabalar");
				System.out.println("------------------------------");
				System.out.println("1. "+ "renk: " + sedan1.getRenk() + " gunluk ucret:" + sedan1.getGunlukUcret() + " bagaj kapasitesi:" + sedan1.getBagajKapasitesi()+ " model: " +sedan1.getModel() );
				System.out.println("2. "+ "renk: " + sedan2.getRenk() + " gunluk ucret:" + sedan2.getGunlukUcret() + " bagaj kapasitesi:" + sedan2.getBagajKapasitesi()+ " model: " +sedan2.getModel() );
				System.out.println("3. "+ "renk: " + sedan3.getRenk() + " gunluk ucret:" + sedan3.getGunlukUcret() + " bagaj kapasitesi:" + sedan3.getBagajKapasitesi()+ " model: " +sedan3.getModel() );
				System.out.println("lutfen hangı araci kiralamak istediginizi seciniz:");
				int secim3 = scanner.nextInt();
					if (secim3 == 1) {
						System.out.println("araci kac gün kıralamak istiyorsunuz:");
						int secim4 = scanner.nextInt();
						sedan1.kiralamaHesap(secim4);
					
					}
					else if (secim3 == 2) {
						System.out.println("araci kac gün kıralamak istiyorsunuz:");
						int secim4 = scanner.nextInt();
						sedan2.kiralamaHesap(secim4);
					
					}
					else if (secim3 == 3) {
						System.out.println("araci kac gün kıralamak istiyorsunuz:");
						int secim4 = scanner.nextInt();
						sedan3.kiralamaHesap(secim4);
					
					}
					else {
						System.out.println("hatali bir secim yaptiniz");
					}
			}
			else if (secim2 == 2) {
				System.out.println("2.suv arabalar");
				System.out.println("------------------------------");
				System.out.println("1. "+ "renk: " + suv1.getRenk() + " gunluk ucret:" + suv1.getGunlukUcret() + " bagaj kapasitesi:" + suv1.getBagajKapasitesi()+ " model: " +suv1.getModel() );
				System.out.println("2. "+ "renk: " + suv2.getRenk() + " gunluk ucret:" + suv2.getGunlukUcret() + " bagaj kapasitesi:" + suv2.getBagajKapasitesi()+ " model: " +suv2.getModel() );
				System.out.println("3. "+ "renk: " + suv3.getRenk() + " gunluk ucret:" + suv3.getGunlukUcret() + " bagaj kapasitesi:" + suv3.getBagajKapasitesi()+ " model: " +suv3.getModel() );
				int secim3 = scanner.nextInt();
				if (secim3 == 1) {
					System.out.println("araci kac gün kıralamak istiyorsunuz:");
					int secim4 = scanner.nextInt();
					suv1.kiralamaHesap(secim4);
				
				}
				else if (secim3 == 2) {
					System.out.println("araci kac gün kıralamak istiyorsunuz:");
					int secim4 = scanner.nextInt();
					suv2.kiralamaHesap(secim4);
				
				}
				else if (secim3 == 3) {
					System.out.println("araci kac gün kıralamak istiyorsunuz:");
					int secim4 = scanner.nextInt();
					suv3.kiralamaHesap(secim4);
				
				}
				else {
					System.out.println("hatali bir secim yaptiniz");
				}
			
			}
			else if (secim2 == 3) {
				System.out.println("3.hatchback arabalar");
				System.out.println("------------------------------");
				System.out.println("1. "+ "renk: " + hatchback1.getRenk() + " gunluk ucret:" + hatchback1.getGunlukUcret() + " bagaj kapasitesi:" + hatchback1.getBagajKapasitesi()+ " model: " +hatchback1.getModel() );
				System.out.println("2. "+ "renk: " + hatchback2.getRenk() + " gunluk ucret:" + hatchback2.getGunlukUcret() + " bagaj kapasitesi:" + hatchback2.getBagajKapasitesi()+ " model: " +hatchback2.getModel() );
				System.out.println("3. "+ "renk: " + hatchback3.getRenk() + " gunluk ucret:" + hatchback3.getGunlukUcret() + " bagaj kapasitesi:" + hatchback3.getBagajKapasitesi()+ " model: " +hatchback3.getModel() );
				int secim3 = scanner.nextInt();
				if (secim3 == 1) {
					System.out.println("araci kac gün kıralamak istiyorsunuz:");
					int secim4 = scanner.nextInt();
					sedan1.kiralamaHesap(secim4);
				
				}
				else if (secim3 == 2) {
					System.out.println("araci kac gün kıralamak istiyorsunuz:");
					int secim4 = scanner.nextInt();
					sedan2.kiralamaHesap(secim4);
				
				}
				else if (secim3 == 3) {
					System.out.println("araci kac gün kıralamak istiyorsunuz:");
					int secim4 = scanner.nextInt();
					sedan3.kiralamaHesap(secim4);
				
				}
				else {
					System.out.println("hatali bir secim yaptiniz");
				}
			}
			else {
				System.out.println("hatali bir secim yaptiniz");
			}
			
		}
		else if (secim == 2) {
			System.out.println("sahis icin sadece hatchback arabalarimiz kiralanmaktadiir");
			System.out.println("hatchback arabalar");
			System.out.println("------------------------------");
			System.out.println("1. "+ "renk: " + hatchback1.getRenk() + " gunluk ucret:" + hatchback1.getGunlukUcret() + " bagaj kapasitesi:" + hatchback1.getBagajKapasitesi()+ " model: " +hatchback1.getModel() );
			System.out.println("2. "+ "renk: " + hatchback2.getRenk() + " gunluk ucret:" + hatchback2.getGunlukUcret() + " bagaj kapasitesi:" + hatchback2.getBagajKapasitesi()+ " model: " +hatchback2.getModel() );
			System.out.println("3. "+ "renk: " + hatchback3.getRenk() + " gunluk ucret:" + hatchback3.getGunlukUcret() + " bagaj kapasitesi:" + hatchback3.getBagajKapasitesi()+ " model: " +hatchback3.getModel() );
			System.out.println("lutfen hangı araci kiralamak istediginizi seciniz:");
			int secim2 = scanner.nextInt();
				if (secim2 == 1) {
					System.out.println("araci kac gün kıralamak istiyorsunuz:");
					int secim3 = scanner.nextInt();
					hatchback1.kiralamaHesap(secim3);
				
				}
				else if (secim2 == 2) {
					System.out.println("araci kac gün kıralamak istiyorsunuz:");
					int secim3 = scanner.nextInt();
					hatchback2.kiralamaHesap(secim3);
				
				}
				else if (secim2 == 3) {
					System.out.println("araci kac gün kıralamak istiyorsunuz:");
					int secim3 = scanner.nextInt();
					hatchback3.kiralamaHesap(secim3);
				
				}
				else {
					System.out.println("hatali bir secim yaptiniz");
				}
				
		}
		else {
			System.out.println("hatali veya yanlis bir secim yaptiniz");
		}
		 
		
		
		
		
		 
	}
	 
}
