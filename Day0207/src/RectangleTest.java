import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Scanner input = new Scanner(System.in);
		System.out.println("���ο� ���̸� �Է��ϼ���");
		rec.w1 = input.nextInt();
		rec.h1 = input.nextInt();
		System.out.println(rec.area());
		
		

	}

}
