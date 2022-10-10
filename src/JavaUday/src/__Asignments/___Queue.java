package __Asignments;
import java.util.*;

public class ___Queue {

	public static void main(String[] args) {
		
		Queue<String> q = new PriorityQueue<String>();
		
		q.add("1.uday");
		q.add("6.kiran");
		q.add("3.Jamili");
		//q.add(null); it does not allows the null values
		q.add("4.udaykiranjamili");
		q.add("5.UDAY"); //it allows the null values
		
		System.out.println(q);
		System.out.println(q.contains("uday"));
		System.out.println("element method "+q.element());
		System.out.println("peek method "+q.peek());
		System.out.println("poll method "+q.poll());
		System.out.println(q.remove("1.uday"));
		System.out.println("after removing");
		System.out.println(q);
		 
		Iterator<String> iterator = q.iterator();
		 System.out.println("with iterator");
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next());
	        }
	}

}
