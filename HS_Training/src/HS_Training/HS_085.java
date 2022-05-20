package HS_Training;

import java.util.HashSet;

/* 85.
"�Ʒ��� ���α׷��� �ǵ��� Num �� ����ÿ�.

        HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println(""�ν��Ͻ� ��: "" + set.size());

        for(Num n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();

/*
====���
�ν��Ͻ� ��: 2
7799        9955
*/

class Num{
	private int num;
	
	Num(int num){this.num = num;}
	
	@Override
	public int hashCode() {
		return num%3;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( this.num == ((Num)obj).num )
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return this.num + "";
	}
	
}

public class HS_085 {

	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println("�ν��Ͻ� ��: " + set.size());

        for(Num n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();
	}

}
