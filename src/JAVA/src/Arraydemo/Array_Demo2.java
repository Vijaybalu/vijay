package Arraydemo;

import java.util.Scanner;

public class Array_Demo2 {

	public static void main(String[] args) {
		int  [] A= new int [6];
		Scanner sc = new Scanner(System.in);
        for (int i=1;i<=5;i++) {
        	System.out.println("enter the value");
        	A[i]=sc.nextInt();
        }
        int x=0;
        for(int i=0;i<=5;i++) {
        x=x+A[i];
        System.out.println("a["+i+"]"+A[i]);
        }
        System.out.println("x="+x);
}
}