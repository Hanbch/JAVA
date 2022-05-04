
//05/04
/*
1. instanceof  연산자에 대하여 설명하시오.
  - instanceof연산자는 객체가 class를 갖고있는지 확인하는 연산자이다
    ex) a instanceof Car 이것은 a라는 객체가 Car라는 객체를 가지고 있으면 true 반환 아니면 false

2. Object 클래스에 대하여 설명하시오.
  - Object는 최상위의 부모클래스이다 상속을 정의해주지 않으면 extends Object가 디폴트값이다.

3. 아래와 같이 출력되는 이유를 설명하시오.

class A{

}

public class Test {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
	}
}
출력
A@111111111

  - class A는 Object class를 상속한다. Object클래스는 기본적으로 몇가지의 함수가있는데 
    그중 하나가 toString 이다 하지만 A 에는 toString이 오버라이드 되어있지 않으므로 그냥 주소값을 출력한다.

4. 아래의 프로그램이 돌아 가도록 하시오.
public static void main(String[] args) {
   Friend[] frns = new Friend[10];
   int cnt = 0;
   
   frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
   frns[cnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");
   frns[cnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
   frns[cnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");
   
   // 모든 동창 및 동료의 정보 전체 출력
   for(int i = 0; i < cnt; i++) {
      frns[i].showInfo();      // 오버라이딩 한 메소드가 호출된다.
      System.out.println();
   }
}


5.아래를 프로그래밍 하시오.

게임시작 1
게임종료 2
>>
1
숫자를 입력해주세요 : 50
Down ===> 9번 남아 있습니다.
숫자를 입력해주세요 : 25
Down ===> 8번 남아 있습니다.
숫자를 입력해주세요 : 12
Up ====> 7번 남아 있습니다.
숫자를 입력해주세요 : 17
일치

 
 * */
// 4번 5번 문제
package summary;

import java.util.Scanner;

//4번문제 Class
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

//5번문제 Class

class UpDown {
	private int targetNum;
	private int userNum;

	UpDown() {
	}

	public void checkNum() {
		Scanner sc = new Scanner(System.in);

		targetNum = (int) (Math.random() * 100) + 1;

		System.out.print("숫자를 입력해주세요: ");
		userNum = sc.nextInt();

		int count = 1;
		boolean check = true;

		while (check) {
			if (targetNum == userNum) {
				System.out.println("일치");
				check = false;
			} else if (targetNum > userNum) {
				System.out.println("UP" + "=====>" + (10 - count++) + "번 남았습니다.");
				userNum = sc.nextInt();
			} else if (targetNum < userNum) {
				System.out.println("Down" + "=====>" + (10 - count++) + "번 남았습니다.");
				userNum = sc.nextInt();
			}

			if (count == 10) {
				System.out.println("Game Over");
				System.out.println("정답은: " + targetNum);
				return;
			}

		}
	}

}

public class sum_0504 {
	public static void main(String[] args) {
		
		//4번
		Friend[] frns = new Friend[10];
		   int cnt = 0;
		   
		   frns[cnt++] = new UnivFriend02("LEE", "Computer", "010-333-555");
		   frns[cnt++] = new UnivFriend02("SEO", "Electronics", "010-222-444");
		   frns[cnt++] = new CompFriend02("YOON", "R&D 1", "02-123-999");
		   frns[cnt++] = new CompFriend02("PARK", "R&D 2", "02-321-777");
		   
		   // 모든 동창 및 동료의 정보 전체 출력
		   for(int i = 0; i < cnt; i++) {
		      frns[i].showInfo();      // 오버라이딩 한 메소드가 호출된다.
		      System.out.println();
		   }
		//5번
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("게임시작 1");
			System.out.println("게임종료 2");

			UpDown g1 = new UpDown();

			int check = sc.nextInt();

			if (check == 1)
				g1.checkNum();
			else
				System.out.println("게임종료");
			return;
		}
	}
}
