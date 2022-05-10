package HS_Training;

// 64.
/*
interface Printable { // MS�� �����ϰ� ������ �������̽�
        public void print(String doc);
}

        //SPrinterDriver �� LPrinterDriver�� ����ÿ�
        public static void main(String[] args) {
                String myDoc = "This is a report about...";

                // �Ｚ �����ͷ� ���
                Printable prn = new SPrinterDriver();
                prn.print(myDoc);
                System.out.println();

                // LG �����ͷ� ���
                prn = new LPrinterDriver();
                prn.print(myDoc);
        }

/*
���: 
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
