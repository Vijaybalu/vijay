package Practice;
import java.util.*;
class helloWorld {
	int number;
	int no;
	String name;
	String branch;
	char grade;
	float percentage;
	void A(int n,String na,String b,char g,float p) {
		no=n;
		name=na;
		branch=b;
		grade=g;
		percentage=p;
		System.out.println("my details are");
		System.out.println("my no is "+no);
		System.out.println("my name is "+name);
		System.out.println("my branch is "+branch);
		System.out.println("my grade is"+grade);
		System.out.println("my percentage"+percentage);
		
		}
	public static void main(String args[]) {
	    helloWorld obj = new helloWorld();
		obj.A(303,"vijay","MECHANICAL",'A',70);
		
	}
	

}
