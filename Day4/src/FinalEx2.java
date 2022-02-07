class Parent7 {
	public final void info() {// final 메소드는 override를 하지못하도록 설계할때 쓰인다.
		System.out.println("version 1.0");
	}
}

class Child7 extends Parent7 {	
//	public final void info() { //컴파일 오류
//		System.out.println("version 2.0");
//	}
}

 
public class FinalEx2 {
	public static void main(String[] args) {
		 
	}
}