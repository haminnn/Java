
public class Calc {
	int add(int x, int y) {
		int result = x + y;
		return result;
	}
	int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	int multiply(int x, int y) {
		int result = x * y;
		return result;
	}
	int devide(int x, int y) {
		int result = x / y;
		return result;
	}
	int squarpower(int x, int y) {
		int sum = 1;
		for(int a = 1;a <= y; a ++) {
			sum = sum * x;	
		}
		return sum;
	}

	public static void main(String[] args) {

	}

}
