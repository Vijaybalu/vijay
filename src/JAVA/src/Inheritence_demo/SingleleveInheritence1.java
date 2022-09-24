package Inheritence_demo;

import java.util.Scanner;

class Square{
	int a;
	Scanner sc = new Scanner(System.in);
	void A(){
	System.out.println("enter the a value");
	a=sc.nextInt();	
	}
	void B() {
	System.out.println("Square :"+a*a);
	}
    }
class Sum extends Square{
	
	int b;
	void C(){
	System.out.println("enter the b value");
	b=sc.nextInt();
	}
	void D() {
		System.out.println("sum of the value :"+(a+b) );
	}
}
class SingleleveInheritence1 {

	public static void main(String[] args) {
		Sum obj = new Sum();
        obj.A();
        obj.B();
        obj.C();
        obj.D();
	}
}
	


