class Parent4{
	Parent4(String name){
		System.out.printf("Parent4(%s)의 default 생성자 호출됨\n",name);
	}
	
}
class Child4 extends Parent4{
	Child4(){// 자식클래스는 생성자 메소드의 첫번째 문장에서 다른 생성자를 호출하지 않으면
		     // 컴파일시에 jdk가 부모클래스의 default 생성자 메소드를 호출하는 코드를 삽입한다.
			 // 만약 부모클래스에 default 생성자 메소드가 정의되어 있지 않으면 오류가 발생한다.
			 // 해결방법 1:부모클래스에 default 생성자 메소드를 정의
			 // 해결방법 2:자식클래스의 생성자 메소드의 첫번째 문장에서 부모클래스에 정의되어있는
			 // 		생성자 메소드를 호출 
		super("부모");
		System.out.println("Child4의 default 생성자 호출됨");
	}
	
	
}
public class ExtendsEx4 {

	public static void main(String[] args) {
		Child4 c = new Child4();
		
	}

}
