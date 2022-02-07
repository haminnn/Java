
public class OperaterEx1 {

	public static void main(String[] args) {
		
		int num = 3;
//		num = -num;
//		System.out.println(~num);
		
		int a = ++num; //전위연산
		System.out.println("num="+num+", "+ "a="+a);
		
		a = num++; //휘위연산, a에 대입되기전에 연산이 되고 a는 연산전의 값이 대입된다
		System.out.println("num="+num+", "+ "a="+a);
		
		int x = 3, y = 3;
		a = ++x + ++y;
		System.out.println("x="+x+", "+ "y= "+y+", " +"a = " +a);
		
		a = x++ + y++;
		System.out.println("x="+x+", "+ "y= "+y+", " +"a = " +a);
		
		boolean flag = false ;
		System.out.println(!flag);
		
		
	}

}
