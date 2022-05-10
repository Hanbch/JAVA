package chap23;

interface Printable{
	abstract public void print(String  doc);
}

interface ColorPrintable extends Printable{
	abstract public void print909(String  doc);
}


class Prn909 implements ColorPrintable { 
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
	
	@Override
	public void print909(String doc) {
		System.out.println("From 909 printer");
		System.out.println(doc);
	}
}

class LprinterDriver implements Printable { 
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}


class Printer implements Printable{
	
	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
}

public class InterFace03 {

	public static void main(String[] args) {
		String myDoc = "This id a report about..";
		
		System.out.println("");
		
//		Printable prn2 = new LprinterDriver();
//		prn2.print(myDoc);
		
		ColorPrintable prt = new Prn909();
		prt.print909(myDoc);
	}

}
