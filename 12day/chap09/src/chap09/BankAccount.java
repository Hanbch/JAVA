package chap09;

class BankAccount00{
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int widthdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("ภÜพื: " + balance);
		return balance;
	}
	
}

public class BankAccount {

	public static void main(String[] args) {
		BankAccount00 yoon = new BankAccount00();
		BankAccount00 park = yoon;
		
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
