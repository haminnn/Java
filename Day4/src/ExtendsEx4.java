class Parent4{
	Parent4(String name){
		System.out.printf("Parent4(%s)�� default ������ ȣ���\n",name);
	}
	
}
class Child4 extends Parent4{
	Child4(){// �ڽ�Ŭ������ ������ �޼ҵ��� ù��° ���忡�� �ٸ� �����ڸ� ȣ������ ������
		     // �����Ͻÿ� jdk�� �θ�Ŭ������ default ������ �޼ҵ带 ȣ���ϴ� �ڵ带 �����Ѵ�.
			 // ���� �θ�Ŭ������ default ������ �޼ҵ尡 ���ǵǾ� ���� ������ ������ �߻��Ѵ�.
			 // �ذ��� 1:�θ�Ŭ������ default ������ �޼ҵ带 ����
			 // �ذ��� 2:�ڽ�Ŭ������ ������ �޼ҵ��� ù��° ���忡�� �θ�Ŭ������ ���ǵǾ��ִ�
			 // 		������ �޼ҵ带 ȣ�� 
		super("�θ�");
		System.out.println("Child4�� default ������ ȣ���");
	}
	
	
}
public class ExtendsEx4 {

	public static void main(String[] args) {
		Child4 c = new Child4();
		
	}

}
