import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount user = new BankAccount();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while(run) {
		System.out.println("----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------");
		int num = scan.nextInt();
		switch(num) {
			case 1:
				System.out.println("입금액을 입력하세요");
				int num1 = scan.nextInt();
				user.deposit(num1);
				System.out.println(user.balance);
				user.print();
				break;
			case 2:
				System.out.println("출금액을 입력하세요");
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
		System.out.println("프로그램을 종료합니다.");
		user.print();
	}

}
