
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
			System.out.println("�α׾ƿ��Ǿ����ϴ�.");
			flag = true;
		}else {
			System.out.println("�α׾ƿ��� ���̵� ���Է��ϼ���");
			flag = false;
		}
	}

}
