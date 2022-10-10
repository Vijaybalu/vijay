package Arraydemo;


public class Arraydemo1 {
     public static void main(String[] args) {
	int A[]= new int [3];
		A[0]=5;
		A[1]=4;
		A[2]=3;
		//for(int i=0;i<A.length;i++ );(for loop)
		for(int x:A) {//(for each loop)
		System.out.println(x);
		}
	char B [] = new char [2];
		 B [0]='A';
		 B [1]='g'; 
		for (char x:B) {
			System.out.println(x);
		}
	String C [] = new String [2];
		C [0]="vijay";
		C [1]="balu";
		for (String x:C) {
			System.out.println(x);
		}
	   }
	 }
