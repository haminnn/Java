import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���");
		int num1 = scan.nextInt();
		scan.nextLine();
		int num2 = scan.nextInt();
		Add add = new Add(num1,num2);
		Minus minus = new Minus(num1,num2);
		multiply multiply = new multiply(num1,num2);
		devide devide = new devide(num1,num2);
		System.out.println("�����ڸ� �Է��ϼ���");
		String str1 = scan.next();
		
		if(str1.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + add.calculate(num1,num2));
		}else if(str1.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + minus.calculate(num1,num2));
		}else if(str1.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + multiply.calculate(num1,num2));
		}else if(str1.equals("/")) {
			System.out.println(num1 + " / " + num2 + " = " + devide.calculate(num1,num2));
		}
		

	}

}
