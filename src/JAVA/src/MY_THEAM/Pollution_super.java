package MY_THEAM;
class Poluution{
	void blue() {
		System.out.println("pollution is very dangerius");
	}
}
class Airpollution extends Poluution{
	void blue() {
		super.blue();
		System.out.println("Air pollution is one of the type of pollution");
	}
}
public class Pollution_super {

	public static void main(String[] args) {
		Airpollution obj = new Airpollution();
		obj.blue();

	}

}
