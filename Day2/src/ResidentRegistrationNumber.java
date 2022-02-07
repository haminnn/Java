import java.util.Scanner;

public class ResidentRegistrationNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("주민등록번호를 입력하세요");
		String a = input.nextLine();
		
		if(a.length()!=14) {
			System.out.println("주민등록번호가 제대로 입력되지 않았습니다.");
			return;
		}
		int total = 0;
		
		String[] b = a.split("-");
		int[] c = {2,3,4,5,6,7,8,9,2,3,4,5};
		
		for(String str : b) {
			System.out.print(str);
		}
		
		

	}

}
