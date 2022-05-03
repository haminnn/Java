import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Student {
	
	public static Connection makeConnection() {
		String url = "jdbc:oracle:thin:@DESKTOP-0VGGII9:1521:XE";
		String id = "scott";
		String password = "tiger";
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ���� ����");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("�����ͺ��̽� ���� ����");
		}catch(ClassNotFoundException e){
			System.out.println("����̹��� ã�� �� �����ϴ�.");}
		catch(SQLException e) {
			System.out.println("���ῡ �����Ͽ����ϴ�.");
		}
		return con;
	}
	
	public static void main(String[] args) throws SQLException{
			Connection con = makeConnection();
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
//			stmt.executeUpdate("insert into student (sid, sname, did) values('900', '���浿', 'IT_02')");
//			stmt.executeUpdate("update student set sname='lee' where sid='100200'");
//			stmt.executeUpdate("delete from student where sname='�̱浿'");



			while(rs.next()){
				System.out.println(rs.getString("sname"));
				System.out.println(rs.getString("sid"));
				System.out.println(rs.getString("did"));
			}
			rs.close();
	}

}