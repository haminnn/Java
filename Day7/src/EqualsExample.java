import java.lang.reflect.Array;
import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		int[][] original = {{1,2}, {3,4}};
		
		System.out.println("[얇은 복제후 비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교 " + original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교 " + Arrays.equals(original, cloned1));
		System.out.println(Arrays.deepEquals(original, cloned1));
		
		System.out.println("\n[깊은 복제후 비교]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		
		
		System.out.println("배열 번지 비교");
		System.out.println("1차 배열 항복값 비교"+Arrays.equals(original, cloned2)); //값만 비교
		System.out.println("중첩배열 항복값");
		System.out.println("1차 배열 항복값 비교"+Arrays.deepEquals(original, cloned2)); // 서로다른 배열을 참조한 경우 중첩된 배열의 항목까지 비교

	}

}
