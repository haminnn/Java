import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		String str;
		Iterator<String> e = list.iterator();
		while(e.hasNext()) {
			str = (String)e.next();
			System.out.println(str);
		}
		System.out.println(list.indexOf("��"));
		System.out.println(list.lastIndexOf("��"));
		System.out.println(list);

	}

}
