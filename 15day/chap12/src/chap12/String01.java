package chap12;

public class String01 {

	public static void main(String[] args) {
		
		String str1 = "Simple String";
		String str2 = "Simple String";
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		if ( str3.equals(str1)) { //String �������� �ּҰ��� ���ϴ°��̾ƴ� ���ڿ��� ���� ���ϴ� �޼��� 
			System.out.println("�����ϴ�.");
		}else {
			System.out.println("�ٸ��ϴ�.");
		}
		
		if(str1 == str2) {
			System.out.println("���� �ν��Ͻ� ����");
		}else {
			System.out.println("�ٸ� �ν��Ͻ� ����");
		}
		
		if(str3 == str4) {
			System.out.println("���� �ν��Ͻ� ����");
		}else {
			System.out.println("�ٸ� �ν��Ͻ� ����");
		}
		
	}

}
