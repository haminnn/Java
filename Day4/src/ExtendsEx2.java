class Parent2{
	String name = "parent";
	public void action() {
		System.out.println("Parent.action() called");
	}
}
class Child2 extends Parent2{
	String name = "child";
	public void method() {
		String name = "local";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	
}
public class ExtendsEx2 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		System.out.println(c.name);
		c.action();
		c.method();
	}

}
