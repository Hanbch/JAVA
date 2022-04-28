package chap17;

public class Array3 {

	public static void main(String[] args) {
		//배열 기반 반복문 활용의 예

		String[] str = new String[7];
		
		str[0] = new String("hanbe");
		str[1] = new String("asds");
		str[2] = new String("asdsfd");
		str[3] = new String("asdsfd");
		str[4] = new String("asasdfd");
		str[5] = new String("asdd");
		str[6] = new String("asddd");

		int count = 0;
		
		for(int i=0; i<str.length; i++) {
			count += str[i].length();
		}
		System.out.println(count);
		
	}

}
