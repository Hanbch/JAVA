package HS_Training;

import java.util.Scanner;

// 67.
/*
"abstract class Fruit {
        abstract void print();  
}

main(){
Fruit fAry[] = {new Grape(), new Apple(), new Pear()};
for(Fruit f : fAry){
f.print();
}

- ���
���� �����̴�.
���� ����̴�.
���� ���̴�.'"
 */

abstract class Fruit{
	public abstract void print();
}

class Grape extends Fruit{
	public void print() {System.out.println("���� ����");}
}

class Apple extends Fruit{
	public void print() {System.out.println("���� Apple");}
}

class Pear extends Fruit{
	public void print() {System.out.println("���� Pear");}
}



public class HS_067 {
	
	public static void main(String[] args) {
		
		 Fruit[] fru = {new Grape(), new Apple(), new Pear()};
		 
		 for(Fruit e:fru) {
			 e.print();
		 }
		
		
	}

}
