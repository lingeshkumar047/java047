package opr;

public class Def {

	public static void main(String[] args) {
int a=5;
	System.out.println(((a++ +5)>10)||(a++>10));
	System.out.println(a);

int b=10;
	System.out.println((b>b++)&&(b++>b));
	System.out.println(b);

int c=6;
	System.out.println((c=c+c)<=c||(true&&(c<5)));
	System.out.println(c);

	}

}
