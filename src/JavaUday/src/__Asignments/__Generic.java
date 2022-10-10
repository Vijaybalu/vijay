package __Asignments;

//import GenereicDemo.Sample;

class Uday<u,d,A,y>{
	void show(u a, d k, A s) {
		System.out.println(a);
		System.out.println(k);
		System.out.println(s);
	}
	void Show(y k) {
		System.out.println(k);
		
	}
}

public class __Generic {

	public static void main(String[] args) {
		
		Uday<String,Integer,Float,Double> s = new Uday<String,Integer,Float,Double>();
		System.out.println("welcome to GENERIC METHOD");
		System.out.println("combined values are ");s.show("Generic STRING",23,23.5f);
		System.out.println("the double  value is ");s.Show(34.56);

	}

}
