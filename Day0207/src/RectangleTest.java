import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Scanner input = new Scanner(System.in);
		System.out.println("가로와 높이를 입력하세요");
		rec.w1 = input.nextInt();
		rec.h1 = input.nextInt();
		System.out.println(rec.area());
		
		

	}

}
