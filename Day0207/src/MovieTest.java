import java.util.Scanner;

public class MovieTest {

	public static void main(String[] args) {
		Movie mv = new Movie();
		Scanner scan = new Scanner(System.in);
		System.out.println("�⵵�� ��ȭ������ �Է��ϼ���");
		mv.year = scan.nextInt();
		scan.nextLine();//�̰� ����� ���͸� �������� �ؿ� �ִ� �ι�° �Է��� �����ų �� �ִ�.
		mv.name = scan.nextLine();
		mv.print();

	}

}
