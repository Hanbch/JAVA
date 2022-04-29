package chap18;
class Box{
	String contents;
	int boxNum;
	
	Box(int num, String cont){
		boxNum = num;
		contents = cont;
	}
	
	public int getBoxNum() {
		return boxNum;
	}
	
	public String toString() {
		return contents;
	}
	
}


public class enhancedFor {
	
	static int getSumNum(Box[] ar) {
		int sum =0 ;
		for(int i=0; i<ar.length; i++) {
			sum += ar[i].getBoxNum();
		}
		return sum;
	}
	
	static int getSumCont(Box[] ar) {
		int sum = 0 ;
		for(Box e: ar) {
			sum += e.toString().length();
			//sum += e.contents.length();
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Box[] ar = new Box[5];
		
		ar[0] = new Box(101,"coffee");
		ar[1] = new Box(202,"coffee");
		ar[2] = new Box(303,"coffee");
		ar[3] = new Box(404,"coffee");
		ar[4] = new Box(505,"coffee");
		
		int[] arr = {1,2,3,4,5,6};
		int sum=0;
		
		for(Box e: ar) {
			//sum += e.toString().length();
			sum += e.getBoxNum();
			System.out.println(e);
			System.out.println(sum);
			
		}
		//System.out.println(ar[0]);
		
		//System.out.println(getSumNum(ar));
		//System.out.println(getSumCont(ar));
		
//		for(Box e :ar) {
//			System.out.println(e);
//		}
	}


}
