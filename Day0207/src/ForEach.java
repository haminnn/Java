import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요");
		int num = input.nextInt();
		String[] str1 = new String[num];
		System.out.println("배열에 저장할 문자열을 입력하세요");
		
		for(int i = 0 ; i< num; i ++) {
			str1[i] = input.next();
		}

		for(String s : str1) {
			System.out.println(s);
		}
		
	}
}
