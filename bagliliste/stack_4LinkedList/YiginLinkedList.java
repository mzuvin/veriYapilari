package stack_4LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class YiginLinkedList { 				///////------->ADD_First & REMOVE_First
	private static Scanner klavye;
	// bir eleman ekleneceði zaman yiginin baþýna eklenir..
	// bir eleman çýkarýlacaksa ilk eleman çýkarýlýr...
	LinkedList<Eleman1> list = new LinkedList<Eleman1>();
	int size;

	void enStack(Eleman1 data) {
		//Basa Ekleme
		// nesneyi en basa ekler
		list.addFirst(data);
		size++;
	}

	void getBas() {
		String uyari = "yigin bos";
		if (!list.isEmpty()) {
			Eleman1 temp = list.getFirst();
			System.out.println(temp.isim + " " + temp.soyad + " " + temp.dogumTarih + " " + temp.no);
		} else
			System.out.println(uyari);

	}

	void deStack() {
		// Bastan Silme!

		if (list.isEmpty()) {
			System.out.println("Silme yapamazsiniz.");

		} else {
			size--;
			list.removeFirst();
			System.out.println("Silme islemi tamamlandi");
		}
	}

	void printStack() {
		// System.out.println(list2.isim+"\n"+list2.soyad+"\n"+list2.dogumTarih+"\n"+list2.no);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + ") " + list.get(i).isim + "." + list.get(i).soyad + "." + list.get(i).dogumTarih
					+ "." + list.get(i).no);
		}
		if(list.size()==0)
			System.out.println("Yigin Boþ!");
	}

	void searchName(String name1) {
		int sayi = 0;
		for (int i = 0; i < list.size(); i++) {
			String is = list.get(i).isim;
			if (is.equals(name1)) {// String karþýlaþtýrma
				System.out.println("Yiginda aranan " + (++i) + ".siradadir.");
				sayi++;
			}

		}
		if (sayi == 0)
			System.out.println("Yiginda aranan bulunamamiþtir.");

	}

	public static void main(String[] args) {
		YiginLinkedList kuyruk = new YiginLinkedList();
		Eleman1 el = new Eleman1("Ali", "Veli", 1997, 154);
		Eleman1 el1 = new Eleman1("Mustafa", "Zuvin", 1997, 154);
		Eleman1 el2 = new Eleman1("Fatih", "Kocamaz", 2017, 425);
		kuyruk.enStack(el);
		kuyruk.enStack(el1);
		kuyruk.enStack(el2);
		
		int secim = 0;
		klavye = new Scanner(System.in);

		while (secim != 6) {
			System.out.println(
					"\n|--Arrays Menu--|\n1-Yigina Ekleme\n2-Yigindan Silme\n3-Eleman sayisi\n4-Yiginda Ara\n5-Liste Yaz \n-Ýstediginiz komutu giriniz.");
			secim = klavye.nextInt();
			switch (secim) {

			case 1:
				// kuyruga Ekleme
				System.out.println("Yigina eklenecek yeni ad giriniz..");
				String yAd = klavye.next();
				System.out.println("Yigina eklenecek yeni soyad giriniz..");
				String ySoyad = klavye.next();
				System.out.println("Yigina eklenecek yeni dogumTarihi giriniz..");
				int dTarih = klavye.nextInt();
				System.out.println("Yigina eklenecek yeni Telefon No giriniz..");
				int yTelNo = klavye.nextInt();
				Eleman1 elEkle = new Eleman1(yAd, ySoyad, dTarih, yTelNo);
				kuyruk.enStack(elEkle);

				break;// case1
			case 2:
				// silme menusu
				kuyruk.getBas();
				kuyruk.deStack();
				break;
			case 3:
				// eleman sayisi
				System.out.println("Yigindaki eleman sayisi: " + kuyruk.size);
				break;
			case 4:
				// liste de arama
				System.out.println("Yiginda aranacak ismi giriniz:");
				String searchName = klavye.next();
				kuyruk.searchName(searchName);
				break;
			case 5:
				kuyruk.printStack();
				break;
			default:// anaSecim
				System.out.println("Hatali secim");
				break;
			}// anaSwitchCaseSonu

		}

	}

}

