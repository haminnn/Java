package pkg1;

public class Parent {
	public String name = "parent"; //public은 범위가 가장 크다 어디서든 엑세스 가능
//	protected String name = "parent"; // protected 외부패키지에서 엑세스할때는 상속관계일경우만 엑세스가능
//	String name = "parent"; //default는 같은 패키지 안에 있는 클래스에서만 엑세스 가능하다, 외부 패키지에서는 엑세스 불가
//	private String name = "parent"; // private는 클래스 내부에서만 엑세스 가능하다, 같은 패키지여도 클래스가 다르면 X,상속 X
	
	public String getName() {
		
		//권한 체크, 유효성체크등
		return name;
	}
	public void setName(String name) {
		
		//권한 체크, 유효성체크등
		this.name = name;
	}
}

