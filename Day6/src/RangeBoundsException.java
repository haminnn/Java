
public class RangeBoundsException extends Exception{
	private double last_tall = 161;
	public RangeBoundsException(String message) {
		super(message);
	}
	public double getLast_tall() {
		return last_tall;
	}

}

//130~180벗어나면 예외발생시킨다.
// 에외가 발생되면 예외클래스에 저장된 작년도 키값으로 보정한다.
// 올해의 중학생 평균키를 출력한다.
