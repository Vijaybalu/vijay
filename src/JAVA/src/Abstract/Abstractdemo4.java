package Abstract;
import java.util.Scanner;
abstract class Hotel{
	String name;
	int bill;
    abstract void rooms() ;
		void show (String name,int bill) {
			this.name=name;
			if (name.equals("ac")){
			this.bill=bill;
			System.out.println("I selected "+name);
			System.out.println("AC rooms details are");
			System.out.println("--------------------");
			System.out.println("room bill :"+bill);
			System.out.println("Double bed room");
			System.out.println("24 hours current");
			System.out.println("24 hours water");
	        }
			else {
				System.out.println("I selected "+name);
				System.out.println("NON-AC rooms details are");
				System.out.println("--------------------");
				System.out.println("room bill :");
				System.out.println("Single bed room");
				System.out.println("24 hours current");
				System.out.println("24 hours water");
			}
		}
	}
class Fivestar extends Hotel{
        void rooms(float rating) {
        	System.out.println("hi sir/madam this is no 1 hotel in this city");
    	    System.out.println("Our hotel rating is "+rating+" star");
            System.out.println("please select any one :AC (or) NON AC ");
	}
        void rooms() {
		    System.out.println("Welcome to five star hotel");	
		}
	} 
public class Abstractdemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fivestar f = new Fivestar();
		f.rooms();
		f.rooms(5f);
		f.show(sc.next(),200000);
        }

    }
