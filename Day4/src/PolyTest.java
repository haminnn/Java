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
		Parent8 p = new Child8(); //������ ��ü
		System.out.println(p.num); //����ʵ�� �����ڿ켱 Parent8�� num�� ������.
		System.out.println(p.age); //
//		System.out.println(p.phone); //�����Ͽ���
		System.out.println(((Child8)p).phone); // Down casting
		p.method();
		p.sound();
//		p.dance(); // ������ ����, ������ ��ü�� �θ� ������� ���� �ʵ�� �޼���� down casting�ؾ� ��밡��
		((Child8)p).dance(); //Down casting

	}

}
