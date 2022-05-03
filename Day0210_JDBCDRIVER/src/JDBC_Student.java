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
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("데이터베이스 연결 성공");
		}catch(ClassNotFoundException e){
			System.out.println("드라이버를 찾을 수 없습니다.");}
		catch(SQLException e) {
			System.out.println("연결에 실패하였습니다.");
		}
		return con;
	}
	
	public static void main(String[] args) throws SQLException{
			Connection con = makeConnection();
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
//			stmt.executeUpdate("insert into student (sid, sname, did) values('900', '윤길동', 'IT_02')");
//			stmt.executeUpdate("update student set sname='lee' where sid='100200'");
//			stmt.executeUpdate("delete from student where sname='이길동'");



			while(rs.next()){
				System.out.println(rs.getString("sname"));
				System.out.println(rs.getString("sid"));
				System.out.println(rs.getString("did"));
			}
			rs.close();
	}

}
