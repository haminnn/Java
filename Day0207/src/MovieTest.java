import java.util.Scanner;

public class MovieTest {

	public static void main(String[] args) {
		Movie mv = new Movie();
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 영화제목을 입력하세요");
		mv.year = scan.nextInt();
		scan.nextLine();//이걸 써줘야 엔터를 눌렀을때 밑에 있는 두번째 입력을 실행시킬 수 있다.
		mv.name = scan.nextLine();
		mv.print();

	}

}
