import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		Iterator<Member> iterator = set.iterator();

		Scanner scan = new Scanner(System.in);

		String str, str2;
		Boolean flag = false;

		set.add(new Member("김길동", 30));
		set.add(new Member("이길동", 30));
		set.add(new Member("홍길동", 30));

		System.out.println("총 객체수 : " + set.size());

		iterator = set.iterator();


		while(iterator.hasNext()) {
			Member mem = iterator.next();
			System.out.println(mem);
		}

		Iterator<Member> iterator2 = set.iterator();
		iterator2 = set.iterator();
		System.out.println("\n찾는 이름을 입력 : ");
		str = scan.next();

		while(iterator2.hasNext()) {
			Member mem2 = iterator2.next();
			if(mem2.getName().equals(str)) {
				System.out.println("\n찾는 데이터가 있다!!!");
				System.out.println("\n찾는 데이터");
				System.out.println(mem2);
				flag = true;
				break;
			}
		}

		if(flag == false) {
			System.out.println("찾는 데이터가 없다!!!");
		}

		Iterator<Member> iterator3 = set.iterator();
		iterator3 = set.iterator();
		System.out.println("\n삭제하려는 이름을 입력");
		str2 = scan.next();

		while(iterator3.hasNext()) {
			Member mem3 = iterator3.next();

			if(mem3.getName().equals(str2)) {
				flag = true;
				iterator3.remove();

				Iterator<Member> iterator4 = set.iterator();
				iterator4 = set.iterator();
				System.out.println("\n삭제된 후");

				while(iterator4.hasNext()) {
					Member mem4 = iterator4.next();
					System.out.println(mem4);
				}
				break;
			}
		}

		if(flag == false) {
			System.out.println("\n찾는 데이터가 없다!!!");
		}





	}

}
