package Inheritence_demo;
class Sports{
	String name;
	void A(String name) {
		this.name=name;
		System.out.println("SPorts  ");
		System.out.println("-------");
		System.out.println("i like"+ name+" games");
	}
}
class indoor extends Sports{
	 void B() {
		 System.out.println("indoor games are CHARAMS, CHESS");
	 }   
}
class Cricket extends indoor{
	 void C() {
		 System.out.println("CHESS is my favorite game ");
		 System.out.println("CHESS is dificult game");
	 }
}
public class Multilevelinheritence2 {

	public static void main(String[] args) {
		Cricket obj = new Cricket();
        obj.A("indoor");
        obj.B();
        obj.C();
        
	}

}
