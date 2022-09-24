package Practice;

public class vijay {
	int model;
	String name; 
	int cost;
 void name(int no,String name,String movie) {
	 System.out.println("number is :"+no);
	 System.out.println("my bike name is:"+name);
	 System.out.println("my favarite movie :"+movie);
 }
 void name1(int model,String name,int c) {
	 this.model=model;
	this. name=name;
	cost=c;
	System.out.println("model : "+model);
	System.out.println("name : "+name);
	System.out.println("cost : "+cost);
 }
 
	public static void main(String[] args) {
		vijay obj=new vijay();
		obj.name(303,"pulsar","pokiri");
		obj.name(304,"glamder","akanda");
		obj.name1(2018,"duke",200000);
				

	}

}
