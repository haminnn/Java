import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
//		Employee em = new Employee();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�̸��� �Է��ϼ���");
//		em.name = scan.next();
//		scan.nextLine();
//		System.out.println("��ȭ��ȣ�� �Է��ϼ���");
//		em.tel = scan.next();
//		scan.nextLine();
//		System.out.println("������ �Է��ϼ���");
//		em.sal = scan.nextLong();
//		em.print();
//		
//		System.out.println("�޿��� �λ�����? : ");
//		double num = scan.nextDouble();
//		em.upsal(num);
		Employee em = new Employee();
		Scanner scan = new Scanner(System.in);
		String[] emp = new String[3];
		for(int i = 0; i < emp.length; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			em.name = scan.next();
			scan.nextLine();
			emp[i] = em.name;
			System.out.println("��ȭ��ȣ�� �Է��ϼ���");
			em.tel = scan.next();
			scan.nextLine();
			emp[i] = em.tel;
			System.out.println("������ �Է��ϼ���");
			em.sal = scan.nextLong();
			em.print();
		}
		
		
		

	}

}
