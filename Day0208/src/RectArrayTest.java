
public class RectArrayTest {

	public static void main(String[] args) {
		Rect[] list = new Rect[5];
		
		for(int i =0; i < list.length ; i ++) {
			list[i] = new Rect(i, i);
		}
		
		for(int i = 0; i < list.length ; i++) {
			System.out.println(i + "��° �簢���� ����" + list[i].calcArea());
		}

	}

}
