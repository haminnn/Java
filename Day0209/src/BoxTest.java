
public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box(100);
		Box b2 = new Box(85.0);
		if(b1.compareTo(b2)>0) {
			System.out.println("b1�� b2���� �� ũ��.");
		}else {
			System.out.println("b1�� b2�� ���ų� �۴�");
		}
	}

}
