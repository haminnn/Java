import java.util.*;
public class PhoneListTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		
		int num, i;
		String name, findName, phone;
		
		System.out.println("입력하려는 데이터의 수는:");
		num = scan.nextInt();
		System.out.println("이름과 전화번호를 입력하세요. (예: 홍길동010-111-1212");
		for(i = 1; i <= num; i++) {
			System.out.println(i+". 이름, 전화번호>>");
			name = scan.next();
			phone = scan.next();
			map.put(name,phone);
		}
		
		System.out.println("전화번호를 찾으려는 회원의 이름은");
		findName = scan.next();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			if(key.equals(findName)) {
				System.out.println(String.format("%s님의 전화번호는 %s입니다.",key, map.get(findName)));
				break;
			}
		}
		scan.close();
	}

}
