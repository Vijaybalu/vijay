package Nested_classes;
class Test{
	static int a=20;
	static int b=30;
	static int c=a+b;
	static class Inner{
		void sum() {
			System.out.println("sum ="+c);
		}
	} 
}
public class Static_nested_class {

	public static void main(String[] args) {
		Test.Inner ti = new Test.Inner();
		ti.sum();

	}

}
