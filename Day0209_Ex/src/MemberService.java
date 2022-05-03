
public class MemberService {
	String id;
	String password;
	boolean flag = false;
	
	public MemberService(){
		this("","");
	}
	public MemberService(String id){
		this(id,"");
	}
	public MemberService(String id, String password){
		this.id = id;
		this.password = password;
	}
	public boolean login(String id, String password) {
		if(id =="hong" && password == "12345") {
			return !flag;
		}else {
			return flag;
		}
		
	}
	
	public void logout(String id) {
		if(id =="hong") {
			System.out.println("로그아웃되었습니다.");
			flag = true;
		}else {
			System.out.println("로그아웃할 아이디를 재입력하세요");
			flag = false;
		}
	}

}
