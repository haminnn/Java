
public class InnerClass {

	public static void main(String[] args) {
		//Inner Ŭ���� ��ü ���� ���1
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.innerMethod();
		// ��� 2
		Outer.Inner inner2 = new Outer().new Inner();
		inner2.innerMethod();

	}

}
