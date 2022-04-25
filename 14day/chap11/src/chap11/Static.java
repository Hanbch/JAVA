package chap11;

class InstCnt{
	
   static int instNum = 0;
	
	public InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}
	
}

public class Static {

	public static void main(String[] args) {
	InstCnt cnt1 = new InstCnt();
	InstCnt cnt2 = new InstCnt();
	InstCnt cnt3 = new InstCnt();
	
	System.out.println(InstCnt.instNum);//외부에서 클래스의 이름을 통한 접근
	
		
	}

			
}
