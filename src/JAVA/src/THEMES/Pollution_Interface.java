package THEMES;
interface Pollution{
	void Vehicle();
	void waste();
} 
abstract class Air_pollution implements Pollution{
	void pollute_air() {
		System.out.println("air pollution 60% in world");
	}
}
abstract class water_pollution implements Pollution{
	void pollute_water() {
		System.out.println("water pollution 50% in world");
	}
}
class smoke extends Air_pollution{
	public void Vehicle() {
		super.pollute_air();
	   System.out.println("smoke is coming to vehicle");
	}
    public void waste() {
		System.out.println("to comes the bad smell in waste");
	}
}
class water extends water_pollution{
    public void Vehicle() {
    	super.pollute_water();
	    System.out.println("washing vehicle in pond");	
	}
    public void waste() {
	    System.out.println("humans throw rhe waste in water");
	}
}

public class Pollution_Interface {
  public static void main(String[] args) {
	  Pollution p;
	  p=new smoke();
	  p.Vehicle();
	  p.waste();
	  p=new water();
	  p.Vehicle();
	  p.waste();
	 }
}
