package pkg1;

public class Parent {
	public String name = "parent"; //public�� ������ ���� ũ�� ��𼭵� ������ ����
//	protected String name = "parent"; // protected �ܺ���Ű������ �������Ҷ��� ��Ӱ����ϰ�츸 ����������
//	String name = "parent"; //default�� ���� ��Ű�� �ȿ� �ִ� Ŭ���������� ������ �����ϴ�, �ܺ� ��Ű�������� ������ �Ұ�
//	private String name = "parent"; // private�� Ŭ���� ���ο����� ������ �����ϴ�, ���� ��Ű������ Ŭ������ �ٸ��� X,��� X
	
	public String getName() {
		
		//���� üũ, ��ȿ��üũ��
		return name;
	}
	public void setName(String name) {
		
		//���� üũ, ��ȿ��üũ��
		this.name = name;
	}
}

