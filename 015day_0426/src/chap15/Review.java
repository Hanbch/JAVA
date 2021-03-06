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
		System.out.println(brand + "에서 만든 " + year + "년 " + inch + "인치");
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
		System.out.println(year+"년, "+country+" 국적의 "+artist+"가 부른 "+ title);
	}
	
}

public class Review {

	public static void main(String[] args) {
		/*"자바 클래스를 작성하는 연습을 해보자. 
		다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV 클래스를 작성하라.

		public static void main(String[] args) {
		   TV myTV = new TV(""LG"", 2017, 32); //LG에서 만든 2017년 32인치
		   myTV.show();
		}
		출력======================
		LG에서 만든 2017년형 32인치 TV"
		*/
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		
		/*"노래 한 곡을 나타내는 Song 클래스를 작성하라. Song은 다음 필드로 구성된다.

		- 노래의 제목을 나타내는 title
		- 가수를 나타내는 artist
		- 노래가 발표된 연도를 나타내는 year
		- 국적을 나타내는 country

		또한 Song 클래스에 다음 생성자와 메소드를 작성하라.
		- 생성자 2개: 기본 생성자와 매개변수로 모든 필드를 초기화하는 생성자
		- 노래 정보를 출력하는 show() 메소드
		- main() 메소드에서는 1978년, 스웨덴 국적의 ABBA가 부른 ""Dancing Queen""을
		song 객체로 생성하고 show()를 이용하여 노래의 정보를 다음과 같이 출력하라.
		1978년 스웨덴국적의 ABBA가 부른 Dancing Queen"*/
		Song song = new Song("Dancing Qeen", "ABBA", 1978, "Sweden");
		song.show();
		
		
		
		//A사 객체생성
        Circle circle = new Circle();

        //B사
        chap15.Circle circle2 = new chap15.Circle();
	}

}
