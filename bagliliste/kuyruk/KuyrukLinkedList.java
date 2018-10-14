package kuyruk;

import java.util.LinkedList;
import java.util.Scanner;

public class KuyrukLinkedList { 		//////////--------->    ADD_Last & REMOVE_First
	private static Scanner klavye;
	// bir eleman ekleneceði zaman kuyrugun sonuna eklenir..
	// bir eleman çýkarýlacaksa ilk eleman çýkarýlýr...
	LinkedList<Eleman> list = new LinkedList<Eleman>();
	int size;

	void enQueue(Eleman data) {
		//Sona Ekleme
		// nesneyi en sonuna ekler
		list.addLast(data);
		size++;
	}

	void getBas() {
		String uyari = "kuyruk bos";
		if (!list.isEmpty()) {
			Eleman temp = list.getFirst();
			System.out.println(temp.isim + " " + temp.soyad + " " + temp.dogumTarih + " " + temp.no);
		} else
			System.out.println(uyari);

	}

	void deQueue() {
		// Bastan Silme!
		// kuyruk baþýndaki nesneyi getirir.
		// ve kuyruktan çýkarýr..
		if (list.isEmpty()) {
			System.out.println("Silme yapamazsiniz.");

		} else {
			size--;
			list.removeFirst();
			System.out.println("Silme islemi tamamlandi");
		}
	}

	void printQueue() {
		// System.out.println(list2.isim+"\n"+list2.soyad+"\n"+list2.dogumTarih+"\n"+list2.no);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + ") " + list.get(i).isim + "." + list.get(i).soyad + "." + list.get(i).dogumTarih
					+ "." + list.get(i).no);
		}
		if(list.size()==0)
			System.out.println("Kuyruk Boþ!");
	}

	void searchName(String name1) {
		int sayi = 0;
		for (int i = 0; i < list.size(); i++) {
			String is = list.get(i).isim;
			if (is.equals(name1)) {// String karþýlaþtýrma
				System.out.println("Kuyrukta aranan " + (++i) + ".siradadir.");
				sayi++;
			}

		}
		if (sayi == 0)
			System.out.println("Kuyrukta aranan bulunamamiþtir.");

	}

	public static void main(String[] args) {
		KuyrukLinkedList kuyruk = new KuyrukLinkedList();
		Eleman el = new Eleman("Ali", "Veli", 1997, 154);
		Eleman el1 = new Eleman("Mustafa", "Zuvin", 1997, 154);
		Eleman el2 = new Eleman("Fatih", "Kocamaz", 2017, 425);
		kuyruk.enQueue(el);
		kuyruk.enQueue(el1);
		kuyruk.enQueue(el2);
		// System.out.println("kuyruk:"+kuyruk.list);
		// Eleman[] listeler = new Eleman[kuyruk.size];
		// Object listeler[]= (Object[]) kuyruk.list.toArray();

		// Eleman noooo=kuyruk.list.element();
		// System.out.println(noooo);
		// for(int i=0; i<listeler.length; i++){
		// System.out.println(listeler[i]);
		// }

		// 321

		int secim = 0;
		klavye = new Scanner(System.in);

		while (secim != 6) {
			System.out.println(
					"\n|--Arrays Menu--|\n1-Kuyruga Ekleme\n2-Kuyruktan Silme\n3-Eleman sayisi\n4-Kuyrukta Ara\n5-Liste Yaz \n\tÝstediginiz komutu giriniz.");
			secim = klavye.nextInt();
			switch (secim) {

			case 1:
				// kuyruga Ekleme
				System.out.println("Kuyruga eklencek yeni ad giriniz..");
				String yAd = klavye.next();
				System.out.println("Kuyruga eklencek yeni soyad giriniz..");
				String ySoyad = klavye.next();
				System.out.println("Kuyruga eklencek yeni dogumTarihi giriniz..");
				int dTarih = klavye.nextInt();
				System.out.println("Kuyruga eklencek yeni Telefon No giriniz..");
				int yTelNo = klavye.nextInt();
				Eleman elEkle = new Eleman(yAd, ySoyad, dTarih, yTelNo);
				kuyruk.enQueue(elEkle);

				break;// case1
			case 2:
				// silme menusu
				kuyruk.getBas();
				kuyruk.deQueue();
				
				break;
			case 3:
				// eleman sayisi
				System.out.println("Kuyruktaki eleman sayisi: " + kuyruk.size);
				break;
			case 4:
				// liste de arama	
				System.out.println("Kuyrukta aranacak ismi giriniz:");
				String searchName = klavye.next();
				kuyruk.searchName(searchName);
				break;
			case 5:
				kuyruk.printQueue();
				break;
			default:// anaSecim
				System.out.println("Hatali secim");
				break;
			}// anaSwitchCaseSonu

		}

	}

}
