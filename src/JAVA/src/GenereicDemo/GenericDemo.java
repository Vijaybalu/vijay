package GenereicDemo;
class Sample<v>{
	void show(v a) {
		System.out.println(a);
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		Sample<String> s = new Sample<String>();
		System.out.print("my name is ");
        s.show("vijay");
        System.out.println("------------------");
		
		
	}

}
