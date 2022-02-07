
public class Outer {
	
	private int member = 1;
	class Inner{
		private int member = 100;
		public void innerMethod() {
			System.out.println(member);
			System.out.println(Outer.this.member);
		}
	}
		
	public void outerMethod() {
			
	}
}
