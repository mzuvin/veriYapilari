package stack_4LinkedList;

public class Cikin {
	char dizi[];
	int ust;
	int N=10;
	public Cikin(int N){
		dizi = new char[N];
		this.N=N;
		ust=0;
	}
	char ust(){
		return dizi[ust];
	}
	
	boolean isEmpty(){
		
		if(CikinDolu()==true){
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean CikinDolu(){
		if(ust==N-1)
			return true;
		else
			return false;
		
						
	}
	boolean cikinBos(){
		if(ust==-1)
			return true;
		else
			return false;
	}
	void cikinEkle(char yeni){
		if(!CikinDolu()){
			ust++;
			dizi[ust]=yeni;
		}
	}
	char cikinSil(){
		if(!cikinBos()){
			ust--;
			return dizi[ust+1];
		}
		return 0;
	}
	
	boolean push(char item){
		if(CikinDolu()==true)
			return false;
		else{
			cikinEkle(item);
			return true;
		}
		
	}
	
	char pop(){
		cikinSil();
		return ust();
	}

	public static int f(int a){
		Cikin s= new Cikin(15);
		int k=1;
		for(int i=a;i>0;i--)
		s.push((char)i);
		while(s.pop()==(char) a) 
			k++;
		return k;
		
	}

	/*
	public static void main(String[] args) {
	
		System.out.println(f(5)+","+f(4)+","+f(3)+","+f(2));
		
	}
	*/
	
	
	/*
	public static void main(String[] args) {
		Cikin s[]=new Cikin[3];
		char t;
		for(int i=0;i<10;i++)
			s[0].push((char)10);
		while(s[0].isEmpty()){
			t=s[0].pop();
			if(t%3==0)
				s[1].push(t);
			else
				s[2].push(t);
		}
		for(int i=1;i<3;i++){
			t=s[i].pop();
			System.out.println(t);
		}
	}*/
	
	
	Cikin k(char[] t){
		Cikin s;
		for(int a=0; (t)!='\0';t[a++])
			s.push(t);
		return s;
	}
	void  y(Cikin s){
		while(s.pop()!=-1)
			System.out.println(s.pop());
	}
	
	public static void main(String[] args) {
		Cikin s= k("Merhabalar");
		y(s);
	}
	
}
