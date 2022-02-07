abstract class Animal{
	public abstract void move();//추상메소드는 메모리에 객체생성을 할 수 없다.
								//new키워드 X,객체를 생성못하는 클래스호 선언해야함
	
}
class Outer4 {
  private int member=1;
  Animal cat = new Animal() { //클래스 선언 없이, 생성과 동시에 body 구현
	@Override
	public void move() {		 
		System.out.println("살금 살금, 점프");
	}	  
  };
  public void outerMethod(){  
	  cat.move();
  }//method end  
}
 public class InnerClass4 {
	public static void main(String[] args) {		 
		Outer4 outer = new Outer4();
		 outer.outerMethod();
	}
}