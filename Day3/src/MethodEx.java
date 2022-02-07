
public class MethodEx {
	
	boolean b; // 멤버변수, 인스턴스 변수
	int num;
	char ch;
	double d;
	String s;
	
	public void method() { // 멤버메서드
		System.out.println(num);
		System.out.println(s);
	}
	// main 메서드는 멤버변수와 멤버메서드들과 다른 메서드입니다.(소유자 클래스가 다름)
	public static void main(String[] args) {
//		int a = 3, b = 3;
//		System.out.println(a == b);
//		String s1 = new String("java"); // heap
//		String s2 = new String("java"); // heap
//		String s3 = "java"; //string pool
//		String s4 = "java"; // string pool
//		System.out.println(s1 == s2); // heap 메모리에 각각의 객체가 생성
//		System.out.println(s1 == s3); // heap 메모리와 string pool 메모리 영역의 주소를 비교
//		System.out.println(s3 == s4); // string pool 메모리 영역에서 동일한 객체가 존재하면 참조변수는 해당 객체의 주소를 저장하고 참조하게 됨
//		
		
//		String s = null; // 참조변수는 생성전에 null을 할당해서 참조변수를 초기화함 
//		int num = 0; // 로컬변수는 사용전에 반드시 초기화해야 함
//		System.out.println(num);
//		System.out.println(s.length()); // Runtime Exception 발생
//		//오류 console 창에 NullPointerException은 객체를 생성하지 않은채 메서드를 호출했을 때 발생
		
		
//		// 멤버가 아닌경우, 반드시 객체 생성해서 사용해야 합니다.
//		MethodEx ex = new MethodEx();
//		System.out.println(ex.num);
//		System.out.println(ex.b);
//		System.out.println(ex.ch);
//		System.out.println(ex.d);
//		System.out.println(ex.s);
		
//		int[] nums;
//		int[] nums2;
//		nums = new int[5];
//		nums2 = new int[]{100, 200, 300};
//		
//		System.out.println(nums.length);
//		System.out.println(nums2.length);
//		
//		for(int idx = 0 ; idx < nums.length; idx ++) {
//			System.out.print(nums[idx] + " ");
//		}
//		
//		System.out.println();
//		
//		for(int n : nums2) { //순차적 접근만 가능 , advanced for문(foreach문)
//			System.out.println(n + "");
//		}
		
//		String[] strings;
		String[] strings2;
//		String[] strings3;
		
//		strings = new String[5];
		strings2 = new String[] {new String("java"), 
								new String("python"), 
								new String("db, sql")};
		
//		strings3 = new String[] {"Django", 
//								"jsp/servlet", 
//								"spring framework"};
		
		for(String n : strings2) {
			System.out.print(n + " ");
			
		}
		
				
		
		

	}

}
