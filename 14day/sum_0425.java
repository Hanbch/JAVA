
public class sum_0425 {

	public static void main(String[] args) {
		/*
		1.접근제한자 4가지 종류에 대하여 설명하시오.
		  - public : 모든 곳에서 접근가능
		  - proteced : -
		  - default : 같은 패키지안에서만 접근가능
		  - private :같은 클래스 내에서만 접근가능
		
		2.class 에서 붙일수 있는 접근 제한자 2개를 설명하고, 해당 접근제한자의 사용 목적은?
		  - public 
		  - default
		
		3.지역변수에 접근제한자를 붙이지 않는 이유는?
		  - 지역변수는 해당 함수 안에서만 사용 가능하다.
		  
		4.static 변수의 다른 용어 3가지를 말해 보시오.
		  - 공유변수, 클래스변수, 정적변수
		
		5.static 변수의 접근 방법은?
		  - 클래스명.변수명 으로 접근가능하다.
		
		6.클래스 변수의 활용의 예를 드시오.
		  - math.PI 와같이 PI라는 상수를 공유해서 사용하게 될때 static변수를 만들어 사용한다.
		
		7.스태틱 함수에 인스턴스 변수가 올수 없는 이유는?
		  - 인스터스변수는 객체가 생성될때 매로리에 할당이 되는데 스태틱함수는 함수가 생성되때 만들어지므로 
		    스태틱함수내에서는 메모리에 할당이 되어있지않은 인스턴스변수를 참조할 수 없기 때문이다.
		
		8.인스턴스 함수안에 스태틱 변수와 함수가 올수 있는 이유는?
		  - 인스턴스 함수가 객체가 생성되면서 만들어질때 class 안에서 static을 먼저 찾아
		    메로리에 올리고 공유하기때문에 인스턴스 함수안에서 스태틱 변수와 함수를 사용할수 있다.
		
		9.아래의 프로그램을 작성 하시오.
		 
		노래 한 곡을 나타내는 Song 클래스를 작성하라. Song은 다음 필드로 구성된다.

		- 노래의 제목을 나타내는 title
		- 가수를 나타내는 artist
		- 노래가 발표된 연도를 나타내는 year
		- 국적을 나타내는 country

		또한 Song 클래스에 다음 생성자와 메소드를 작성하라.
		- 생성자 2개: 기본 생성자와 매개변수로 모든 필드를 초기화하는 생성자
		- 노래 정보를 출력하는 show() 메소드
		- main() 메소드에서는 1978년, 스웨덴 국적의 ABBA가 부른 "Dancing Queen"을
		song 객체로 생성하고 show()를 이용하여 노래의 정보를 다음과 같이 출력하라.
		1978년 스웨덴국적의 ABBA가 부른 Dancing Queen
		 */
		Song song = new Song("Dancing Qeen", "ABBA", 1978, "Sweden");
		song.show();
	}

			
}
class Song{
	String title;
	String artist;
	int year;
	String country;
	
	public Song(){}
	public Song(String title, String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가부른 " + title);
	}
}
