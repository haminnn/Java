import java.util.LinkedList;
import java.util.List;

public class LinkedFListTest {

	public static void main(String[] args) {
		List<String> list =  new LinkedList<String>();
		list.add("ȫ�浿");
		list.add("��浿");
		list.add("�ֱ浿");
		list.set(0, "���浿"); //0��° �ε����� ȫ�浿�� ���浿���� ����
		String s = list.get(0); // 0��° �ε����� ���浿�� s�� ����
		int size = list.size(); //list�� ũ�⸦ int size�� ����
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
