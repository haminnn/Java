
public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box(100);
		Box b2 = new Box(85.0);
		if(b1.compareTo(b2)>0) {
			System.out.println("b1이 b2보다 더 크다.");
		}else {
			System.out.println("b1이 b2와 같거나 작다");
		}
	}

}
