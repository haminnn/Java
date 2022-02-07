import java.io.IOException;

public class ExceptionTest {
	public void method1() throws IOException{
		System.out.println("method1() called");
		method2();
	}
	public void method2() throws IOException{
		System.out.println("method2() called");
		method3();
	}
	public void method3() throws IOException{
		System.out.println("method3() called");
		if(true) throw new IOException("예외발생");
	}
	

	public static void main(String[] args) throws IOException{
		ExceptionTest test = new ExceptionTest();
		test.method1();

	}

}
