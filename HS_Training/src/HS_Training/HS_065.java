package HS_Training;

// 65.
/*
 "5. �Ʒ��� ��� ����� �Ʒ��� ���� �������� ���α׷��� �Ͻÿ�.
Object obj = new Circle(10);

System.out.println(obj); 

//���: ���̴� 100 �Դϴ�. (����)"
*/

class Circle05{
	int num;
	
	Circle05(int num){this.num = num;}
	
	public String toString() {
		return "���̴�" + (num*num*3.14) + "�Դϴ�.";
	}
	
}

public class HS_065 {
	
	public static void main(String[] args) {
		
		Object obj = new Circle05(10);
		System.out.println(obj);
	}

}
