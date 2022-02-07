
public class VariableTest {
	public int a; // 인스턴스 변수
	public final int PORT = 5000; // 상수, 상수는 선언만 하면 안되고 초기화를 해줘야 한다. final이 떨어진 상수는 절대 변경 불가능
	public static int cnum; // 클래스 변수
	public static void main(String[] args) {
		VariableTest test = new VariableTest();
		System.out.println(test.a);
		System.out.println(test.PORT);
		System.out.println(test.cnum);
		// test.PORT = 3000; //컴파일 에러
		

	}

}
