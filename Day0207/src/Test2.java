import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		String name;
	    String tel;
	    long sal;
	    boolean run = true;
		
		
	    Scanner scan = new Scanner(System.in);
		ArrayList<Employee>list = new ArrayList<Employee>();

		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.����߰� | 2.������� | 3.������ | 4.����");
			System.out.println("------------------------------------");
			int num = scan.nextInt();
			switch(num){
				case 1:
					System.out.println("�̸��� �Է��ϼ���");
					name = scan.next();
					System.out.println("��ȭ��ȣ�� �Է��ϼ���");
					tel = scan.next();	
					System.out.println("������ �Է��ϼ���");
					sal = scan.nextLong();
					list.add(new Employee(name, tel, sal));
					System.out.println(list.size());
					
					break;
				case 2:
					int index = (int)list.size();
					System.out.println("�̸��� �Է��ϼ���");
					String remove_name = scan.nextLine();
					for(int i = 0; i < list.size(); i ++) {
						if(list.get(i).getName().equals(remove_name) ) {
							list.remove(i);
							
						}
						
					}
					
						
						
					
					break;
				case 3:
					for(Employee e : list) {
						e.print();
					}
					break;
				case 4:
					run = false;
					break;
			}
			
		}
		
		
		
		
		
		
		
//		for(int i = 0; i < em.length; i++) {
//			System.out.println("�̸��� �Է��ϼ���");
//			name = scan.next();
//			System.out.println("��ȭ��ȣ�� �Է��ϼ���");
//			tel = scan.next();	
//			System.out.println("������ �Է��ϼ���");
//			sal = scan.nextLong();
//			em[i] = new Employee(name, tel, sal);
//		}
		for(Employee e : list) {
            e.print();
         }


	}

}
