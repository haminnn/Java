
public class Employee {
	String name;
	String tel;
	long sal = 0;
	
	public Employee() {
		this("","", 0);
	}
	
	public Employee(String name, String tel, long sal) {
		this.name = name;
		this.tel = tel;
		this.sal = sal;
	}
	
	void upsal(double amt) {
		sal = sal + (int)(sal * amt / 100);
		print();
	}
	
	void print() {
		System.out.println("�̸� : " + name + ", ��ȭ��ȣ : " + tel + ", ���� : " + sal);
	}

}
