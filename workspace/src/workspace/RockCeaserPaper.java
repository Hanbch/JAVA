package workspace;

import java.lang.Math;
import java.util.Scanner;

public class RockCeaserPaper {
	public static void main(String[] args) {
		
	for(;;) {
		System.out.println("가위 바위 보 선택");
		Scanner sc  = new Scanner(System.in);
			
			String[] Random = {"가위","바위","보"};
			String me = sc.next();
			String com =Random[(int)(Math.random()*3)];
			
			
				if(me.equals("가위")){
						
						switch(com) {
							case ("가위"): 
								System.out.println("com은 "+ com);
								System.out.println("나는"+ me);
								System.out.println("비겼습니다.");
							break;
							
							case ("바위"): 
								System.out.println("com은 "+ com);
								System.out.println("나는"+ me);
								System.out.println("졌습니다.");
							break;
							
							case ("보"): 
								System.out.println("com은 "+ com);
								System.out.println("나는"+ me);
								System.out.println("이겼습니다.");
							break;
						}
				}
				
				else if(me.equals("바위")) {
					switch(com) {
						case ("가위"): 
							System.out.println("com은 "+ com);
							System.out.println("나는"+ me);
							System.out.println("이겼습니다.");
						break;
						
						case ("바위"): 
							System.out.println("com은 "+ com);
							System.out.println("나는"+ me);
							System.out.println("비겼습니다.");
						break;
						
						case ("보"): 
							System.out.println("com은 "+ com);
							System.out.println("나는"+ me);
							System.out.println("졌겼습니다.");
						break;
					}
				}
				
				else if(me.equals("보")) {
					switch(com) {
						case ("가위"): 
							System.out.println("com은 "+ com);
							System.out.println("나는"+ me);
							System.out.println("졌습니다.");
						break;
						
						case ("바위"): 
							System.out.println("com은 "+ com);
						System.out.println("나는"+ me);
							System.out.println("이겼습니다.");
						break;
						
						case ("보"): 
							System.out.println("com은 "+ com);
						System.out.println("나는"+ me);
							System.out.println("비겼습니다.");
						break;
					}
		
				}
				
				else {
					System.out.println("잘못 입력하셨습니다. 가위, 바위, 보  중 하나를 입력하세요");			
				}
		}
		
	
	}

}
