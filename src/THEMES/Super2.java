package THEMES;
class Cake{
	Cake(int x){
		System.out.println("cool cake cost is : "+x);
	}
}
class Cake1 extends Cake {

	Cake1( int x) {
		super(500);
		System.out.println("normal cake cost is : "+x);
	}
	
}
public class Super2 {

	public static void main(String[] args) {
	Cake1 obj = new Cake1(300);
}


}
