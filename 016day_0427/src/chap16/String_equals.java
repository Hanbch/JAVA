package chap16;

public class String_equals {
	public static void main(String[] args) {
		String str1 = "Lexicographically";
		String str2 =  "lexicographically";
		int cmp;
		
		if( str1.equals(str2) ) {
			System.out.println("�ι��ڿ��� �����ϴ�.");
		}else {
			System.out.println("�ι��ڿ��� �ٸ��ϴ�.");
		}
		
		cmp = str1.compareTo(str2);
		System.out.println(str1.compareTo(str2));
		
		if( cmp == 0 ) {
			System.out.println("�ι��ڿ��� ��ġ�մϴ�.");
		}else if (cmp < 0 ) {
			System.out.println("������ �տ� ��ġ�ϴ� ����:" + str1);
		}else {
			System.out.println("������ �տ� ��ġ�ϴ� ����:" + str2);
		}
		
		if( str1.compareToIgnoreCase(str2) == 0 ) {
			System.out.println("�ι��ڿ��� �����ϴ�.");
		}else {
			System.out.println("�ι��ڿ��� �ٸ��ϴ�.");
		}
		
		
	}
	
}