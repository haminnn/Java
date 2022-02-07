import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("정수를 입력하세요");
//		int num = input.nextInt();
//		switch(num%2) {
//		case 0:
//			System.out.println("짝수입니다.");
//			break;
//		default :
//			System.out.println("홀수입니다.");
//			break;		
//		}
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("첫번째 숫자를 입력하세요");
//		int num1 = input.nextInt();
//		System.out.println("두번째 숫자를 입력하세요");
//		int num2 = input.nextInt();
//		System.out.println("연산자를 입력하세요");
//		String a = input.next();
//		
//		switch(a) {
//		case "+" :
//			System.out.printf("%d + %d = %d",num1, num2, num1+num2);
//			break;
//		case "-" :
//			System.out.printf("%d - %d = %d",num1, num2, num1-num2);
//			break;
//		case "*" :
//			System.out.printf("%d * %d = %d",num1, num2, num1*num2);
//			break;	
//		case "/" :
//			System.out.printf("%d / %d = %d",num1, num2, num1/num2);
//			break;
//		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int num = input.nextInt();
		String grade = null ; // 로컬변수ㅜ는 사용전에 반드시 초기화가 필요함, string은 reference 타입이므로 생성없이 선언만 해야 할 경우 null 할당
		if (num > 100) {
			System.out.println("잘못입력하셨습니다.");
		}
		else {
			switch(num/10) {
			case 6 :
				grade = "D" ;
				break;
			case 7 :
				grade = "C" ;
				break;
			case 8 :
				grade = "B" ;
				break;
			case 9 : case 10 :
				grade = "A" ;
				break;
			default :
				grade = "F" ;
				break;
			}
				System.out.printf("입력하신 %d점은 %s학점입니다.",num,grade);
		}
				
		 
 }
}
