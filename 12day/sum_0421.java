
class Gugudan{
	
	void printGugu(int num) {
		
		for(int i=1; i<= num; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
			System.out.print('\n');
		}
		
	}
	
	
}

public class sum_0421 {

	public static void main(String[] args) {
		/*
		  
		1. �������̶�
		  - �������̶� �޸� �ּҸ� �����ϴ� ������ Ÿ���̴�.  
		  
		2. BankAccount yoon ����  ���� yoon �� 4����Ʈ�� ������?
		  - yoon�� ������ �����̴�. ������ ������ 4����Ʈ�ε� �� ������ 
		    JVM�� 32bitü�� �̹Ƿ� 
		
		3.�Ʒ��� �޸𸮸� �׸��ÿ�.

		class BankAccount {
		    int balance = 0;     // ���� �ܾ�

		    public int deposit(int amount) {
		        balance += amount;
		        return balance;
		    }    

		    public int withdraw(int amount) {
		        balance -= amount;
		        return balance;
		    }

		    public int checkMyBalance() {
		        System.out.println("�ܾ� : " + balance);
		        return balance;
		    }
		}
			

		class DupRef {
		    public static void main(String[] args) {
		        BankAccount ref1 = new BankAccount();
		        BankAccount ref2 = ref1;

		        ref1.deposit(3000);
		        ref2.deposit(2000);

		        ref1.withdraw(400);
		        ref2.withdraw(300);

		        ref1.checkMyBalance();
		        ref2.checkMyBalance();  
		    }
		}
		

		4. �Ʒ� �޸𸮸� �׸��ÿ�.

		class PassingRef {
		    public static void main(String[] args) {
		        BankAccount ref = new BankAccount();

		        ref.deposit(3000);
		        ref.withdraw(300);

		        check(ref);
		    }

		    public static void check(BankAccount acc ) {
		        acc.checkMyBalance();
		    }
		}
		
		3,4�� ���� chap09/instance.ai���� ����

		5. �Ʒ��� ���α׷��� �Ͻÿ�.
		 
		Gugudan gugudan = new Gugudan();
		gugudan.printGugu(10); //1�ܺ��� 10�ܱ��� ���
		gugudan.printGugu(20); //1�ܺ��� 20�ܱ��� ���
		
		*/
		Gugudan gugudan = new Gugudan();
		gugudan.printGugu(10); //1�ܺ��� 10�ܱ��� ���
		
		
	}
}
