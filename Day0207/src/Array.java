import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		int[] scores = new int[3]; //�迭�� �����Ҷ� ������ ũ�⸦ �������־���Ѵ�.
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < scores.length; i ++) {
			System.out.println("������ �Է��Ͻÿ�.");
			scores[i] = input.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < scores.length; i ++) { 
			sum+= scores[i];
		}
		
		System.out.println("��ռ����� " + sum / scores.length + "�Դϴ�.");
		print();
			
	}
	static void print() {
		System.out.println("******");
	}

}
