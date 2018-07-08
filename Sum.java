package opr;

public class Sum {
	public static void main(String[] args) {
		int a=1543,b,c,d;
		b=a/10;
		a=a%10;
		c=b/10;
		b=b%10;
		d=c/10;
		c=c%10;
		System.out.println(a+b+c+d);
	}
}
