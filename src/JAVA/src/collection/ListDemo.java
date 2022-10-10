package collection;
import java.util.*;
class Demolist{
 void arraylist() {
	List<Integer> i = new ArrayList<Integer>();
    System.out.println("Array List");
    i.add(2); 
    i.add(9);
    i.add(8);
    i.add(7);
    i.add(6);
    i.add(3);
    i.add(3);
    i.add(6);
    System.out.println(i);
	}
void linkedlist() {
	List<Integer> l = new LinkedList<Integer>();
    System.out.println("Linked List");
    l.add(2); 
    l.add(9);
    l.add(8);
    l.add(7);
    l.add(6);
    l.add(null );
    l.add(3);
    l.add(6);
    System.out.println(l);
    }
void vector() {
	List<Integer> t = new Vector<Integer>();
    System.out.println("Vector");
    t.add(2); 
    t.add(9);
    t.add(8);
    t.add(7);
    t.add(6);
    t.add(8);
    t.add(3);
    t.add(6);
    System.out.println(t);
}
}
public class ListDemo {

	public static void main(String[] args) {
		
		Demolist v = new Demolist();
		v.arraylist();
		v.linkedlist();
		v.vector();
		

	

 }
}
