package chap21;

class Friend{
	protected String name, phone;
	
	public Friend(String na, String ph){
		this.name = na;
		this.phone = ph;
	}
	
	public void showInfo(){}
	
}

class UnivFriend02 extends Friend { // 대학 동창
	
	private String major; // 전공

	public UnivFriend02(String na, String ma, String ph) {
		super(na, ph);
		major = ma;
		
	}

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전공: " + major);
		System.out.println("전화: " + phone);
	}
}

class CompFriend02 extends Friend{ // 직장 동료
	
	private String department; // 부서

	public CompFriend02(String na, String de, String ph) {
		super(na, ph);
		department = de;
		
	}

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("부서: " + department);
		System.out.println("전화: " + phone);
	}
}

public class MyFriend02 {

	public static void main(String[] args) {
		
		Friend[] frnd = new Friend[10]; 

		
		int ucnt = 0; //데이터가 몇개일지 모를때 for문 돌리기 위한 변수 선언

	
		int ccnt = 0;

		frnd[ucnt++] = new UnivFriend02("LEE", "Computer", "010-333-555");
		frnd[ucnt++] = new UnivFriend02("SEO", "Electronics", "010-222-444");

		frnd[ccnt++] = new CompFriend02("YOON", "R&D 1", "02-123-999");
		frnd[ccnt++] = new CompFriend02("PARK", "R&D 2", "02-321-777");

		for (int i = 0; i < ucnt; i++) {
			frnd[i].showInfo();
			System.out.println();
		}

		for (int i = 0; i < ccnt; i++) {
			frnd[i].showInfo();
			System.out.println();
		}

	}

}
