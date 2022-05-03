import java.util.HashSet;
import java.util.Scanner;

public class NameHashSet {

	public static void main(String[] args) {
		//이름 5개를 입력받아 추가하는 프로그램
		HashSet<String> set = new HashSet<String>();
		Scanner scan = new Scanner(System.in);
		String str;
		int i = 0;
		for(i = 0; i < 5; i ++) {
			System.out.print("추가할 회원의 이름은 : ");
			str = scan.next();
			set.add(str);
		}
			System.out.println(set);
		
	}

}
