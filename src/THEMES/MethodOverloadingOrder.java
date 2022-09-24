package THEMES;

import java.util.Scanner;

class Order{
	void A(int x,float y) {
		System.out.println("additi0n of values= "+(x+y));
		

	}
	void A(float x,int y) {
		System.out.println("sum of the value= "+(x+y));
	}
}
public class MethodOverloadingOrder {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Order obj = new Order();
	System.out.println("enter the values");
	
	obj.A(sc.nextInt(),sc.nextFloat());
	

	
	obj.A(sc.nextFloat(),sc.nextInt());
	

	}

}

		

