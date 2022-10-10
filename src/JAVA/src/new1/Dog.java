package new1;

public interface Dog {
	
	void bark(int age);
	static void eat() {
		System.out.println("daily 2 time eating");
	} 
	default void sleep() {
		System.out.println("daily 12 hours sleep");
	}

}
