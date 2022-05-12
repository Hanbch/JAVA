package workspace;

import java.util.Scanner;

/*
10. ���� ������ ������. �� ����� ������ �����Ѵ�. 
�̵��� �̸��� Ű����� �Է¹����� �� ����� Person Ŭ������ �ۼ��϶�. 
�׷��Ƿ� ���α׷����� 2���� Person ��ü�� �����Ǿ�� �Ѵ�. 
�� ����� ������ ���鼭 ������ �����ϴµ� 
�� ����� �ڱ� ���ʿ��� <Enter> Ű�� �Է��ϸ�, 
3���� ������ �߻��ǰ� �� ���ڰ� ��� ������ ���ڰ� �ǰ� ������ ������.
 ������ ������ �ʹ� ũ�� ������ 3���� ���ڰ� ��ġ�ϰ� ���� ���ɼ��� 
���� ������ ������ ������ 1~3������ �Ѵ�.
*/
class Person {
   public final static int RANDOM_COUNT = 3;
   private String name;
   private int[] num = new int[RANDOM_COUNT];

   public Person(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public boolean game() {

      for (int i = 0; i < num.length; i++) {
         num[i] = (int) ((Math.random() * 3) + 1);
         System.out.print("\t" + num[i]);
      }

      if ((num[0] == num[1]) && (num[1] == num[2]))
         return true;
      else
         return false;

   }

}

public class GamblingGame {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.print("1��° ���� �̸�>>");
      String name = sc.next();
      Person player1 = new Person(name);

      System.out.print("2��° ���� �̸�>>");
      name = sc.next();
      Person player2 = new Person(name);

      String buffer = sc.nextLine();

      while (true) {
         System.out.print("[" + player1.getName() + "]:");
         buffer = sc.nextLine();

         if (player1.game()) {
            System.out.println(player1.getName() + "���� �̰���ϴ�.");
            break;
         }
         System.out.println("�ƽ�����!");
         
            //////////////////////////////////////////////////
         System.out.print("[" + player2.getName() + "]:");
         buffer = sc.nextLine();

         if (player2.game()) {
            System.out.println(player2.getName() + "���� �̰���ϴ�.");
            break;
         }
         System.out.println("�ƽ�����!");

      }

   }

}