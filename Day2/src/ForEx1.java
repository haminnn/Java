import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		
//		//1~10������ Ȧ���� ���
//		for(int i = 0; i < 11 ; i ++) {
//			if(i % 2 == 1) {
//				System.out.println(i);
//			}	
//		}
		
		
//		//1~10������ Ȧ���� �������� ���
//		
//		for(int n = 10 ; n > 0; n--) {
//			if(n % 2 == 1) {
//				System.out.print(n);
//			}		
//		}
	
		
//		//1~10������ ��� ������ �� ���
//		int sum = 0;
//		for(int i = 0; i < 11 ; i ++) {
//			sum = sum + i;
//			}
//		System.out.println(sum);
		
		// ������ �Է¹ް�. ������ ������� �� ���
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int num = input.nextInt();
		int sum = 0;
		
		for (int n = 1; n < num+1; n ++) {
			if(num % n == 0) {
				System.out.print(n + ", ");
				sum = sum + n;
			}
		}
		System.out.println("������� ���� "+sum+"�Դϴ�.");
		
		
//		//���ĺ��빮�ڸ��̱�
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
