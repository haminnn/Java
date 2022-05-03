import java.util.*;

public class Week11_4TreeSet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TreeSet<String> treeSet = new TreeSet<String>();
		String name;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("추가할 회원의 이름은 :");
			name = scan.next();
			treeSet.add(new String(name));
		}
		System.out.println(treeSet);

	}

}
