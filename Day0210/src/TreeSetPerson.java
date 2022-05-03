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
			System.out.println("ȸ�� ���� ���α׷�");
			System.out.println("=================================");
			System.out.println("1.ȸ������ \n2.ȸ��Ż��\n3.ȸ�����\n4.����");
			System.out.println("=================================");
			System.out.print("�޴��� ���� :");
			num = scan.nextInt();
			
			switch(num) {
				case 1:
					System.out.println("******1.ȸ������******");
					System.out.println("�̸��� �Է��ϼ���");
					name = scan.next();
					System.out.println("���̸� �Է��ϼ���");
					age = scan.nextInt();
					Member mem = new Member(name, age);
					if(treeSet.add(mem)) {
						System.out.println("ȸ�������� �Ǿ����ϴ�.");
					}else {
						System.out.println("�̹� ������ ȸ���Դϴ�.");
					}
					break;
					
				case 2:
					System.out.println("******2.ȸ��Ż��******");
					System.out.println("Ż���� ȸ���� �̸��� �Է��ϼ���");
					name = scan.next();
					System.out.println("Ż���� ȸ���� ���̸� �Է��ϼ���");
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
						System.out.println("�����Ǿ����ϴ�.");
					}else {
						System.out.println("�߸��Է��߽��ϴ�.");
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
