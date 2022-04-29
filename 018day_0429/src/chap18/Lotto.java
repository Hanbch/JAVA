package chap18;

class Lot{
	int[] num = new int[6];
	
	Lot (int[] num) {this.num = num;}
	
	public void getNum() {
		
		for(int i=0; i<num.length; i++) {
			num[i]= (int)(Math.random()*45+1);
			//중복되는 숫자 거르기
			for(int j=0; j<i; j++) {
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	int[] line() {
		getNum();
		
		for(int i=0; i<num.length-1; i++) {
			int min;
			for(int j=i+1; j<num.length; j++) {
				if(num[i] > num[j]) {
					min=num[j];
					num[j]=num[i];
					num[i]=min;
				}
				
			}
		
		}
		
		return num;
	}
	
	
}

public class Lotto {

	public static void main(String[] args) {
		int[] num = new int[6];
		
		Lot lotto = new Lot(num); 
		
		for(int e:lotto.line()) {
			System.out.println(e);
		}
		
	}

}
