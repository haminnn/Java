class Parent3{
	Parent3(){
		System.out.println("Parent3�� default ������ ȣ���");
	}
	
}
class Child3 extends Parent3{
	Child3(){
		System.out.println("Child3�� default ������ ȣ���");
	}
	
	
}
public class ExtendsEx3 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		
	}

}
