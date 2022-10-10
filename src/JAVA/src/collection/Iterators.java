package collection;

import java.util.*;
class IteratorDemo{
void iterator() {
	LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
    System.out.println("-------------ITERATOR-------------------");
    l.add(2); 
    l.add(9);
    l.add(8);
    l.add(7);
    l.add(6);
    l.add(3);
    l.add(3);
    l.add(6);
    System.out.println(l);
    Iterator i = l.iterator();
    while(i.hasNext()) {
    	System.out.println(i.next());
    }
    }
void listIterator() {
	List<Integer> i = new ArrayList<Integer>();
    System.out.println("LISTITERATOR");
    i.add(2); 
    i.add(9);
    i.add(8);
    i.add(7);
    i.add(6);
    i.add(3);
    i.add(3);
    i.add(6);
    System.out.println(i);
    ListIterator li = i.listIterator();
    while(li.hasNext()) {
    	System.out.println(li.next());
    }
    System.out.println("=================BACKWORD========================");
    while(li.hasPrevious()) {
    	System.out.println(li.previous());
    }
}
}
public class Iterators {

	public static void main(String[] args) {
		IteratorDemo it = new IteratorDemo();
		it.iterator();
		it.listIterator();

	}

}
