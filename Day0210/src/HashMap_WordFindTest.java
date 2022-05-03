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
		System.out.println("나라 이름과 인구를 3개 입력하세요.(예: 한국 5000)");
		for(i = 1; i <4; i ++) {
			System.out.println(i+". 나라 이름, 인구>>" );
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
		System.out.println(String.format("가장 인구수가 큰 나라는 %s, %s입니다.",nat, max));
		
		
	}

}
