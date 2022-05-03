import java.util.*;

public class TreeSetPerson {

	public static void main(String[] args) {
		TreeSet<Member> treeSet = new TreeSet<Member>();
		boolean run = true;
		int num;
		String name;
		int age;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("=================================");
			System.out.println("회원 관리 프로그램");
			System.out.println("=================================");
			System.out.println("1.회원가입 \n2.회원탈퇴\n3.회원출력\n4.종료");
			System.out.println("=================================");
			System.out.print("메뉴를 선택 :");
			num = scan.nextInt();
			
			switch(num) {
				case 1:
					System.out.println("******1.회원가입******");
					System.out.println("이름을 입력하세요");
					name = scan.next();
					System.out.println("나이를 입력하세요");
					age = scan.nextInt();
					Member mem = new Member(name, age);
					if(treeSet.add(mem)) {
						System.out.println("회원가입이 되었습니다.");
					}else {
						System.out.println("이미 가입한 회원입니다.");
					}
					break;
					
				case 2:
					System.out.println("******2.회원탈퇴******");
					System.out.println("탈퇴할 회원의 이름을 입력하세요");
					name = scan.next();
					System.out.println("탈퇴할 회원의 나이를 입력하세요");
					age = scan.nextInt();
					boolean flag = false;
					Member mem2 = new Member(name, age);
					
					for(Iterator<Member> iterator = treeSet.iterator();iterator.hasNext();) {
						Member one = iterator.next();
						if(one.equals(mem2)) {
							flag = true;
							break;
						}
					}
					
					if(flag) {
						treeSet.remove(mem2);
						System.out.println("삭제되었습니다.");
					}else {
						System.out.println("잘못입력했습니다.");
					}
					break;
					
				case 3:
					System.out.println(treeSet);
					break;
					
				case 4:
					run = false;
					break;
			}
		}
		
		
	}

}
