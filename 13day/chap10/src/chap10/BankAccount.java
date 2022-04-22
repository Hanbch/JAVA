package chap10;

class BankAccount00{
	String accNum;
	String ssNum;
	int balance;
	
	public BankAccount00(){}
	public BankAccount00(String accNum, String ssNum, int balance){
		this.accNum = accNum;
		this.ssNum = ssNum;
		this.balance = balance;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int widthdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.print("���¹�ȣ: " + accNum);
		System.out.print("�ֹι�ȣ: " + ssNum);
		System.out.print("�ܾ�: " + balance);
		System.out.println('\n');
		return balance;
	}
	
}

public class BankAccount {

	public static void main(String[] args) {
		BankAccount00 yoon = new BankAccount00("110-413-512-003","950327",10000);
		BankAccount00 park = yoon;
		
		yoon.checkMyBalance();
		
		yoon.deposit(50000);
		park.deposit(30000);

		yoon.widthdraw(20000);
		park.widthdraw(20000);
		
		yoon.checkMyBalance();
		park.checkMyBalance();
		
		check(yoon);
	}
	
	public static void check(BankAccount00 acc) {
		acc.checkMyBalance();
	}

}
