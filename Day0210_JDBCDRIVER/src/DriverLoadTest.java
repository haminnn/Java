import java.sql.SQLException;

public class DriverLoadTest {
	public static void makeConnection() {
		
	}

	public static void main(String[] args) throws SQLException{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ���� ����");
		}catch(ClassNotFoundException e){
			System.out.println("����̹��� ã�� �� �����ϴ�.");
			return;
		}
		makeConnection();

	}
	

}
