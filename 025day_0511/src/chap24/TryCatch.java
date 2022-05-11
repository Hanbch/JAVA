//package chap24;
//
//import java.nio.file.Path;
//
//class TryCatch {
//	public static void main(String[] args) {
//	   Path file = Paths.get("C:\\Simple.txt");
//	   BufferedWriter writer = null;
//
//	   try {
//	      writer = Files.newBufferedWriter(file);   // IOException �߻� ����
//	      writer.write('A');   // IOException �߻� ����
//	      writer.write('Z');   // IOException �߻� ����
//
//	      if(writer != null)
//	          writer.close();   // IOException �߻� ����
//	   }
//	   catch(IOException e) {
//	      e.printStackTrace();
//	   }
//	}
//}
