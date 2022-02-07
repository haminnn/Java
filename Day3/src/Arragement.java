
public class Arragement {

	public static void main(String[] args) {
		//
//		int[][] nums;
		
////	nums = new int[5][5];
////	nums = new int[5][];
//		nums = new int[][] { {1},
//							{1,2},
//							{1, 2, 3 },
//							{1, 2, 3, 4}
//							};
//		System.out.println(nums.length); // 2차원 배열의 행size
//		System.out.println(nums[0].length); // 2차원 배열의 첫번 째 1차원 배열의 size
//		System.out.println(nums[1].length); // 2차원 배열의 두번째 1차원 배멸의 size
//		
//		for(int n = 0; n < nums.length; n++) {
//			for(int i = 0; i<nums[n].length; i ++) {
//				System.out.print(nums[n][i] + " ");
//				}
//			}
		
		int[] methods;
		methods = new int[10];
		int[] target;
		target = new int[10];
		for(int idx = 0; idx < methods.length; idx++) {
			methods[idx] = idx + 1;
			target[idx] = 100;
		}
		for(int n : methods) {
			System.out.print(n+ " ");
		}
		System.out.println();
		for(int n : target) {
			System.out.print(n+ " ");
		}
		System.out.println();
		System.arraycopy(methods, 4, target, 2, 4);
		for(int n : target) {
			System.out.print(n+ " ");
		}
		
	}

}
