
public abstract class Calc {
	private int x, y;
	public void setValue(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	public abstract int calculate(int x, int y);
	

}
