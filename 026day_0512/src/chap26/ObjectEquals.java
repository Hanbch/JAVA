package chap26;

class INum{
	private int num;
	public INum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((INum)obj).num)
			return true;
		else
			return false;
	}
}
 
public class ObjectEquals{
	
	public static void main(String[] args) {
		INum num1 = new INum(10); 
		INum num2 = new INum(10); 
		INum num3 = new INum(10);
		
		if(num1.equals(num2))
			System.out.println("������ �����ϴ�.");
		else
			System.out.println("������ �ٸ���.");
		
		if(num1.equals(num3))
			System.out.println("������ �����ϴ�.");
		else
			System.out.println("������ �ٸ���.");
	}
	
}