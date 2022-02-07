
public class Test3 {

	public static void main(String[] args) { //부모클래스로부터 상속안되는것:private멤버 필드와 메서드, 생성자
		Object o = new Object();
		String s = new String("java");
		Integer i = new Integer("100");
		System.out.println(o instanceof Object);
		System.out.println(s instanceof Object);
		System.out.println(o instanceof String);
//		System.out.println(i instanceof String); //컴파일오류

	}

}
