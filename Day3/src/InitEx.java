
public class InitEx {// 생성자 메서드에서 선언가능한 접근 제어자 : public, protected, (default), ptivate
					 // 리턴타입 선언 X, 변경자 선언 X
					 // overload 가능, overload된 다른 생성자 호출 가능
	

	public static void main(String[] args) {
//		Integer i = new Integer(3);
//		Integer i2 = new Integer("3");
//		Integer i3 = new Integer(); // 컴파일 오휴, 생성자를 하나도 명시적으로 정의하지 않으면 컴파일시에 자동으로 jdk가 default 생성자를 만들어줌
									// 생성자를 명시적으로 정의하면 컴파일시에 자동으로 jdk가 default 생성자를 만들어주지 않는다.
		Student s1 = new Student("s201501122","ham",85,90,95);
		s1.printAverage();

	}

}
