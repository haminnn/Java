import java.util.*;
public class HashMap_WordFindTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		String nation;
		int num;
		int i;
		boolean flag = true;
		int max = 0;
		String nat = null;
		System.out.println("���� �̸��� �α��� 3�� �Է��ϼ���.(��: �ѱ� 5000)");
		for(i = 1; i <4; i ++) {
			System.out.println(i+". ���� �̸�, �α�>>" );
			nation = scan.next();
			num = scan.nextInt();
			map.put(nation,num);
			max = num;
		}
		
		Set<String> keySet =  map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			if(map.get(key) >= max) {
				max = map.get(key);
				nat = key;
				
			}
		}
		System.out.println(String.format("���� �α����� ū ����� %s, %s�Դϴ�.",nat, max));
		
		
	}

}
