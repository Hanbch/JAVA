package workspace;

class Mypoint{
	int x,y;
	
	Mypoint(int x, int y){
		this.x =x; 
		this.y =y;
	}
	
	@Override
	public boolean equals(Object obj){
		if( this.x == ((Mypoint)obj).x && this.y == ((Mypoint)obj).y )
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "Point(" + x + "," +y + ")";
	}
	
}

public class Practice{
	
	public static void main(String[] args) {
		 
		
        Mypoint p = new Mypoint(3, 50);
        Mypoint q = new Mypoint(4, 50);

        System.out.println(p);

        if(p.equals(q)) System.out.println("같은 점");
        else System.out.println("다른 점");                        
		

		/*
		Point(3,50)
		다른점
		*/
		
	}
	
}