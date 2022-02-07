import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		int[] scores = new int[3]; //배열은 생성할때 무조건 크기를 성정해주어야한다.
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < scores.length; i ++) {
			System.out.println("성적을 입력하시오.");
			scores[i] = input.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < scores.length; i ++) { 
			sum+= scores[i];
		}
		
		System.out.println("평균성적은 " + sum / scores.length + "입니다.");
		print();
			
	}
	static void print() {
		System.out.println("******");
	}

}
