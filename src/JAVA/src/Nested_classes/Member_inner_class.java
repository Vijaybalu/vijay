package Nested_classes;
class Mist{
	void course(){
	System.out.println("mist college had more courses");
	b.branch();
	}
	class Btech{
	void branch() {
	System.out.println("mist college had more branches in b.tech");	
	}	
	}
	Btech b = new Btech();
}
public class Member_inner_class {

	public static void main(String[] args) {
		Mist m = new Mist();
		m.course();
    }
}
