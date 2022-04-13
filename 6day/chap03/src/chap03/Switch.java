package chap03;

import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		
		//switch 문 
	    int n = 3;

	    switch( n ){
	    
        case 1: 
            System.out.println("Simple Java");
            break;
        case 2:
            System.out.println("Funny Java");
            break;
        case 3 :
            System.out.println("Fantastic Java");
            break;
        default :
            System.out.println("The best programming language");
	   }
	    
	    
	    System.out.println("Do you like Java?");
	    
	    Scanner sc = new Scanner(System.in);
		   
	    System.out.println("몇월인지 입력해주세요.");
	    
	    int month = sc.nextInt();
	   
	    switch ( month ) {
	    
	    case 1, 2, 3, 4:
	    	System.out.println(month + "월은 겨울입니다.  ");
            break;
            
	    case 5:
	    	System.out.println(month + "월은 봄입니다.  ");
            break;
            
	    case 6:
	    case 7:
	    case 8:
	    case 9:
	    	System.out.println(month + "월은 여름입니다.");
            break;
            
	    case 10:
	    case 11:
	    case 12:
	    	System.out.println(month + "월은 겨울 입니다. ");
            break;
            
        default :
        	System.out.println("월을 잘못 입력하였습니다.");
	    }
	    
	    
		
	}

}
