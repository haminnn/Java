import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
//		Employee em = new Employee();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("이름을 입력하세요");
//		em.name = scan.next();
//		scan.nextLine();
//		System.out.println("전화번호를 입력하세요");
//		em.tel = scan.next();
//		scan.nextLine();
//		System.out.println("연봉을 입력하세요");
//		em.sal = scan.nextLong();
//		em.print();
//		
//		System.out.println("급여의 인상율은? : ");
//		double num = scan.nextDouble();
//		em.upsal(num);
		Employee em = new Employee();
		Scanner scan = new Scanner(System.in);
		String[] emp = new String[3];
		for(int i = 0; i < emp.length; i++) {
			System.out.println("이름을 입력하세요");
			em.name = scan.next();
			scan.nextLine();
			emp[i] = em.name;
			System.out.println("전화번호를 입력하세요");
			em.tel = scan.next();
			scan.nextLine();
			emp[i] = em.tel;
			System.out.println("연봉을 입력하세요");
			em.sal = scan.nextLong();
			em.print();
		}
		
		
		

	}

}
