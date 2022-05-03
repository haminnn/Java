public class Member implements Comparable<Member>{
	private String name;
	private int age;
	
	public Member() {
		this("",0);
	}
	
	public Member(String name) {
		this(name,0);
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + ", ���� : " + age + "";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //instanceof �� ��ü���� Ȯ��
			Member member = (Member) obj;
			return member.name.equals(name) ;
		}else {
			return false;
		}
	}
	@Override
	public int compareTo(Member obj)
	{
	return this.name.compareTo(obj.name);
	}

	
}
