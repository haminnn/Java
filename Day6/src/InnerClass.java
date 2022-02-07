
public class InnerClass {

	public static void main(String[] args) {
		//Inner 努贰胶 按眉 积己 规过1
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.innerMethod();
		// 规过 2
		Outer.Inner inner2 = new Outer().new Inner();
		inner2.innerMethod();

	}

}
