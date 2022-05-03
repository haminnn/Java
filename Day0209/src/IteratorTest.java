import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("老");
		list.add("捞");
		list.add("伙");
		list.add("荤");
		list.add("伙");
		list.add("捞");
		list.add("老");
		String str;
		Iterator<String> e = list.iterator();
		while(e.hasNext()) {
			str = (String)e.next();
			System.out.println(str);
		}
		System.out.println(list.indexOf("老"));
		System.out.println(list.lastIndexOf("老"));
		System.out.println(list);

	}

}
