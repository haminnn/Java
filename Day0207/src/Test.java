import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요.");
		int num = input.nextInt();
		int[] scores = new int[num];
		getValues(scores);
		getAverage(scores);
		printArray(scores);

	}
	
	private static void getValues(int[] array) {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < array.length ; i ++) {
			System.out.println("점수를 입력하시오.");
			array[i] = input.nextInt();
		}

	}
	
	private static void getAverage(int[] array) {
		int sum = 0;
		int avg = 0;	
		for(int i = 0; i < array.length ; i ++) {
			sum += array[i];
		}
		avg = sum / array.length;
		System.out.println("평균성적은 " + avg + "입니다.");
	}

	private static void printArray(int[] array) {
		for(int i = 0; i < array.length ; i ++) {
			System.out.println("배열의 요소 :" +array[i]);
		}
	}

}
