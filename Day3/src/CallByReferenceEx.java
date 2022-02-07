
public class CallByReferenceEx {
	public void change(int[] a, int[] b) {
		int temp = a[0];
		a[0] = b[0];
		b[0] = temp;
	}

	public static void main(String[] args) {
		int[] x = {3}, y = {7};
		CallByReferenceEx ex = new CallByReferenceEx();
		System.out.println("x = "+x[0]+", y = "+ y[0]);
		ex.change(x, y);
		System.out.println("x = "+x[0]+", y = "+ y[0]);

	}

}
