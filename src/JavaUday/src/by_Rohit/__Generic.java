package by_Rohit;

class uday<A>{
	void show(A a) {
		System.out.println(a);
		System.out.println("This is a demo of Generic");
	}
}

public class __Generic {

	public static void main(String[] args) {
		
		uday<String> Aa = new uday<String>();
		Aa.show("hello");
		

	}

}
