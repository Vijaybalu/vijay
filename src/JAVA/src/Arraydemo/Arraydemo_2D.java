package Arraydemo;

import java.util.Scanner;

class Array{
	String vijay [][]=new String[4][4];
	Scanner sc = new Scanner(System.in);
	void A(){
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
			System.out.println("enter the elements");
			vijay[i][j]=sc.next();
			}
		}
	}
	void B() {
		for (String[] x:vijay) {
			for (String f:x) {
				System.out.print(" "+f+" ");
			}
			System.out.println();
			
		}
	}
}
public class Arraydemo_2D {

	public static void main(String[] args) {
		Array a = new Array();
		a.A();
		a.B();

	}

}
