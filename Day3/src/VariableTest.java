
public class VariableTest {
	public int a; // �ν��Ͻ� ����
	public final int PORT = 5000; // ���, ����� ���� �ϸ� �ȵǰ� �ʱ�ȭ�� ����� �Ѵ�. final�� ������ ����� ���� ���� �Ұ���
	public static int cnum; // Ŭ���� ����
	public static void main(String[] args) {
		VariableTest test = new VariableTest();
		System.out.println(test.a);
		System.out.println(test.PORT);
		System.out.println(test.cnum);
		// test.PORT = 3000; //������ ����
		

	}

}
