abstract class Animal{
	public abstract void move();//�߻�޼ҵ�� �޸𸮿� ��ü������ �� �� ����.
								//newŰ���� X,��ü�� �������ϴ� Ŭ����ȣ �����ؾ���
	
}
class Outer4 {
  private int member=1;
  Animal cat = new Animal() { //Ŭ���� ���� ����, ������ ���ÿ� body ����
	@Override
	public void move() {		 
		System.out.println("��� ���, ����");
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