package THEMES;
class Super1{
	int a=1;
}
class Super4 extends Super1{
int a=2;
void vijay() {
	int a=3;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
}
public class Super {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Super4 obj = new Super4();
         obj.vijay();
	}
}
}
