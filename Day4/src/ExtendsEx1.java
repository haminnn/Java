class Parent{
	String name = "parent";
	public void action() {
		System.out.println("Parent.action() called");
	}
}
class Child extends Parent{
	
}
public class ExtendsEx1 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.name);
		c.action();
	}

}
