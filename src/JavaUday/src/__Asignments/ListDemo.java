package __Asignments;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

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
		Demolist k = new Demolist();
		k.arraylist();
		k.linkedlist();
		k.vector();
		
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
		
		Iterator<Integer> i = t.iterator();
		System.out.println("with iterator ");
		while(i.hasNext()) {
			System.out.println(i.next());
			}
			System.out.println("before listiterator");
			List<Integer> u = new ArrayList<Integer>();
		    System.out.println("Array List");
		    u.add(2); 
		    u.add(9);
		    u.add(8);
		    u.add(7);
		    u.add(6);
		    u.add(3);
		    u.add(3);
		    u.add(6);
		    System.out.println(u);
		    
		    ListIterator<Integer> a = u.listIterator();
		    System.out.println("after the listiterator"); 
		    while(a.hasNext()) {
		    	
		    	System.out.println(a.next());
		    }
		    System.out.println("previous method===========");
		    while(a.hasPrevious()) {
		    	System.out.println(a.previous());
		    	
		    }
		   
		    List<Integer> d = new LinkedList<Integer>();
		    System.out.println("Linked List");
		    d.add(2); 
		    d.add(9);
		    d.add(8);
		    d.add(7);
		    d.add(6);
		    d.add(null );
		    d.add(3);
		    d.add(6);
		    System.out.println(d);
		    
		    Spliterator<Integer> y = d.spliterator();
		    System.out.println(y.estimateSize());
		    System.out.println(y.getExactSizeIfKnown());
		    System.out.println(y.hasCharacteristics(5));
		    System.out.println(y.trySplit());
		    System.out.println(y.SORTED);
		    System.out.println(y.CONCURRENT);
		    System.out.println(y.DISTINCT);
		     //while(y.trySpl()) {
		    //	System.out.println();
		    }
		    
		
	}


