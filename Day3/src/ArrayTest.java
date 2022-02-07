
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Array arr = new Array("첫번째 Array", 3, 4);
		Array arr2 = new Array("두번째 Array", 3, 4);
		arr.makeArrayData();
		arr2.makeArrayData();
		arr.printArray();
		arr2.printArray();
		arr.findMatchNumber(arr, arr2);
		
		

	}

}
