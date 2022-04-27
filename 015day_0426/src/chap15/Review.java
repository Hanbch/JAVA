package chap15;

import com.wxx.circle.Circle;

class TV{
	String brand;
	int year;
	int inch;
	
	TV(String brand, int year, int inch){
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(brand + "���� ���� " + year + "�� " + inch + "��ġ");
	}
	
}

class Song{
	private String title;
	private String artist;
	private int year;
	private String country;
	
	Song(){}
	
	Song(String title, String artist, int year, String country){
		this.title =title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.println(year+"��, "+country+" ������ "+artist+"�� �θ� "+ title);
	}
	
}

public class Review {

	public static void main(String[] args) {
		/*"�ڹ� Ŭ������ �ۼ��ϴ� ������ �غ���. 
		���� main() �޼ҵ带 �����Ͽ��� �� ���ÿ� ���� ��µǵ��� TV Ŭ������ �ۼ��϶�.

		public static void main(String[] args) {
		   TV myTV = new TV(""LG"", 2017, 32); //LG���� ���� 2017�� 32��ġ
		   myTV.show();
		}
		���======================
		LG���� ���� 2017���� 32��ġ TV"
		*/
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		
		/*"�뷡 �� ���� ��Ÿ���� Song Ŭ������ �ۼ��϶�. Song�� ���� �ʵ�� �����ȴ�.

		- �뷡�� ������ ��Ÿ���� title
		- ������ ��Ÿ���� artist
		- �뷡�� ��ǥ�� ������ ��Ÿ���� year
		- ������ ��Ÿ���� country

		���� Song Ŭ������ ���� �����ڿ� �޼ҵ带 �ۼ��϶�.
		- ������ 2��: �⺻ �����ڿ� �Ű������� ��� �ʵ带 �ʱ�ȭ�ϴ� ������
		- �뷡 ������ ����ϴ� show() �޼ҵ�
		- main() �޼ҵ忡���� 1978��, ������ ������ ABBA�� �θ� ""Dancing Queen""��
		song ��ü�� �����ϰ� show()�� �̿��Ͽ� �뷡�� ������ ������ ���� ����϶�.
		1978�� ������������ ABBA�� �θ� Dancing Queen"*/
		Song song = new Song("Dancing Qeen", "ABBA", 1978, "Sweden");
		song.show();
		
		
		
		//A�� ��ü����
        Circle circle = new Circle();

        //B��
        chap15.Circle circle2 = new chap15.Circle();
	}

}