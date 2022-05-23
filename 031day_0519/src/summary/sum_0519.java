package summary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//05/19
/*
1. TreeSet 에 대하여 설명하시오.
  - TreeSet은 값을 순서대로 정렬하여 만들어지는 집합 
  
2. 큐와 스택에 대하여 설명하시오.(필수)
  - 큐(Queue)는 스택(Stack)과 다르게 먼저 들어온 것이 먼저 나가는 "선입선출"로, 
  	FIFO(First In First Out)의 구조를 가지고 있습니다.
  - 스택(Stack)은 "쌓다"라는 의미로, 데이터를 차곡차곡 쌓아 올린 형태의 자료구조입니다. 
  	데이터가 순서대로 쌓이며 가장 마지막에 삽입된 자료가 가장 먼저 삭제되는 구조를 가지고 있습니다.
3. Map 에 대하여 설명하시오.
  - Map 인터페이스를 구현한 Map 컬렉션 클래스들은 키와 값을 하나의 쌍으로 저장하는 방식
  (key-value 방식)을 사용합니다. 여기서 키(key)란 실질적인 값(value)을 찾기 위한 이름의 역할을 합니다.
4. 아래의 TreeMap의 전체 Value를 확인 하기 위한 소스를 짜시오.(필수)
	TreeMap<Integer, String> map = new TreeMap<>();
	map.put(45, "Brown");
	map.put(37, "James");
	map.put(23, "Martin");
출력)
45 Brown
37 James
23 Martin
5. 아래를 프로그래밍 하시오.
하나의 학생 정보를 나타내는 Student 클래스에는 이름, 학과, 학번, 학점 평균을 저장하는 필드가 있다.
학생마다 Student 객체를 생성하고 4명의 학생 정보를 ArrayList<Student> 컬렉션에 저장한 후에, ArrayList<Student>의 모든 학생(4명) 정보를 출력하고 학생 이름을 입력 받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하라.
 
학생 이름, 학과, 학번, 학점평균 입력하세요.
>> 황기태, 모바일, 1, 4.1
>> 이재문, 안드로이드, 2, 3.9
>> 김남윤, 웹공학, 3, 3.5
>> 최찬미, 빅데이터, 4, 4.25
----------------------------------
이름: 황기태
학과: 모바일
학번: 1
학점평균: 4.1
----------------------------------
이름: 이재문
학과: 안드로이드
학번: 2
학점평균: 3.9
----------------------------------
이름: 김남윤
학과: 웹공학
학번: 3
학점평균: 3.5
----------------------------------
이름: 최찬미
학과: 빅데이터
학번: 4
학점평균: 4.25
----------------------------------
학생 이름 >> 최찬미
최찬미, 빅데이터, 4, 4.25
학생 이름 >> 이재문
이재문, 안드로이드, 2, 3.9
학생 이름 >> 그만
*/

class Student{//5번
	String name;
	String course;
	int sNum;
	int avg;
	
	Student(String name, String course,int sNum, int avg){
		this.name = name;
		this.course = course;
		this.sNum = sNum;
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return "-------------------------------------" + "\n" +
				"이름: " + this.name + "\n" +
				"학과: " + this.course + "\n" +
				"학번: " +  this.sNum + "\n" +
				"학점평균: " + this.avg ;
	}
}

public class sum_0519 {
	public static void main(String[] args) {
		//4번
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		Set<Integer> key = map.keySet();
		
		for(int k : key)
			System.out.println(map.get(k));
		
		//5번
		Scanner sc = new Scanner(System.in);
		List<Student> st = new ArrayList<>();
		String name;
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		
		for(int i=0; i<4; i++) {
			name = sc.next();
			String course = sc.next();
			int sNum = sc.nextInt();
			int avg = sc.nextInt();
			
			//System.out.println(name + ", " + course + ", " + sNum + ", " + avg);
			st.add(new Student(name,course, sNum, avg));
		}
		
		for(Student info:st) {
			System.out.println(info + "\n");
			
		}
		
		while(true) {
			System.out.print("학생 이름 >>");
			name = sc.next();
			
			for(Student search:st) {
				if((search.name).equals(name)) {
					
					System.out.println(search.name + " " + search.course + " " + search.sNum + " " + search.avg);
				}
			}
			System.out.println();
		}
		
	}
}