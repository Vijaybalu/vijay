package collection;
import java.util.*;
class Map{
void hashMap() {
	HashMap<String,Integer> hm = new HashMap<String,Integer>();
	System.out.println("-------------------HASHMAP-----------------");
	hm.put("vijay",303);
	hm.put("pavan",302);
	hm.put("uday",313);
	hm.put("vinay",309);
	hm.put("surendra",310);
	System.out.println(hm);
}
void linkedHashMap() {
	LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
	System.out.println("-----------------LINKEDHASHMAP------------------");
	lhm.put("vijay",303);
	lhm.put("pavan",302);
	lhm.put("uday",313);
	lhm.put("vinay",309);
	lhm.put("surendra",310);
	System.out.println(lhm);
}
void treeMap() {
	TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
	System.out.println("-----------------TREEMAP------------------");
	tm.put("vijay",303);
	tm.put("pavan",302);
	tm.put("uday",313);
	tm.put("vinay",309);
	tm.put("surendra",310);
	System.out.println(tm);
}
}
public class MapDemo {

	public static void main(String[] args) {
		Map m = new Map();
		m.hashMap();
		m.linkedHashMap();
		m.treeMap();
	}

}
