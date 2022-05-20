package HS_Training;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/* 88.
""2. Map �� �����Ͽ� �Ʒ��� ���α׷����� �Ͻÿ�.

���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)
���� �̸�, �α�>>a 10000
���� �̸�, �α�>>b 938373
���� �̸�, �α�>>c 90
���� �̸�, �α�>>d 100
���� �̸�, �α�>>e 79023484
���� �α��� ���� ����� (e, 79023484)"
*/

public class HS_088 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<>();

		System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)");

		for (int i = 0; i < 3; i++) {
			System.out.print("���� �̸�, �α�>>");
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

		System.out.println("���� �α��� ���� �����(" + country + ", " + max + ")");

	}

}
