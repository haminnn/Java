
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public long getSal() {
		return sal;
	}

	public void setSal(long sal) {
		this.sal = sal;
	}
	
	void upsal(double amt) {
		sal = sal + (int)(sal * amt / 100);
		print();
	}
	
	void print() {
		System.out.println("이름 : " + name + ", 전화번호 : " + tel + ", 연봉 : " + sal);
	}

}
