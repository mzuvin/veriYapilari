package bagliPackage;

public class Eleman {
	int no;
	String isim;
	String soyad;
	int dogumTarigi;
	public Eleman ileri;//public olmak zorunda...
	public Eleman(int no, String isim,String soyad,int dogumTarihi){
		ileri=null;
		this.no=no;
		this.isim=isim;
		this.dogumTarigi=dogumTarihi;
		this.soyad=soyad;
		
	}
}

