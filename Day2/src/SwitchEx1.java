import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("������ �Է��ϼ���");
//		int num = input.nextInt();
//		switch(num%2) {
//		case 0:
//			System.out.println("¦���Դϴ�.");
//			break;
//		default :
//			System.out.println("Ȧ���Դϴ�.");
//			break;		
//		}
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("ù��° ���ڸ� �Է��ϼ���");
//		int num1 = input.nextInt();
//		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
//		int num2 = input.nextInt();
//		System.out.println("�����ڸ� �Է��ϼ���");
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
		System.out.println("������ �Է��ϼ���");
		int num = input.nextInt();
		String grade = null ; // ���ú����̴� ������� �ݵ�� �ʱ�ȭ�� �ʿ���, string�� reference Ÿ���̹Ƿ� �������� ���� �ؾ� �� ��� null �Ҵ�
		if (num > 100) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
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
				System.out.printf("�Է��Ͻ� %d���� %s�����Դϴ�.",num,grade);
		}
				
		 
 }
}
