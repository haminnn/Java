
public class Test {
	public Test() {
		System.out.println("Test() called");
	}
	public Test(int a) {
		System.out.println("Test(int) called");
	}
	public Test(int a, int b) {
		this(a);
//		this(); // 생성자 메소드내에서 다른 생성자 메소드를 호출할때는 this로 호출해야하고 한번만 호출가능하고 첫번째 문장에 호출해줘야 한다.
		System.out.println("Test(int, int) called");
	}
	public Test(int a, int b,int...c) {
		System.out.println("Test(int, int) called");
	}
	public static void main(String[] args) {
//		Test t1 = new Test();
//		Test t2 = new Test(2);
		Test t3 = new Test(2,3);

	}

}
