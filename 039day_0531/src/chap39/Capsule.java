package chap39;

class SinvelCap{
	void take() {
		System.out.println("take SinvelCap");
	}
}

class SneezeCap{
	void take() {
		System.out.println("take SneezeCap");
	}
}

class SnuffleCap{
	void take() {
		System.out.println("take SnuffleCap");
	}
}

class SinusCap{
	
	SinvelCap s1 = new SinvelCap();
	SneezeCap s2 = new SneezeCap();
	SnuffleCap s3 = new SnuffleCap();
	
	void take() {
		s1.take();
		s2.take();
		s3.take();
	}
	
}

class ColPatient{
	void takeSinus(SinusCap cap) {
		cap.take();
	}
}

public class Capsule {

	public static void main(String[] args) {
		ColPatient p1 = new ColPatient();
		p1.takeSinus(new SinusCap());

	}

}
