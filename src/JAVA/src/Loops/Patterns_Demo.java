package Loops;

public class Patterns_Demo {

	public static void main(String[] args) {
		
		for (int i=1;i<=5;i++) {
		for (int j=1;j<=5;j++) {
		System.out.print(j);	
		} 
		System.out.println();
		}
		System.out.println("---------------------");
		for (int i=5;i>=1;i--) {
			for (int j=1;j<=i;j++) {
			System.out.print(j);	
			} 
			System.out.println();
			}
		System.out.println("---------------------");
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
			System.out.print(j);	
			} 
			System.out.println();
			}
		System.out.println("---------------------");
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
			System.out.print(i);	
			} 
			System.out.println();
			}
		System.out.println("----------------------"); 
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
			System.out.print("*");	
			} 
			System.out.println();
			}
		System.out.println("----------------------");
		int k=1;
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
			System.out.print(j);
		    if (k==0) {
		    	System.out.println("0");
		    }
			} 
			System.out.println();
			}
		System.out.println("-----------------------");
 
	}

}
