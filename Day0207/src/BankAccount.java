
public class BankAccount {
	int accountNumber; //���¹�ȣ
	String name;//������
	int balance;//�ܾ�
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accountNumber, String name, int balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	void deposit(int money) {//�Ա�
		balance = balance + money;
	}
	void withdraw(int money) {//���
		if(balance >= money) {
			balance = balance - money;
		}
		else {
			System.out.println("�ܾ׺���");
		}
		
	}
	void print() {//���
		System.out.println("���� �ܾ��� " + balance + "�Դϴ�.");
		
	}

}
