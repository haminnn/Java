import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		Calc myCalc = new Calc();
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int num = input.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int num2 = input.nextInt();
		System.out.println("기호를 입력하세요");
		String a = input.next();
		
		int num3 = 0;
		switch(a) {
		case "+":
			num3 = myCalc.add(num,num2);
			System.out.println(num3);
			break;
		case "-":
			num3 = myCalc.minus(num,num2);
			System.out.println(num3);
			break;
		case "*":
			num3 = myCalc.multiply(num,num2);
			System.out.println(num3);
			break;
		case "/":
			num3 = myCalc.devide(num,num2);
			System.out.println(num3);
			break;
		case "^":
			num3 = myCalc.squarpower(num,num2);
			System.out.println(num3);
			break;
		default:
			System.out.print("기호를 잘못입력하셨습니다");
			}
		
		
		
		

	}

}

