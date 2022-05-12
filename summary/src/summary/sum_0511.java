
//05/11
/*
1. throws�� ���Ͽ� �����Ͻÿ�.
  - �ڽ��� ȣ���� ���� �޼ҵ�� ������ ������ ������ �մϴ�.

2. unchecked Exception �� Checked Exception �� ���Ͽ� �����Ͻÿ�.
  - java���� Exception����  IOE Exception�� runtime Exception�� �ִµ� 
  	runtime Exception�� unchecked Exception �̶��ϰ� IOE Exception�� Checked Exception
  	�̶���Ѵ�.
  
3. �Ʒ��� ������ ������ ���� ������ ��� ��� 2���� �����?

class IOExceptionCase2 { 
    public static void main(String[] args) {
        Path file = Paths.get("C:\\javastudy\\Simple.txt");
        BufferedWriter writer = null;
        writer = Files.newBufferedWriter(file);     // IOException �߻� ����
        writer.write('A');     // IOException �߻� ����
        writer.write('Z');     // IOException �߻� ����

        if(writer != null)
            writer.close();     // IOException �߻� ����  
    }
}

try catch���� ����ϼ��� ���������� �޼��带 ȣ���ϴ� Ŭ������ throws Exception�� �����ش�. 

4. �Ʒ��� ������ ������ ���� ������ ���Ͽ� �����Ͻÿ�.
try {
		int num = 6 / 0;
} catch (Exception e) {
		e.printStackTrace();
} catch (InputMismatchException e) {
		e.printStackTrace();
}

  - catch���� ù��° catch�� InputMismatchException���� ���� Ŭ���� Exception�� �־ 
  	�� �б�Ŀ����� �ι�° catch���� ������ �ȵȴ�. �׷��� ������ ����.
  	

 */

package summary;


public class sum_0511 {
	public static void main(String[] args) {
		
		
		
	}
}
