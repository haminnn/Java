import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		for(int i= 0; i < scores.length; i ++) {
			System.out.println("scores["+i+"]="+scores[i]);
		}
		System.out.println();
		
		String[] names = {"È«±æµ¿", "¹Úµ¿¼ö", "±è¹Î¼ö"};
		Arrays.sort(names);
		for(int i= 0; i < names.length; i++) {
			System.out.println("names["+i+"]="+names[i]);
		}
		System.out.println();
		
		Member m1 = new Member("È«±æµ¿");
		Member m2 = new Member("¹Úµ¿¼ö");
		Member m3 = new Member("±è¹Î¼ö");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		for(int i= 0; i< members.length; i ++) {
			System.out.println("members["+i+"].name="+members[i].name);
		}
		System.out.println();
		
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("Ã£Àº ÀÎµ¦½º: "+ index);
		
		index = Arrays.binarySearch(names, "±è¹Î¼ö");
		System.out.println("Ã£Àº ÀÎµ¦½º: " + index);
		
		index = Arrays.binarySearch(members, m2);
		System.out.println("Ã£Àº ÀÎµ¦½º: "+ index);
		
		
		
	}

}
