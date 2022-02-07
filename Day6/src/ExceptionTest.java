
public class ExceptionTest {
	public void checkTall(double tall) throws RangeBoundsException{
		if(tall > 180) {
			System.out.println("유효범위보다 큽니다.");
		}else if(tall < 130) {
			System.out.println("유효범위보다 작습니다.");
		}
		
	 }
	public double averageTall(double[] talls) {
		double avg = 0;
		for(int i = 0; i < middle_talls.length; i ++) {
			avg += middle_talls[i];
			if (middle_talls[i] == middle_talls.length) {
				avg = avg / middle_talls.length;
			}
		}
	 }

	public static void main(String[] args) {
		double[] middle_talls = new double[] {152, 155.5, 148.5, 115, 160, 162, 191, 165, 168, 159, 157, 170, 171};
		ExceptionTest test = new ExceptionTest();
		for(int i = 0; i < middle_talls.length; i ++) {
			try {
				test.checkTall(middle_talls[i]);	
			}catch(RangeBoundsException e) {
			
		}catch(Exception e){
			
		}
		}

	}

}
