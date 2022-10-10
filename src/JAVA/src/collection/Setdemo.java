package collection;
import java.util.*;
class Hashset{
void hashset() {
	HashSet<Integer> i = new HashSet<Integer>();
    System.out.println("HASHSET");
    i.add(2); 
    i.add(9);
    i.add(8);
    i.add(7);
    i.add(6);
    i.add(null );
    i.add(3);
    i.add(6);
    System.out.println(i);
    System.out.println("size----"+i.size());
    System.out.println("isEmpty-----"+i.isEmpty());
    System.out.println("contains (7)------"+i.contains(7));
    System.out.println("remove (9) -----"+i.remove(9));
    System.out.println(i);
    i.clear();System.out.println("clone: "+((HashSet) i).clone());
    System.out.println(i);
	}

void linkedHashset() {
	LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
    System.out.println("LINKEDHASHSET");
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
void treeSet() {
	TreeSet<Integer> t = new TreeSet<Integer>();
    System.out.println("HASHSET");
    t.add(2); 
    t.add(9);
    t.add(8);
    t.add(7);
    t.add(6);
    t.add(8);
    t.add(3);
    t.add(6);
    System.out.println( "first method == "+t.first());
    System.out.println("last method == "+t.last());
    System.out.println("lower method == "+t.lower(9));
    System.out.println("floor method == "+t.floor(6));
    System.out.println("contains method == "+t.contains(10));
    System.out.println("ceiling method == "+t.ceiling(5));
    System.out.println("higher method == "+t.higher(9));
    System.out.println(t);
    System.out.println();
    }
}
public class Setdemo {
	public static void main(String[] args) {
		Hashset h = new Hashset();
		h.hashset();
		h.linkedHashset();
		h.treeSet();
	 }
}
