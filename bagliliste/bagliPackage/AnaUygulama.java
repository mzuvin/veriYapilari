package bagliPackage;

import java.util.Scanner;

public class AnaUygulama {
	private static Scanner klavye;

	public static void main(String[] args) {
		Eleman elm = new Eleman(1, "Crazy", "Bilal", 1998);
		Eleman elm1 = new Eleman(14, "Gurbuz", "Dengesiz", 1666);
		Eleman elm2 = new Eleman(1233333, "Faruk", "Dalsarar", 0);
		Eleman elm3 = new Eleman(0, "Armagan", "Bahtiyar", 1453);
		BagliListe b1 = new BagliListe();
		b1.basaEkle(elm);
		b1.basaEkle(elm1);
		b1.basaEkle(elm2);
		b1.basaEkle(elm3);

		int secim = 0;
		klavye = new Scanner(System.in);

		while (secim != 6) {
			System.out.println(
					"\n|--Arrays Menu--|\n1-Listeye Ekleme\n2-Listeden Silme\n3-Eleman sayisi\n4-Listede Ara\n5-Liste Yaz \n\t�stediginiz komutu giriniz.");
			secim = klavye.nextInt();
			switch (secim) {

			case 1:
				// listeyeEkleme
				System.out.println("listeye eklencek yeni ad giriniz..");
				String yAd = klavye.next();
				System.out.println("listeye eklencek yeni soyad giriniz..");
				String ySoyad = klavye.next();
				System.out.println("listeye eklencek yeni dogumTarihi giriniz..");
				int dTarih = klavye.nextInt();
				System.out.println("listeye eklencek yeni Telefon No giriniz..");
				int yTelNo = klavye.nextInt();
				Eleman case1 = new Eleman(yTelNo, yAd, ySoyad, dTarih);
				b1.basaEkle(case1);
				break;// case1
			case 2:
				// silme menusu
				System.out.println("listeden silinecek kisinin adini giriniz:");
				String sAdSoyad = klavye.next();

				int index = b1.elemanIndexi(sAdSoyad);

				// System.out.println("�ndex" + index);
				Eleman s = b1.arama(sAdSoyad);
				System.out.print(b1.araSonuc(s));
				if (s != null) {
					if (index == 0) {
						b1.bastanSilme();
						System.out.println(" isimli bastan silindi.");
					}
					if (index == (b1.elemanSayisi() - 1)) {
						b1.sondanSilme();
						System.out.println(" isimli sondan silindi.");
					}
					if ((index < b1.elemanSayisi()) && (index > 0)) {
						b1.ortadanSilme(s);
						System.out.println(" isimli ortadan silindi.");
					}
				}
				break;
			case 3:
				// eleman sayisi
				System.out.println("listede " + b1.elemanSayisi() + " adet eleman vardir.");
				break;
			case 4:
				// liste de arama
				
				int ara1Secim=1;
				
				while(ara1Secim!=3){
					System.out.println("L�ften arama tipini seciniz:\n1-Sayi\n2-isim\n3-Cikis");
					int araSecim = klavye.nextInt();
					switch (araSecim) {
				
				case 1:
					System.out.println("Listede aranacak int de�eri giriniz");
					int deger = klavye.nextInt();
					Eleman sonuc = b1.arama(deger);
					// if(son)
					if (sonuc != null)
						System.out.println("Aranan [" + b1.araSonuc(sonuc) + "] listenin " + b1.elemanIndexi(deger)
								+ ". sirasindadir.");
					else
						System.out.println("Listede de�er bulunamam��t�r");
					break;
				case 2:
					System.out.println("Listede aranacak String de�eri giriniz");
					String deger1 = klavye.next();
					Eleman sonuc1 = b1.arama(deger1);
					// if(son)
					if (sonuc1 != null)
						System.out.println("Aranan [" + b1.araSonuc(sonuc1) + "] listenin " + b1.elemanIndexi(deger1)
								+ ". sirasindadir.");
					else
						System.out.println("Listede de�er bulunamam��t�r");
					break;
				case 3:
					ara1Secim=3;
					break;
					default:
						System.out.println("Hatali Secim");
						break;
						
				}//araSecimSwitch
				}
				/*
				 * int deger = klavye.nextInt(); Eleman sonuc = b1.arama(deger);
				 * //if(son) if (sonuc != null) System.out.println("Aranan [" +
				 * b1.araSonuc(sonuc) + "] listenin " + b1.elemanIndexi(deger) +
				 * ". sirasindadir."); else
				 * System.out.println("Listede de�er bulunamam��t�r");
				 */
				break;
			case 5:
				b1.listele();
				break;
			default:// anaSecim
				System.out.println("Hatali secim");
				break;
			}// anaSwitchCaseSonu

		}

	}
}
