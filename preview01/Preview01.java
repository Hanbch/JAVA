package practice01;
import java.util.Scanner; 

class FarmMachine {
	//속성 attribute
	int price;
	int year;
	String color;
	
	//동작
	void move(int amount) {
		System.out.println("Machine is moving" + amount);	
	}
	
	void dig(int amount) {
		System.out.println("Machine id digging" + amount);
	}
	
}
class InterAge {
	void calInterAge(int born_date,int today_date){
		System.out.println(today_date - born_date);
	}
}

public class Preview01 {
	
	
	public static void main(String[] args) {
	FarmMachine fm = new FarmMachine();
	
	fm.price = 100;
	fm.year = 2022;
	fm.color = "red";
		  
	fm.move(50);
	fm.dig(100);
	
	System.out.println(fm.price);
	System.out.println(fm.year);
	System.out.println(fm.color);

	
	//나이 계산

	int born_date;
	int today_date;
	
	Scanner sc = new Scanner(System.in);
	InterAge ia = new InterAge();
	
	System.out.println("태어난 연도4자리를 입력하시오. ex)1995");
	born_date = sc.nextInt();
	
	System.out.println("현재 년도4자리를 입력하시오");
	today_date = sc.nextInt();
	
	ia.calInterAge(born_date,today_date);
	
	
	}
}
