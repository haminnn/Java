
public class ClassVariableTest {
	public static int cnum; //Ŭ��������, Ŭ���� ������ Constant Pool �޸� ������ �� �ϳ��� ������ �����ȴ�. ex) Ƽ�� ����
	public static void main(String[] args) {
		ClassVariableTest test = new ClassVariableTest(); // ��ü ����
		System.out.println(cnum);
		test.cnum = 50;
		System.out.println(cnum);
		ClassVariableTest.cnum = 100;
		System.out.println(ClassVariableTest.cnum);
		test = new ClassVariableTest(); // ��ü ����
		System.out.println(test.cnum);
		cnum*=2;
		System.out.println(cnum);
		System.out.println(ClassVariableTest.cnum);
		System.out.println(test.cnum);
		
		

	}

}
