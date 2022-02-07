import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		
//		//1~10사이의 홀수만 출력
//		for(int i = 0; i < 11 ; i ++) {
//			if(i % 2 == 1) {
//				System.out.println(i);
//			}	
//		}
		
		
//		//1~10사이의 홀수만 역순으로 출력
//		
//		for(int n = 10 ; n > 0; n--) {
//			if(n % 2 == 1) {
//				System.out.print(n);
//			}		
//		}
	
		
//		//1~10사이의 모든 정수의 합 출력
//		int sum = 0;
//		for(int i = 0; i < 11 ; i ++) {
//			sum = sum + i;
//			}
//		System.out.println(sum);
		
		// 정수를 입력받고. 약수들과 약수들의 합 출력
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = input.nextInt();
		int sum = 0;
		
		for (int n = 1; n < num+1; n ++) {
			if(num % n == 0) {
				System.out.print(n + ", ");
				sum = sum + n;
			}
		}
		System.out.println("약수들의 합은 "+sum+"입니다.");
		
		
//		//알파벳대문자만뽑기
//		
//		for(char a = 'A'; a <= 'Z' ; a++) {
//			
//			System.out.print(a);
//		}
//		System.out.println();
//		for(int b = 65; b <= 90 ; b++) {
//			
//			System.out.print((char)b + "");
//		}
		
	}

}
