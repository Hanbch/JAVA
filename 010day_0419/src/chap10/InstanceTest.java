package chap10;

class Human{
	int eye;
	
	
	public void setEye(int count) {
		eye = count; 
	}
	
}


public class InstanceTest {
	
	public static void main(String[] args) {
		
		Human  human = new Human(); // 객체 생성
		human.setEye(2);
		
		System.out.println(human.eye);
		System.out.println(human);
		
		
	}
	
}
