
public class OperaterEx2 {

	public static void main(String[] args) {
//		//���������(+, -, /, *, %)
		int x = 3, y = 7;
		int result = x + y;
		
		System.out.println(result);
		
		result = x - y;
		System.out.println(result);
		
		result = x * y;
		System.out.println(result);
		
		result = x / y;
		System.out.println(result);
		
		result = x % y;
		System.out.println(result);
		
//		//�񱳿�����(>, >=, ==, !=, <, <=)
		int a = 3, b = 7;
		
		boolean sult = a >= b;		
		System.out.println(sult);
		
		sult = a == b;
		System.out.println(sult);
		
		sult = a <= b;
		System.out.println(sult);
		
		sult = a != b;
		System.out.println(sult);
		
		// ��Ʈ������(&, |, ^)
		int c = 3, d = 7;
		int re = c & d;
		System.out.println(re);
		
		re = c | d;
		System.out.println(re);
		
		re = c ^ d;
		System.out.println(re);
		
		// ��������(&&, ||) ���ǽ�&& ���ǽ�, ���ǽ� ||���ǽ�, ����� boolean
		int e = 3, f = 7;
		boolean ef = e >= f && e < f;
		System.out.println(ef);
		ef = e >= f || e < f ;
		System.out.println(ef);
		
		//shift ������(<<, >>, >>>)
		//left shift�� ��������bit�� �̵���Ű�� ������bit�� 0���� ����, X << Y = X*2^Y�� ����
		//right shift�� ���������� bit�� �̵���Ű�� ����bit�� sign bit�� ä�� X >> Y = X / 2^Y�� ����
		//unsigned right shift�� ���������� bit�� �̵���Ű�� ���� bit�� 0���� ä��, �׻� ���
		int g = 160, h = 3;
		int gh = g >> h;
		System.out.println(gh);
		gh = g >>> h;
		System.out.println(gh);
		gh = g << h;
		System.out.println(gh);
		
		// ���׿�����: operand 3, operator 1
		// ����ǥ���� ��? true �϶� ��:false�϶� ��
		// �ϳ��� ����� ������ ���� ū Ÿ������ promotion ����ȯ�� �Ͼ
		int i = 3, j = 7;
		double ij = i >= j ? 99.9 : 90 ;
		System.out.println(ij) ;
		
	}
}
