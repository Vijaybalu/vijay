package __Asignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Hashset{
void hashset() {
	HashSet<Integer> i = new HashSet<Integer>();
    System.out.println("HASHSET");
    i.add(2); 
    i.add(9);
    i.add(8);
    i.add(71);
    i.add(68);
    i.add(null );
    i.add(3);
    i.add(6);
    System.out.println(i);
    System.out.println("_________________");
    System.out.println("contains (7)------"+i.contains(7));
    System.out.println("isEmpty(boolean return type)-----------"+i.isEmpty());
    System.out.println("removing (9) -------"+i.remove(9));
    System.out.println("size--------------"+i.size());
    System.out.println(i);
    i.clear();System.out.println("clone: "+((HashSet) i).clone());
    System.out.println("after clone"+i);
	}

void linkedHashset() {
	LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
    System.out.println("LINKEDHASHSET");
   
    lh.add(2); 
    lh.add(9);
    lh.add(8);
    lh.add(7);
    lh.add(6);
    lh.add(null );
    lh.add(3);
    lh.add(6);
    System.out.println(lh);
    }
void treeSet() {
	TreeSet<Integer> ts = new TreeSet<Integer>();
    System.out.println("HASHSET");
    ts.add(2); 
    ts.add(9);
    ts.add(8);
    ts.add(7);
    ts.add(6);
    ts.add(8);
    ts.add(3);
    ts.add(6);
    System.out.println("higher method == "+ts.higher(9));
    System.out.println( "first method == "+ts.first());
    System.out.println("last method == "+ts.last());
    System.out.println("lower method == "+ts.lower(9));
    System.out.println("floor method == "+ts.floor(6));
    System.out.println("contains method == "+ts.contains(10));
    System.out.println("ceiling method == "+ts.ceiling(5));
    System.out.println(ts);
    System.out.println("_________________");
    }
}
public class Set_Interface {

	public static void main(String[] args) {
		
		Hashset hs = new Hashset();
		
		hs.hashset();
		hs.linkedHashset();
		hs.treeSet();
		
	}

}
