class Parent5{
	public void info(String description) {
		System.out.println("Parent5의 info()가 호출됨");
		
	}
	
}
class Child5 extends Parent5{
	
	public void info(String description) {
		System.out.println("Child5에서 상속받은 info()를 version up함");
		
	}

	public void info(String description, String title) { // 부모로부터 override한 메소드는 1개만 정의가능
										  				 // 자식클래스의 유효범위는 부모보다 크거나 같아야한다.
										  				 // 메서드 이름과 리턴타입은 동일해야 한다.
		System.out.println("Child5에서 상속받은 info()를 version up함");
		
	}
}
public class ExtendsEx5 {

	public static void main(String[] args) {
		Child5 c = new Child5();
		c.info("java");
		c.info("java","bit");
	}

}
