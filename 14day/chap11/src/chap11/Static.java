package chap11;

class InstCnt{
	
   static int instNum = 0;
	
	public InstCnt() {
		instNum++;
		System.out.println("�ν��Ͻ� ����: " + instNum);
	}
	
}

public class Static {

	public static void main(String[] args) {
	InstCnt cnt1 = new InstCnt();
	InstCnt cnt2 = new InstCnt();
	InstCnt cnt3 = new InstCnt();
	
	System.out.println(InstCnt.instNum);//�ܺο��� Ŭ������ �̸��� ���� ����
	
		
	}

			
}
