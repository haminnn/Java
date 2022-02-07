import java.util.Random;
import java.util.Scanner;

public class RandomNumberTest {

	public static void main(String[] args) {
		// 난수의 범위는 0보다 크거나 같고 1보다 작다
		//5번의 도전횟수내에 1~100사이에 생각한 수 맞추기
		Random random = new Random();
		int a = random.nextInt(100+1);
		System.out.print(a);
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		for(int i = 4; i >=0; i--) {
			System.out.println("숫자를 맞춰보세요");
			num = input.nextInt();
			if (a < num) {
				System.out.println("down!");
			}
			else if (a > num) {
				System.out.println("up!");
			}
			else {
				System.out.printf("정답입니다.%d번만에 맞추셨네요",5-i);
				break;
			}
			if(i == 0){
				System.out.println("끝났습니다.");
				break;
			}
			System.out.printf("남은 기회는 %d번입니다.\n",i);
		}
		
		
		
		

	}

}
