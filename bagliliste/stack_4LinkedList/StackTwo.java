package stack_4LinkedList;

import java.util.LinkedList;
import java.util.Scanner;


public class StackTwo {
	private static Scanner klavye;
	
	public static void main(String[] args) {
		//StackLinkedList stack = new StackLinkedList();
		LinkedList<Eleman1> stack = new LinkedList<Eleman1>();
		int secim = 0;
		klavye = new Scanner(System.in);

		while (secim != 6) {
			System.out.println(
					"\n|--Arrays Menu--|\n1-Yigina Ekleme\n2-Yigindan Silme\n3-Yigin Eleman sayisi\n4-Yiginda Ara\n5-Yigini Listele \n+Ýstediginiz komutu giriniz.");
			secim = klavye.nextInt();
			switch (secim) {

			case 1:
				// listeyeEkleme
				System.out.println("Yigina eklencek yeni ad_soyad giriniz..");
				String ad = klavye.next();
				//stack.push(ad);
				String soyad = klavye.next();
				//stack.push(soyad);
				System.out.println("Yigina eklencek yeni dogum tarihi giriniz..");
				int dTarih = klavye.nextInt();
				//stack.push(dTarih);
				System.out.println("Yeni no'yu giriniz.");
				int telNo = klavye.nextInt();
				//stack.push(telNo);
				Eleman1 case1 = new Eleman1(ad, soyad, dTarih,telNo);
				stack.add(case1);
				//stack.add(case1);
				break;// case1
			case 2:
				// silme menusu
				if(stack.isEmpty()==false){
				System.out.println("Yigindan silinen kiþi" + stack.getFirst());
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
				int aramaSonucu = stack.indexOf(arama);
				if (aramaSonucu < 0)
					System.out.println("Yiginda " + arama + "bulunanmamiþtir.");
				else
					System.out.println("Aranan " + arama + " yiginin " + aramaSonucu + "sirasindadir.");
				break;
			case 5:
				if(stack.isEmpty()==true){
					System.out.println("Yigin boþtur Eklemek istermisiniz?");
					System.out.println("1/0");
					int sifirBir=klavye.nextInt();
					if(sifirBir==1){
						/*
						System.out.println("Yigina eklencek yeni ad_soyad giriniz..");
						String ad1 = klavye.next();
						stack.add(ad1);
						String soyad1 = klavye.next();
						stack.(soyad1);
						System.out.println("Yigina eklencek yeni dogum tarihi giriniz..");
						int dTarih1 = klavye.nextInt();
						stack.push(dTarih1);
						System.out.println("Yeni no'yu giriniz.");
						int telNo1 = klavye.nextInt();
						stack.push(telNo1);
						*/
					}else if(sifirBir==0){
						System.out.println("Bye Bye!");
						return;
					}else{
						System.out.println("Hatali Secim!\nAnaMenuye Dön!");
						continue;
					}
				}else
					
					//System.out.println(stack.element().ad+"\n"+stack.element().telNo+"\n"+stack.element().ad);
				break;
			default:// anaSecim
				System.out.println("Hatali secim");
				break;
			}// anaSwitchCaseSonu

		} // while

	}

}
