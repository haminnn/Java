import java.util.*;
public class PhoneListTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		
		int num, i;
		String name, findName, phone;
		
		System.out.println("�Է��Ϸ��� �������� ����:");
		num = scan.nextInt();
		System.out.println("�̸��� ��ȭ��ȣ�� �Է��ϼ���. (��: ȫ�浿010-111-1212");
		for(i = 1; i <= num; i++) {
			System.out.println(i+". �̸�, ��ȭ��ȣ>>");
			name = scan.next();
			phone = scan.next();
			map.put(name,phone);
		}
		
		System.out.println("��ȭ��ȣ�� ã������ ȸ���� �̸���");
		findName = scan.next();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			if(key.equals(findName)) {
				System.out.println(String.format("%s���� ��ȭ��ȣ�� %s�Դϴ�.",key, map.get(findName)));
				break;
			}
		}
		scan.close();
	}

}
