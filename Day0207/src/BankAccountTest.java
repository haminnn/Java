import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount user = new BankAccount();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while(run) {
		System.out.println("----------------------------");
		System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
		System.out.println("----------------------------");
		int num = scan.nextInt();
		switch(num) {
			case 1:
				System.out.println("�Աݾ��� �Է��ϼ���");
				int num1 = scan.nextInt();
				user.deposit(num1);
				System.out.println(user.balance);
				user.print();
				break;
			case 2:
				System.out.println("��ݾ��� �Է��ϼ���");
				int num2 = scan.nextInt();
				user.withdraw(num2);
				System.out.println(user.balance);
				user.print();	
				break;
			case 3:
				user.print();
				break;
			case 4:
				run = false;
				break;
		
			}
//		System.out.println(user.name + user.balance);
		}
		System.out.println("���α׷��� �����մϴ�.");
		user.print();
	}

}
