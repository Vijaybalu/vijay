class This1{
	int id;
	String name;
	This1(int id,String name){
		this.id=id;
		this.name=name;
		     //this.vijay("this.method name")this is also calling of method
	}
	void vijay() {
		System.out.println("number :"+id);
		System.out.println("my name is :"+name);
	}
}
public class This {

	public static void main(String[] args) {
		This1 obj = new This1(303,"vijay");
		obj.vijay();

	}

}
