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
			System.out.println("1.사원추가 | 2.사원삭제 | 3.사원출력 | 4.종료");
			System.out.println("------------------------------------");
			int num = scan.nextInt();
			switch(num){
				case 1:
					System.out.println("이름을 입력하세요");
					name = scan.next();
					System.out.println("전화번호를 입력하세요");
					tel = scan.next();	
					System.out.println("연봉을 입력하세요");
					sal = scan.nextLong();
					list.add(new Employee(name, tel, sal));
					System.out.println(list.size());
					
					break;
				case 2:
					int index = (int)list.size();
					System.out.println("이름을 입력하세요");
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
//			System.out.println("이름을 입력하세요");
//			name = scan.next();
//			System.out.println("전화번호를 입력하세요");
//			tel = scan.next();	
//			System.out.println("연봉을 입력하세요");
//			sal = scan.nextLong();
//			em[i] = new Employee(name, tel, sal);
//		}
		for(Employee e : list) {
            e.print();
         }


	}

}
