import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		Calc myCalc = new Calc();
		Scanner input = new Scanner(System.in);
		System.out.println("ù��° ������ �Է��ϼ���");
		int num = input.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���");
		int num2 = input.nextInt();
		System.out.println("��ȣ�� �Է��ϼ���");
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
			System.out.print("��ȣ�� �߸��Է��ϼ̽��ϴ�");
			}
		
		
		
		

	}

}

