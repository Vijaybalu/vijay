package Nested_classes;
class University{
	void exams(){
	System.out.println("exams will be conducted tomorrow");
class College{
	void marks() {
	System.out.println("got 36 marks students passed ");	
}
}
	College c = new College();
	c.marks();
	}
}
public class Local_inner_class {
    public static void main(String[] args) {
		University u = new University();
		u.exams();
}
}
