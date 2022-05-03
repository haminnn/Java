import java.sql.SQLException;

public class DriverLoadTest {
	public static void makeConnection() {
		
	}

	public static void main(String[] args) throws SQLException{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");
		}catch(ClassNotFoundException e){
			System.out.println("드라이버를 찾을 수 없습니다.");
			return;
		}
		makeConnection();

	}
	

}
