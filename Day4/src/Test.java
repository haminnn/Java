
public class Test {
	public Test() {
		System.out.println("Test() called");
	}
	public Test(int a) {
		System.out.println("Test(int) called");
	}
	public Test(int a, int b) {
		this(a);
//		this(); // ������ �޼ҵ峻���� �ٸ� ������ �޼ҵ带 ȣ���Ҷ��� this�� ȣ���ؾ��ϰ� �ѹ��� ȣ�Ⱑ���ϰ� ù��° ���忡 ȣ������� �Ѵ�.
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
