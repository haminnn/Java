
public class InitEx {// ������ �޼��忡�� ���𰡴��� ���� ������ : public, protected, (default), ptivate
					 // ����Ÿ�� ���� X, ������ ���� X
					 // overload ����, overload�� �ٸ� ������ ȣ�� ����
	

	public static void main(String[] args) {
//		Integer i = new Integer(3);
//		Integer i2 = new Integer("3");
//		Integer i3 = new Integer(); // ������ ����, �����ڸ� �ϳ��� ��������� �������� ������ �����Ͻÿ� �ڵ����� jdk�� default �����ڸ� �������
									// �����ڸ� ��������� �����ϸ� �����Ͻÿ� �ڵ����� jdk�� default �����ڸ� ��������� �ʴ´�.
		Student s1 = new Student("s201501122","ham",85,90,95);
		s1.printAverage();

	}

}
