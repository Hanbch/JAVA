package HS_Training;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* 87.
"�Ʒ��� TreeMap�� ��ü Value�� Ȯ�� �ϱ� ���� �ҽ��� ¥�ÿ�.

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(45, ""Brown"");
        map.put(37, ""James"");
        map.put(23, ""Martin"");

���)
45 Brown
37 James
23 Martin"
*/



public class HS_087 {

	public static void main(String[] args) {
		 TreeMap<Integer, String> map = new TreeMap<>();
	        map.put(45, "Brown");
	        map.put(37, "James");
	        map.put(23, "Martin");
	        
	        Set<Integer> ks = map.keySet();
	        
	        for(int k: ks)
	        	System.out.println(k+ " " + map.get(k));
	        
//	        Iterator<Integer> itr = ks.iterator();
//	        
//	        while(itr.hasNext()) {
//	        	System.out.println(itr.next() + " " + map.get(itr.next()));
//	        }
	}

}
