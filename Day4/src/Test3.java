
public class Test3 {

	public static void main(String[] args) { //�θ�Ŭ�����κ��� ��ӾȵǴ°�:private��� �ʵ�� �޼���, ������
		Object o = new Object();
		String s = new String("java");
		Integer i = new Integer("100");
		System.out.println(o instanceof Object);
		System.out.println(s instanceof Object);
		System.out.println(o instanceof String);
//		System.out.println(i instanceof String); //�����Ͽ���

	}

}
