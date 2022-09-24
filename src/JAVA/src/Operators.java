
public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=b/a;
		int g=b%a;
		int h=b++;
		int i=b;
		int j=a&b;
		int k=a|b;
		int l=a^b;
		int m=~a;
		int n=a<<2;
		int o=a>>2;
		int p=a>>>2;
		boolean q=(a>b)&&(b<a);
		boolean r=(a>b)||(b<a);
		boolean s=!(a>b)&&(b<a);
		System.out.println("total value " + c);
		System.out.println("subtract value " + d);
		System.out.println("multiple value " + e);
		System.out.println("devide value " + f);
		System.out.println("percentage value " + g);
		System.out.println("b incriment value " + h);
		System.out.println("b value value " + i);
		System.out.println("a and b value " + j);
		System.out.println("a|b value " + k);
		System.out.println("a^b value " + l);
		System.out.println("~a value " + m);
		System.out.println("a<<2 value " + n);
		System.out.println("a>>2 value " + o);
		System.out.println("a>>>2 value " + p);
		System.out.println("a&&B value " + q);
		System.out.println("a||b value " + r);
		System.out.println("!(a&&B) value " + s);
	}

}
