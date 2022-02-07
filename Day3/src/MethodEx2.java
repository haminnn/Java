
public class MethodEx2 {
	private int num; // 멤버변수
	public void setNum(int num) {//매개변수 num은 로컬변수
		//값의 유효성 검사 코드
		// 로컬변수와 멤버변수간에 이름 충돌이 발생하면 멤버변수 앞에 클래스로부터 생성되는 객체 자신을 의미하는 특별한 참조변수를 사용한다.파이썬 self와 같은 역할 this
		this.num = num;
	}
	public int getNum() {
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
