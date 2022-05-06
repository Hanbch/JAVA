package HS_Training;

// 60.
/*
 "�Ʒ��� ���α׷��� ���� ������ �Ͻÿ�.
public static void main(String[] args) {
   Friend[] frns = new Friend[10];
   int cnt = 0;
   
   frns[cnt++] = new UnivFriend(""LEE"", ""Computer"", ""010-333-555"");
   frns[cnt++] = new UnivFriend(""SEO"", ""Electronics"", ""010-222-444"");
   frns[cnt++] = new CompFriend(""YOON"", ""R&D 1"", ""02-123-999"");
   frns[cnt++] = new CompFriend(""PARK"", ""R&D 2"", ""02-321-777"");
   
   // ��� ��â �� ������ ���� ��ü ���
   for(int i = 0; i < cnt; i++) {
      frns[i].showInfo();      // �������̵� �� �޼ҵ尡 ȣ��ȴ�.
      System.out.println();
   }
}"
  */

class Friend{
	String name;
	String phN;
	
	Friend(String name, String phN){
		this.name = name;
		this.phN = phN;
	}
	
	void showInfo(){
		 System.out.print(name +" ");
		 System.out.print(phN);
		 System.out.println();
	 }
}

class UnivFriend extends Friend{
	String course;
	
	 UnivFriend(String name, String phN, String course) {
		super(name,phN);
		this.course = course;
	}
	 
	 void showInfo(){
		 System.out.print(super.name +" ");
		 System.out.print(this.course + " ");
		 System.out.print(super.phN);
		 System.out.println();
	 }
}

class CompFriend extends Friend{
	String dept;
	
	CompFriend(String name, String phN, String dept) {
		super(name,phN);
		this.dept = dept;
	}
	void showInfo(){
		 System.out.print(super.name +" ");
		 System.out.print(this.dept + " ");
		 System.out.print(super.phN);
		 System.out.println();
	 }
}

public class HS_060 {
	
	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
	   int cnt = 0;
	   
	   frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
	   frns[cnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");
	   frns[cnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
	   frns[cnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");
	   
	   
	  
	   for(int i = 0; i < cnt; i++) {
		   frns[i].showInfo();
	   }
			
	}

}
