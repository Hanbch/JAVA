// 48.배열을 이용하여, 로또 번호6개를 출력 -중복없이

package HS_Training;

class Lotto{
	int[] LottoNum = new int[6];
	
	Lotto(){}
	
	public int[] getNum(){
		for(int i=0; i<LottoNum.length; i++) {
			LottoNum[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(LottoNum[i] == LottoNum[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<LottoNum.length-1; i++) {
			int min;
			for(int j=i+1; j<LottoNum.length; j++) {
				if(LottoNum[i] > LottoNum[j]) {
					min = LottoNum[j];
					LottoNum[j] = LottoNum[i];
					LottoNum[i] = min;
							
				}
			}
		}
		return LottoNum;
	}

}

public class HS_048 {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		
		for(int e:lotto.getNum()) {
				System.out.print(e+ " ");
				System.out.print(" ");
				
		}
		
	}
}