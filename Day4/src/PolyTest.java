class Parent8{
	int num = 1, age = 1;
	public void method() {
		System.out.println("parent's mehtod() called");
	}
	public void sound() {
		System.out.println("parent's sound() called");
	}
}
class Child8 extends Parent8{
	int num= 100, phone = 0;
	public void method() {
		System.out.println("child's mehtod() called");
	}
	public void dance() {
		System.out.println("child's dance() called");
	}
}
public class PolyTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent8 p = new Child8(); //다형성 객체
		System.out.println(p.num); //멤버필드는 선언자우선 Parent8의 num이 찍힌다.
		System.out.println(p.age); //
//		System.out.println(p.phone); //컴파일에러
		System.out.println(((Child8)p).phone); // Down casting
		p.method();
		p.sound();
//		p.dance(); // 컴파일 에러, 다형성 객체는 부모에 선언되지 않은 필드와 메서드는 down casting해야 사용가능
		((Child8)p).dance(); //Down casting

	}

}
