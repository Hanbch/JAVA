package HS_Training;

// 65.
/*
 "5. �Ʒ��� ��� ����� �Ʒ��� ���� �������� ���α׷��� �Ͻÿ�.
Object obj = new Circle(10);

System.out.println(obj); 

//���: ���̴� 100 �Դϴ�. (����)"
*/

class Cir{
	int rad;
	
	Cir(int rad){this.rad = rad;}
	
	public String toString() {
		return "���̴�" + (rad*rad*3.14) + "�Դϴ�.";
	}
}

public class HS_065_2 {
	
	public static void main(String[] args) {
		
		Cir cir = new Cir(5);
		System.out.println(cir);
	}

}
