package opr;

public class Abc {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		System.out.println("Before swapping");
		System.out.println(a+","+b+","+c);
		b=a+b;
		a=b-a;
		b=b-a;
		c=b+c;
		b=c-b;
		c=c-b;
		System.out.println("After swapping");
		System.out.println(a+","+b+","+c);
	}
}
