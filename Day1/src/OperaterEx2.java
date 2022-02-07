
public class OperaterEx2 {

	public static void main(String[] args) {
//		//산술연산자(+, -, /, *, %)
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
		
//		//비교연산자(>, >=, ==, !=, <, <=)
		int a = 3, b = 7;
		
		boolean sult = a >= b;		
		System.out.println(sult);
		
		sult = a == b;
		System.out.println(sult);
		
		sult = a <= b;
		System.out.println(sult);
		
		sult = a != b;
		System.out.println(sult);
		
		// 비트연산자(&, |, ^)
		int c = 3, d = 7;
		int re = c & d;
		System.out.println(re);
		
		re = c | d;
		System.out.println(re);
		
		re = c ^ d;
		System.out.println(re);
		
		// 논리연산자(&&, ||) 조건식&& 조건식, 조건식 ||조건식, 결과는 boolean
		int e = 3, f = 7;
		boolean ef = e >= f && e < f;
		System.out.println(ef);
		ef = e >= f || e < f ;
		System.out.println(ef);
		
		//shift 연산자(<<, >>, >>>)
		//left shift는 왼쪽으로bit를 이동시키고 오른쪽bit는 0으로 차움, X << Y = X*2^Y와 동일
		//right shift는 오른쪽으로 bit를 이동시키고 왼쪽bit는 sign bit로 채움 X >> Y = X / 2^Y와 동일
		//unsigned right shift는 오른쪽으로 bit를 이동시키고 왼쪽 bit는 0으로 채움, 항상 양수
		int g = 160, h = 3;
		int gh = g >> h;
		System.out.println(gh);
		gh = g >>> h;
		System.out.println(gh);
		gh = g << h;
		System.out.println(gh);
		
		// 삼항연산자: operand 3, operator 1
		// 조건표현식 항? true 일때 항:false일때 항
		// 하나의 연산식 내에서 가장 큰 타입으로 promotion 형변환이 일어남
		int i = 3, j = 7;
		double ij = i >= j ? 99.9 : 90 ;
		System.out.println(ij) ;
		
	}
}
