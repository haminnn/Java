import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDataBase1 {
	
	public static Connection makeConnection() {
		String url = "jdbc:oracle:thin:@DESKTOP-0VGGII9:1521:XE";
		String id = "scott";
		String password = "tiger";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, password);
			System.out.println("�����ͺ��̽� ���� ����");
		}catch(SQLException e) {
			System.out.println("���ῡ �����Ͽ����ϴ�.");
		}
		return con;
	}
	
	public static void main(String[] args) throws SQLException{
			Connection con = makeConnection();
	}

}
