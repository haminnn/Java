class Outer3 {
	private int member = 1;
	public void outerMethod() {
		int local = 0;
		class Inner {
			int member = 100;
			public void innerMethod() {
				System.out.println(member);
				System.out.println(local);
				System.out.println(Outer3.this.member);
			}
		}
		Inner inn = new Inner();
		inn.innerMethod();
	}
}
public class InnerClass3 {
		public static void main(String[] args) {		 
			Outer3 outer = new Outer3();
			outer.outerMethod();
		}
	}