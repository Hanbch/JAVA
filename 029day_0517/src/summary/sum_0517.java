package summary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//05/17
/*
1. 지네릭 메소드에 대하여 설명하시오.
  - 제네릭 메소드란 메서드를 생성할때 린턴타입과 파라미터의 데이터 타입을 미리 정해두지 않고 
  	호출시 데이터 타입을 정해주는것이다.

2. 콜렉션 프레임워크란?
  - 자바에서 컬렉션 프레임워크(collection framework)란 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합을 의미합니다
	즉, 데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해 놓은 것입니다. 

3. ArrayList 와 LinkedList 의 장단점은?
  - ArrayList는 내부적으로 데이터를 배열에서 관리하며 데이터의 추가, 삭제를 위해 임시 배열을 생성해 데이터를 복사 하는 방법을 사용 하고 있다.
	대량의 자료를 추가/삭제 하는 경우에는 그만큼 데이터의 복사가 많이 일어나게 되어 성능 저하를 일으킬 수 있다. 반면 각 데이터는 인덱스를 가지고 있기 때문에 한번에 참조가 가능해 데이터의 검색에는 유리한 구현체이다.

	- LinkedList
	LinkedList는 데이터를 저장하는 각 노드가 이전 노드와 다음 노드의 상태만 알고 있다고 보면 된다.
	ArrayList와 같이 데이터의 추가, 삭제시 불필요한 데이터의 복사가 없어 데이터의 추가, 삭제시에 유리한 반면 데이터의 검색시에는 처음부터 노드를 순회해야 하기 때문에 성능상 불리하다.

4. 로또 프로그램을 작성하시오.(Set 으로)

5. Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력 받아 저장하고 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.
정수(-1이 입력될 때까지)
-스캐너로 입력된 정수는 List로 관리 할것.
입력:
>> 10 6 22 6 88 77 -1
출력:
가장 큰 수는 88

6.Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아 ArrayList에 저장하고, 
ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여 평균을 출력하는 프로그램을 작성하라.

6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> A C A B F

 */



public class sum_0517 {
	public static void main(String[] args) {

		//6번
		Scanner sc = new Scanner(System.in);
		List<Integer> numBox = new ArrayList<>();
		int maxNum = 0;
		
		while(true) {
			System.out.println("양의 정수입력");
			int num = sc.nextInt();
		
			if(num == -1)
				break;
			else 
				numBox.add(num);
		}
		
		for(int i=0; i<numBox.size(); i++) {
			for(int j=0; j<i; j++) {
				if( (numBox.get(i)) > (numBox.get(j))) {
					maxNum = i;
				}else {
					maxNum = j;
				}
			}
		}
		System.out.println(numBox.get(maxNum));
		
	}
}
