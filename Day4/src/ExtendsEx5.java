class Parent5{
	public void info(String description) {
		System.out.println("Parent5�� info()�� ȣ���");
		
	}
	
}
class Child5 extends Parent5{
	
	public void info(String description) {
		System.out.println("Child5���� ��ӹ��� info()�� version up��");
		
	}

	public void info(String description, String title) { // �θ�κ��� override�� �޼ҵ�� 1���� ���ǰ���
										  				 // �ڽ�Ŭ������ ��ȿ������ �θ𺸴� ũ�ų� ���ƾ��Ѵ�.
										  				 // �޼��� �̸��� ����Ÿ���� �����ؾ� �Ѵ�.
		System.out.println("Child5���� ��ӹ��� info()�� version up��");
		
	}
}
public class ExtendsEx5 {

	public static void main(String[] args) {
		Child5 c = new Child5();
		c.info("java");
		c.info("java","bit");
	}

}
