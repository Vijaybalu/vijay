package Practice;
import java.util.Scanner;
public class This {
  int x;
  String name;
  char grade;
  
  public void A(int x, String name,char grade){
	   this.x=x;
	   this.name=name;
	   this.grade=grade;
	   
   }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:");
		int x=sc.nextInt();
		System.out.println("enter id " +x);
		String name=sc.next();
		System.out.println("enter the name " +name);
		char grade=sc.next().charAt(0);
		System.out.println("enter grade " +grade);
		This obj = new This();
		obj.A(45, "vijay",'b');

	}

}
