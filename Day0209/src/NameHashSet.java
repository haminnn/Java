import java.util.HashSet;
import java.util.Scanner;

public class NameHashSet {

	public static void main(String[] args) {
		//�̸� 5���� �Է¹޾� �߰��ϴ� ���α׷�
		HashSet<String> set = new HashSet<String>();
		Scanner scan = new Scanner(System.in);
		String str;
		int i = 0;
		for(i = 0; i < 5; i ++) {
			System.out.print("�߰��� ȸ���� �̸��� : ");
			str = scan.next();
			set.add(str);
		}
			System.out.println(set);
		
	}

}
