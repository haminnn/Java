import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�迭�� ũ�⸦ �Է��ϼ���");
		int num = input.nextInt();
		String[] str1 = new String[num];
		System.out.println("�迭�� ������ ���ڿ��� �Է��ϼ���");
		
		for(int i = 0 ; i< num; i ++) {
			str1[i] = input.next();
		}

		for(String s : str1) {
			System.out.println(s);
		}
		
	}
}
