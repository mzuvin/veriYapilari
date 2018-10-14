package stack_4LinkedList;





public class Stack {
	Stack1 data[];
	int ust;
	int N;
	public Stack(){
		data=new Stack1[N];
		this.N=N;
		ust=-1;
	}
	
	int f(int a){
		Stack1 s= new Stack1();
		int k=1;
		for(int i=a;i>0;i--)
			s.push((char) i);
		while(s.pop()=(char) a) 
			k++;
		return k;
		
	}
	public static void main(String[] args) {
		System.out.println(f(5),+f(4),+f(3),+f(2));
	}
}
