package Practice;
class zomato{
	zomato(){
		System.out.println("bill is 200rs");
	}
	 static void food(String a) {
		System.out.println("Biriyani "+a);
	}
    }
class swiggy extends zomato{
	 String d;
	 int x;
	swiggy(int x) {
	 this.x=x;
	}
	void display(String d) {
		this.d=d;
	
	}
	void view() {
		System.out.println(d);
	}
}
public class customer {
	public static void main(String srg[]) {
		swiggy s=new swiggy(68);
		swiggy.food("served");
		
	}
}
