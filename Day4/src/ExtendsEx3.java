class Parent3{
	Parent3(){
		System.out.println("Parent3의 default 생성자 호출됨");
	}
	
}
class Child3 extends Parent3{
	Child3(){
		System.out.println("Child3의 default 생성자 호출됨");
	}
	
	
}
public class ExtendsEx3 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		
	}

}
