package MY_THEAM;
class Pollution1{
    String name;
    byte num;
    int num2;
    char top;
    long noice;
    short land;
    }
public class Pollution {
	
	public static void main(String[] args) {
		Pollution1 vijay=new Pollution1();
		vijay.top='1';
		vijay.num=4;
		vijay.num2=2;
		vijay.noice=3;
		vijay.land=4;
		vijay.name="pollution";
		System.out.println("Details of "+vijay.name);
		System.out.println("pollutions are clasified in to "+vijay.num+" types and therw positions");
		System.out.println("Air pollution is no "+vijay.top+" position");
		System.out.println("water pollution is no "+vijay.num2+" position");
		System.out.println("noise pollution is no "+vijay.noice+" position");
		System.out.println("Land pollution is no "+vijay.land+ " position");
		}
    }
