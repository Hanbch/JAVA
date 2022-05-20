package HS_Training;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/* 88.
""2. Map 을 응용하여 아래의 프로그래밍을 하시오.

나라 이름과 인구를 입력하세요.(예: Korea 5000)
나라 이름, 인구>>a 10000
나라 이름, 인구>>b 938373
나라 이름, 인구>>c 90
나라 이름, 인구>>d 100
나라 이름, 인구>>e 79023484
제일 인구가 많은 나라는 (e, 79023484)"
*/

public class HS_088 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<>();

		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");

		for (int i = 0; i < 3; i++) {
			System.out.print("나라 이름, 인구>>");
			String name = sc.next();
			int pop = sc.nextInt();
			nations.put(name, pop);
		}

		Set<String> ks = nations.keySet();

		String country = "";
		int max = 0;
		for (String k : ks) {
			if (max < nations.get(k)) {
				max = nations.get(k);
				country = k;
			}

		}

		System.out.println("제일 인구가 많은 나라는(" + country + ", " + max + ")");

	}

}
