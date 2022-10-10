package String;

public class String_Demo {
    public static void main(String[] args) {
		String s="String";
		String s1= new String(s);
		System.out.println(s1);
		System.out.println("--------CONCAT METHOD----------");
		System.out.println(s.concat(" Program"));
		System.out.println(s.concat(" Concat Demo"));
		System.out.println("--------EQUALS METHOD----------");
		System.out.println(s.equals("String"));
		System.out.println("--------EQUALSIGNORECASE-------");
		System.out.println(s.equalsIgnoreCase("String"));
        System.out.println("---------CHARAT METHOD---------");
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(0));
        System.out.println("--------CONTAINS METHOD--------");
        System.out.println(s.contains("String"));
        System.out.println("--------SUBSTRING METHOD-------");
        System.out.println(s.substring(3));
        System.out.println("-------UPPERCASE METHOD--------");
        System.out.println(s.toUpperCase());
        System.out.println("-------LOWERCASE METHOD--------");
        System.out.println(s.toLowerCase());
        System.out.println("-------TRIM METHOD-------------");
        String x="        vijay";
        System.out.println(x.trim());
        System.out.println("------SPLIT METHOD-------------");
        String b="my name is vijay";
        String [] v = b.split(" ");
        for(String d : v) { 
        System.out.println(d);
        }
        System.out.println("------APPEND METHOD------------");
        StringBuffer sb = new StringBuffer("hello");
        StringBuffer sb1 = new StringBuffer("hi");
        sb.append(" world");
        sb1.append(" bro");
        System.out.println(sb);
        System.out.println(sb1);
	}
}
