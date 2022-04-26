package chap12;

public class String01 {

	public static void main(String[] args) {
		
		String str1 = "Simple String";
		String str2 = "Simple String";
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		if ( str3.equals(str1)) { //String 참조형의 주소값을 비교하는것이아닌 문자열이 같은 비교하는 메서드 
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		if(str1 == str2) {
			System.out.println("동일 인스턴스 참조");
		}else {
			System.out.println("다른 인스턴스 참조");
		}
		
		if(str3 == str4) {
			System.out.println("동일 인스턴스 참조");
		}else {
			System.out.println("다른 인스턴스 참조");
		}
		
	}

}
