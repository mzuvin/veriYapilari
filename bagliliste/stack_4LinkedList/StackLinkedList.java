package stack_4LinkedList;

import java.util.LinkedList;
import java.util.Scanner;


public class StackLinkedList {
	private static Scanner klavye;
	LinkedList<Eleman1> list = new LinkedList<Eleman1>();
	//Bir eleman ekleneceðinde yýðýtýn
	//en üstüne konulur.Bir eleman çýkarýlacaðý zaman
	//yýðýtýn en üstündeki  eleman çýkarýlýr..
	
	public void push(Eleman1 v) {
		list.addFirst(v);
	}

	public int search(Object v) {
		int index = list.indexOf(v);
		return index;
	}

	public Object top() {
		//ÜSTE EKLE
		return list.getFirst();
	}

	public Object pop() {
		
		//Üsten Sil
		return list.removeFirst();
	}

	public Object size() {
		return list.size();
	}
	public void print(Eleman1 yeni){
		while(list.size()!=0)
		System.out.println(">"+yeni.ad+","+yeni.soyad+"-"+yeni.dogumTarihi+"-"+yeni.telNo);
		
	}
	public Object print2(){
		return list.element().ad;
	}
	public boolean bosMu(){
		return list.isEmpty();
	}
	
	public static void main(String[] args) {
		StackLinkedList stack = new StackLinkedList();
		int secim = 0;
		klavye = new Scanner(System.in);

		while (secim != 6) {
			System.out.println(
					"\n|--Arrays Menu--|\n1-Yigina Ekleme\n2-Yigindan Silme\n3-Yigin Eleman sayisi\n4-Yiginda Ara\n5-Yigini Listele \n\tÝstediginiz komutu giriniz.");
			secim = klavye.nextInt();
			switch (secim) {

			case 1:
				// listeyeEkleme
				System.out.println("Yigina eklencek yeni ad giriniz..");
				String ad = klavye.next();
				//stack.push(ad);
				System.out.println("Yigina eklencek yeni soyad giriniz..");
				String soyad = klavye.next();
				//stack.push(soyad);
				System.out.println("Yigina eklencek yeni dogum tarihi giriniz..");
				int dTarih = klavye.nextInt();
				//stack.push(dTarih);
				System.out.println("Yeni no'yu giriniz.");
				int telNo = klavye.nextInt();
				//stack.push(telNo);
				Eleman1 case1 = new Eleman1(ad, soyad, dTarih,telNo);
				stack.push(case1);
				break;// case1
			case 2:
				// silme menusu
				if(stack.bosMu()==false){
				System.out.println("Yigindan silinen kiþi" + stack.top());
				stack.pop();
				}else
					System.out.println("Yiginda silinicek eleman kalmadi...");
				break;
			case 3:
				// eleman sayisi
				System.out.println("Yiginda " + stack.size() + " adet eleman vardir.");
				break;
			case 4:
				// liste de arama
				System.out.println("Yiginda aranacak ismi giriniz :");
				String arama = klavye.next();
				int aramaSonucu = stack.search(arama);
				if (aramaSonucu < 0)
					System.out.println("Yiginda " + arama + "bulunanmamiþtir.");
				else
					System.out.println("Aranan " + arama + " yiginin " + aramaSonucu + "sirasindadir.");
				break;
			case 5:
				if(stack.bosMu()==true){
					System.out.println("Yigin boþtur Eklemek istermisiniz?");
					System.out.println("1/0");
					int sifirBir=klavye.nextInt();
					/*if(sifirBir==1){
						System.out.println("Yigina eklencek yeni ad_soyad giriniz..");
						String ad1 = klavye.next();
						stack.push(ad1);
						String soyad1 = klavye.next();
						stack.push(soyad1);
						System.out.println("Yigina eklencek yeni dogum tarihi giriniz..");
						int dTarih1 = klavye.nextInt();
						stack.push(dTarih1);
						System.out.println("Yeni no'yu giriniz.");
						int telNo1 = klavye.nextInt();
						stack.push(telNo1);
					}else if(sifirBir==0){
						System.out.println("Bye Bye!");
						return;
					}else{
						System.out.println("Hatali Secim!\nAnaMenuye Dön!");
						continue;
					}*/
				}else{
					System.out.println(stack.list.element().ad);
					System.out.print(stack.print2());
				}
				break;
			default:// anaSecim
				System.out.println("Hatali secim");
				break;
			}// anaSwitchCaseSonu

		} // while

	}

}
