import java.util.Random;

public class Array {
	private String title;
	private int row;
	private int col;
	private int[][] array;
	
	public Array(String title, int row, int col) {
		super();
		this.title = title;
		this.row = row;
		this.col = col;
		array = new int[row][col];
		 
	}
	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public int[][] getArray() {
		return array;
	}
	
	public void setRow(int row) {
		 this.row = row;
	}

	public void setCol(int col) {
		 this.col = col;
	}

	public void setArray(int[][] array) {
		 this.array = array;
	}
	
	public void makeArrayData() {
		for(int r = 0; r < row ; r++) {
			for(int c = 0; c < col; c++) {
				array[r][c] = getRandomNumber();
			}
		}		
	}
	
	private int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(12) + 1;
	}
	
	public void printArray() {
		System.out.println("##"+title+"���");
		for(int r = 0; r < row ; r++) {
			for(int c = 0; c < col; c++) {
				System.out.print(array[r][c] + " ");
			}
			System.out.println();
		}
	}
	
	public void findMatchNumber(Array src, Array desc) {
		int count = 0;
		System.out.print("##��ġ�ϴ� ���� : ");
		for(int r = 0; r < row ; r++) {
			for(int c = 0; c < col; c++) {
				if (src.getArray()[r][c] == desc.getArray()[r][c]) {
					System.out.printf("[%d][%d]=%d, ", r, c, src.getArray()[r][c]);
					count+=1;
				}
			}
		}
		System.out.println("\n##��ġ�ϴ� ���� ���� : "+count);
	}
		
	

	

}
