package Inheritence_demo;

import java.util.Scanner;

class Addition_Subtraction{
	int a,b;
	
	void A(){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the a value");
	a=sc.nextInt();	
	}
	void B() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the b value");	
	b=sc.nextInt();
	}
    void C() {
    System.out.println("sum ="+(a+b));
    System.out.println("sub ="+(a-b));
    System.out.println("------------");
}
}
class values extends Addition_Subtraction{
	String name;
	void D (){
	System.out.println("single digits are");
    for(int i=0;i<=9;i++) {
    System.out.println(i+2);
    }
    }
	void E () {
	System.out.println("program completed");
	}
}
public class SingleleveInheritence2{

	public static void main(String[] args) {
		values obj = new values();
        obj.A();
        obj.B();
        obj.C();
        obj.D();
        obj.E();
	}
}
