package HS_Training;

// 64.
/*
interface Printable { // MS가 정의하고 제공한 인터페이스
        public void print(String doc);
}

        //SPrinterDriver 와 LPrinterDriver를 만드시오
        public static void main(String[] args) {
                String myDoc = "This is a report about...";

                // 삼성 프린터로 출력
                Printable prn = new SPrinterDriver();
                prn.print(myDoc);
                System.out.println();

                // LG 프린터로 출력
                prn = new LPrinterDriver();
                prn.print(myDoc);
        }

/*
출력: 
From Samsung printer
This is a report about ...
From LG printer
This is a report about ...
*/

interface Printable{
	
	void print(String myDoc);
	
}

class Sprint implements Printable{
	
	public void print(String myDoc) {
		System.out.println("Sprint");
		System.out.println(myDoc);
	}
}

class Lprint implements Printable{
	
	public void print(String myDoc) {
		System.out.println("Lprint");
		System.out.println(myDoc);
	}
}

public class HS_064 {
	
	public static void main(String[] args) {
		String myDoc = "This id a report about..";
		
		Printable prn = new Sprint();
		Printable prn1 = new Lprint();
		prn.print(myDoc);
		prn1.print(myDoc);
		
	}

}
