
public class MethodEx {
	
	boolean b; // �������, �ν��Ͻ� ����
	int num;
	char ch;
	double d;
	String s;
	
	public void method() { // ����޼���
		System.out.println(num);
		System.out.println(s);
	}
	// main �޼���� ��������� ����޼����� �ٸ� �޼����Դϴ�.(������ Ŭ������ �ٸ�)
	public static void main(String[] args) {
//		int a = 3, b = 3;
//		System.out.println(a == b);
//		String s1 = new String("java"); // heap
//		String s2 = new String("java"); // heap
//		String s3 = "java"; //string pool
//		String s4 = "java"; // string pool
//		System.out.println(s1 == s2); // heap �޸𸮿� ������ ��ü�� ����
//		System.out.println(s1 == s3); // heap �޸𸮿� string pool �޸� ������ �ּҸ� ��
//		System.out.println(s3 == s4); // string pool �޸� �������� ������ ��ü�� �����ϸ� ���������� �ش� ��ü�� �ּҸ� �����ϰ� �����ϰ� ��
//		
		
//		String s = null; // ���������� �������� null�� �Ҵ��ؼ� ���������� �ʱ�ȭ�� 
//		int num = 0; // ���ú����� ������� �ݵ�� �ʱ�ȭ�ؾ� ��
//		System.out.println(num);
//		System.out.println(s.length()); // Runtime Exception �߻�
//		//���� console â�� NullPointerException�� ��ü�� �������� ����ä �޼��带 ȣ������ �� �߻�
		
		
//		// ����� �ƴѰ��, �ݵ�� ��ü �����ؼ� ����ؾ� �մϴ�.
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
//		for(int n : nums2) { //������ ���ٸ� ���� , advanced for��(foreach��)
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
