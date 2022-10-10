package collection;
import java.util.*;

public class Queuee {

	public static void main(String[] args) {
		
	Queue<Integer> v = new PriorityQueue<Integer>();
		
		v.add(0);
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		System.out.println(v);
		Iterator<Integer> i = v.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		}
	}
}
