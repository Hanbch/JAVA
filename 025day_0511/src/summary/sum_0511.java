
//05/11
/*
1. throws에 대하여 설명하시오.
  - 자신을 호출한 상위 메소드로 에러를 던지는 역할을 합니다.

2. unchecked Exception 과 Checked Exception 에 대하여 설명하시오.
  - java에서 Exception에는  IOE Exception과 runtime Exception이 있는데 
  	runtime Exception을 unchecked Exception 이라하고 IOE Exception을 Checked Exception
  	이라고한다.
  
3. 아래의 컴파일 에러가 나는 이유와 잡는 방법 2가지 방법은?

class IOExceptionCase2 { 
    public static void main(String[] args) {
        Path file = Paths.get("C:\\javastudy\\Simple.txt");
        BufferedWriter writer = null;
        writer = Files.newBufferedWriter(file);     // IOException 발생 가능
        writer.write('A');     // IOException 발생 가능
        writer.write('Z');     // IOException 발생 가능

        if(writer != null)
            writer.close();     // IOException 발생 가능  
    }
}

try catch문을 사용하서나 오류가나는 메서드를 호춣하는 클래스에 throws Exception을 적어준다. 

4. 아래가 컴파일 에러가 나는 이유에 대하여 설명하시오.
try {
		int num = 6 / 0;
} catch (Exception e) {
		e.printStackTrace();
} catch (InputMismatchException e) {
		e.printStackTrace();
}

  - catch에서 첫번째 catch에 InputMismatchException보다 상위 클래스 Exception가 있어서 
  	저 분기식에서는 두번째 catch문이 실행이 안된다. 그래서 오류가 난다.
  	

 */

package summary;


public class sum_0511 {
	public static void main(String[] args) {
		
		
		
	}
}
