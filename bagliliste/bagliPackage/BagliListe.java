package bagliPackage;

public class BagliListe {
	Eleman bas;
	Eleman son;

	public BagliListe() {
		bas = null;
		son = null;
	}

	void basaEkle(Eleman yeni) {
		if (bas == null) {
			bas = yeni;
			son = yeni;

		} else {
			yeni.ileri = bas;
			bas = yeni;
		}
	}// basaEkle

	void sonaEkle(Eleman yeni) {
		if (bas == null)
			bas = yeni;
		else
			son.ileri = yeni;
		son = yeni;
	}

	void listele() {
		Eleman tmp;
		tmp = bas;
		while (tmp != null) {
			System.out.println(
					"Ýsim: " + tmp.isim+"~"+tmp.soyad + "\n" + "Tel no: " + tmp.no + "\nDogumTarihi: " + tmp.dogumTarigi + "\n---");
			tmp = tmp.ileri;
		}
	}// listele

	
	Eleman indexeGoreGetir(int i){
		Eleman tmp=bas;
		int k=0;
		while(tmp!=null && k<i){
			k++;
			tmp=tmp.ileri;
		}
		return tmp;
	}
	

	Eleman arama(String isim) {
		Eleman tmp;
		tmp = bas;
		/*while (!(tmp.isim.equals(isim)) && (tmp.ileri != null)) {
			tmp = tmp.ileri;
		}
		if (tmp.ileri != null)
			return tmp;
		*/
		while(tmp!=null){
			String name=tmp.isim;
			if (name.equals(isim))
				return tmp;
			tmp=tmp.ileri;	
		}
		
		return null;

	}// string arama
	
	Eleman arama(int no) {
		Eleman tmp;
		tmp = bas;
		while ((tmp.no != no) && (tmp.ileri != null)) {
			tmp = tmp.ileri;
		}
		if (tmp.ileri != null)
			return tmp;
		return null;

	}// int arama

	String araSonuc(Eleman tmp) {
		if (tmp != null)
			return tmp.isim;
		else
			return "Listede deðer bulunamamýþtýr";

	}

	/// Silme
	void bastanSilme() {
		if (bas != null)
			bas = bas.ileri;
		bas.ileri = bas;
	}

	void sondanSilme() {
		Eleman tmp, once;
		tmp = bas;
		once = null;
		while (tmp != son) {
			once = tmp;
			tmp = tmp.ileri;

		}
		if (once == null)
			bas = null;
		else
			once.ileri = null;
		son = once;
	}// sondanSilme

	void ortadanSilme(Eleman s) {
		Eleman tmp, elemanOnce;
		tmp = bas;
		elemanOnce = null;
		while (tmp != s) {
			elemanOnce = tmp;
			tmp = tmp.ileri;
		}
		elemanOnce.ileri = s.ileri;
	}

	int elemanSayisi() {
		if (bas != null) {
			int say = 0;
			Eleman tmp;
			tmp = bas;
			while (tmp != null) {
				say++;
				tmp = tmp.ileri;
			}
			return say;
		}
		return 0;
	}// eleman sayisi

	int elemanIndexi(int no) {// no ya göre
		if (bas != null) {
			int say = 0;
			Eleman tmp1;
			tmp1 = bas;
			while (tmp1 != null) {
				if (no == tmp1.no)
					return say;
				say++;
				tmp1 = tmp1.ileri;
			}
			
		}
		return 0;
	}// eleman indexi

	int elemanIndexi(String isim) {// isme göre
			int say=0;
			Eleman tmp2;
			tmp2 = bas;
			
			while (tmp2 != null) {
				if(tmp2.isim.equals(isim))
					return say;
			tmp2=tmp2.ileri;	
			say++;
			}
			return -1000;
	
		
		
	}// eleman indexi
}
