import java.util.Random;
import java.util.Scanner;

public class RandomNumberTest {

	public static void main(String[] args) {
		// ������ ������ 0���� ũ�ų� ���� 1���� �۴�
		//5���� ����Ƚ������ 1~100���̿� ������ �� ���߱�
		Random random = new Random();
		int a = random.nextInt(100+1);
		System.out.print(a);
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		for(int i = 4; i >=0; i--) {
			System.out.println("���ڸ� ���纸����");
			num = input.nextInt();
			if (a < num) {
				System.out.println("down!");
			}
			else if (a > num) {
				System.out.println("up!");
			}
			else {
				System.out.printf("�����Դϴ�.%d������ ���߼̳׿�",5-i);
				break;
			}
			if(i == 0){
				System.out.println("�������ϴ�.");
				break;
			}
			System.out.printf("���� ��ȸ�� %d���Դϴ�.\n",i);
		}
		
		
		
		

	}

}
