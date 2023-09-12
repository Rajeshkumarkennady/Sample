package Programs;

public class swapping2numbers {

	public static void main(String[] args) {
		
		int a=10,b=20;
		System.out.println("Before Swapping "+a +" "+b);
		//by using 3rd value
		int c=a;
		a=b;
		b=c;
		
		System.out.println("After Swapping "+a +" "+b);
		
		//by using +,- operators
		int d=10,e=20;
		System.out.println("Before Swapping "+d +" "+e);
		int f=d+e;
		d=f-d;
		e=f-e;
		System.out.println("After Swapping "+d +" "+e);
	}

}
