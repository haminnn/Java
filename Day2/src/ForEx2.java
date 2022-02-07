
public class ForEx2 {

	public static void main(String[] args) {
		//
//		for(int i = 1; i <=5; i ++) {
//			for(int j = 1; j <=5; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
//		for(int i = 1; i <=5; i ++) {
//			for(int j = 1; j <=5; j++) {
////				if (i != j) continue;
//				if(i >= j) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");	
//				}
//			}		
//			System.out.println();
//		}
		
		
//		a1 : // label
//		for(int i = 0; i < 3; i ++) {
//		a2 : //label
//			for(int j = 0; j < 3; j ++){
////				if (j == 1) continue ;
//				if(i == 1) break a1; //브레이크 뒤에 선언된 라벨넘버를 언급하면 언급된 라벨까지 빠져나온다.
//				System.out.println("i = "+i+",j = "+ j);
//			}
//		}
		
//		for(int i = 1; i <=5; i ++) {
//		for(int j = 1; j <=5; j++) {
////			if (i != j) continue;
//			if(i == j) {
//				
//				System.out.print("*");
//			}
//			else {
//				System.out.print(" ");	
//			}
//		}		
//		System.out.println();
//	}
		
//		// while문 사용한 1부터 10까지의 정수의 합
//		int sum = 0;
//		int a = 0;
//		while (a <= 10) {
//			sum = sum + a;
//			a++;
//		}
//		System.out.println(sum);
		
		
		
		for(int a = 2; a < 100; a ++) {
		boolean flag = false;
			for(int b = 2 ; b < a-1; b++) {
				if(a % b == 0 ) {
					flag = true;
					break;	
				}
			}
			if(!flag == true) {
			System.out.println(a);
			}
		}
		
		
		
		
	}

}
