import java.util.LinkedList;
import java.util.List;

public class LinkedFListTest {

	public static void main(String[] args) {
		List<String> list =  new LinkedList<String>();
		list.add("홍길동");
		list.add("김길동");
		list.add("최길동");
		list.set(0, "남길동"); //0번째 인덱스의 홍길동을 남길동으로 수정
		String s = list.get(0); // 0번째 인덱스의 남길동을 s에 대입
		int size = list.size(); //list의 크기를 int size에 대입
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
