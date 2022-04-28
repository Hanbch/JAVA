package chap17;
// 인스턴스 대상 1차원 배열의 
class Box{
	private String conts;
	
	Box(String conts){ this.conts = conts;}
	
	public String toString() {//class 안에 toString이 있으면 자동호출된다.
		return conts;
	}
	
	
}

public class Array2 {

	public static void main(String[] args) {
		
		Box[] arr = new Box[5];
		
		arr[0] = new Box("hanbe");
		arr[1] = new Box("soohyun");
		arr[2] = new Box("kim");
		arr[3] = new Box("choi");
		
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		System.out.println("arr[3] : " + arr[3]);
		System.out.println("arr[4] : " + arr[4]);
		
	}

}
