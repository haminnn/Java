import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("A");
		System.out.println(set);
		
		String str;
		Iterator<String> e = set.iterator();
		while(e.hasNext()) {
			str = (String)e.next();
			System.out.println(str);
		}
		for(String n : set) {
			System.out.println(n);
		}
		
		
		

	}

}
