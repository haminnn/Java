
public class InstanceVariableTest {
	public int num; //�ν��Ͻ� ����, ex)Student��ü�� �й�,�̸�...
	public static void main(String[] args) {
		InstanceVariableTest test = new InstanceVariableTest();
		System.out.println(test.num);
		test.num = 50;
		System.out.println(test.num);
		
		InstanceVariableTest t2 = new InstanceVariableTest();
		System.out.println(t2.num);
		t2.num = 100;
		System.out.println(t2.num);
		test = new InstanceVariableTest();
		System.out.println(test.num);
		test.num = 222;
		System.out.println(test.num);
		

	}

}
