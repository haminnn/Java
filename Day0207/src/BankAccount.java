
public class BankAccount {
	int accountNumber; //계좌번호
	String name;//예금주
	int balance;//잔액
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accountNumber, String name, int balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	void deposit(int money) {//입금
		balance = balance + money;
	}
	void withdraw(int money) {//출금
		if(balance >= money) {
			balance = balance - money;
		}
		else {
			System.out.println("잔액부족");
		}
		
	}
	void print() {//출력
		System.out.println("현재 잔액은 " + balance + "입니다.");
		
	}

}
