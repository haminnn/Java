
public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "book");
		System.out.println(sb.toString());
		
		sb.delete(0, 6);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("�ѹ��ڼ�: "+ length);
		
		String result = sb.toString();
		System.out.println(result);

	}

}
