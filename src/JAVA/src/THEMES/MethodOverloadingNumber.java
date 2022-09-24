package THEMES;

import java.util.Scanner;

class Numbers{
	void A(int x,float y,short z) {
		System.out.println("additi0n of values= "+(x+y+z));
		

	}
	void A(float x,int y) {
		System.out.println("sum of the value= "+(x+y));
	}
}
public class MethodOverloadingNumber{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Numbers obj = new Numbers();
	System.out.println("enter the values");
	obj.A(sc.nextInt(),sc.nextFloat(),sc.nextShort());
	System.out.println("enter the numbers");
	obj.A(sc.nextFloat(),sc.nextInt());
	

	}

}

	
