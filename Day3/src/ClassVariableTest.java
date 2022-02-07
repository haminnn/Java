
public class ClassVariableTest {
	public static int cnum; //클래스변수, 클래스 변수는 Constant Pool 메모리 영역에 단 하나의 변수만 생성된다. ex) 티켓 예매
	public static void main(String[] args) {
		ClassVariableTest test = new ClassVariableTest(); // 객체 생성
		System.out.println(cnum);
		test.cnum = 50;
		System.out.println(cnum);
		ClassVariableTest.cnum = 100;
		System.out.println(ClassVariableTest.cnum);
		test = new ClassVariableTest(); // 객체 생성
		System.out.println(test.cnum);
		cnum*=2;
		System.out.println(cnum);
		System.out.println(ClassVariableTest.cnum);
		System.out.println(test.cnum);
		
		

	}

}
