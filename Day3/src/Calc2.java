
public class Calc2 {// method overload할 때 순서, 개수, 타입 중 최소 1개는 다르게 정의
					// return type이나 access modifier은 동일하지 않아도됨
	public void add(int x,int y) {
		System.out.println("add(int, int) called");
	}
	public double add(double x, double y) {
		System.out.println("add(double, double) called");
		return 0;
	}
	public void add(int a, int b, int...c) {// 가변파라미터(항상마지막에 선언), 파이썬에서는 *였지만 자바에서는 ...이다.
		System.out.println("c.length");
		for(int n : c) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	public void add(int a, double b) {
		System.out.println("add(int, double) called");
	}
	public void add(String a, String b) {
		System.out.println("add(String, String) called");
	}
	
	public static void main(String[] args) {
		Calc2 c2 = new Calc2();
		c2.add(2.0, 1.5);
		c2.add('a', 3);
		c2.add(1,2,3,4,5,6,7);
		c2.add(1,  2, new int[] {10,20,30,40,50,60,70});
		

	}

}
