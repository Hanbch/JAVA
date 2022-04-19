package chap02;

public class CompAssign {

	public static void main(String[] args) {
		short num = 10;
		num = (short)(num + 77L);// short인 num과 long인 77L이 연산되면서 자동형변환이되면서 
								 //	long타입으로 합쳐진다. 근데 short는 long을 담을수 없기때문에 
								 // 명시적 형변환을 해준다. 
		int rate = 3;
		rate = (int)(rate * 3.5);
		System.out.println(num);
		System.out.println(rate);
		
		num  = 10;
		num += 77L; // 복합 연산자는 형변환이 필요없다.
		rate = 3;
		rate *= 3.5;
		System.out.println(num);
		System.out.println(rate);
		
	}

}
