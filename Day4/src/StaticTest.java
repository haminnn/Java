
public class StaticTest {
	public int num;
	public static int snum;
	
	public void method() {
		System.out.println(num);
		System.out.println(snum);
	}
	public void method2() {
		method();
		staticMethod();
	}
	
	public static void staticMethod() {
		System.out.println(snum);
	}
	public static void staticMethod2() {
//		method(); // ����
		staticMethod();
	}
	

}
