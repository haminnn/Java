
public class ExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("start");
		int num = -1;
		try {
			num = Integer.parseInt(args[0]);
			System.out.println("다른 실행 코드");
		}catch(NumberFormatException e) {
			System.out.println("NFE 에외처리");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOBE 에외처리");
		}finally {
			System.out.println("resource 정리");
		}
		if (num%2 == 0) {//로직
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		System.out.println("end");

	}

}
