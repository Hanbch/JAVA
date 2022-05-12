
//05/11
/*
1. throws¿¡ ´ëÇÏ¿© ¼³¸íÇÏ½Ã¿À.
  - ÀÚ½ÅÀ» È£ÃâÇÑ »óÀ§ ¸Ş¼Òµå·Î ¿¡·¯¸¦ ´øÁö´Â ¿ªÇÒÀ» ÇÕ´Ï´Ù.

2. unchecked Exception °ú Checked Exception ¿¡ ´ëÇÏ¿© ¼³¸íÇÏ½Ã¿À.
  - java¿¡¼­ Exception¿¡´Â  IOE Exception°ú runtime ExceptionÀÌ ÀÖ´Âµ¥ 
  	runtime ExceptionÀ» unchecked Exception ÀÌ¶óÇÏ°í IOE ExceptionÀ» Checked Exception
  	ÀÌ¶ó°íÇÑ´Ù.
  
3. ¾Æ·¡ÀÇ ÄÄÆÄÀÏ ¿¡·¯°¡ ³ª´Â ÀÌÀ¯¿Í Àâ´Â ¹æ¹ı 2°¡Áö ¹æ¹ıÀº?

class IOExceptionCase2 { 
    public static void main(String[] args) {
        Path file = Paths.get("C:\\javastudy\\Simple.txt");
        BufferedWriter writer = null;
        writer = Files.newBufferedWriter(file);     // IOException ¹ß»ı °¡´É
        writer.write('A');     // IOException ¹ß»ı °¡´É
        writer.write('Z');     // IOException ¹ß»ı °¡´É

        if(writer != null)
            writer.close();     // IOException ¹ß»ı °¡´É  
    }
}

try catch¹®À» »ç¿ëÇÏ¼­³ª ¿À·ù°¡³ª´Â ¸Ş¼­µå¸¦ È£­„ÇÏ´Â Å¬·¡½º¿¡ throws ExceptionÀ» Àû¾îÁØ´Ù. 

4. ¾Æ·¡°¡ ÄÄÆÄÀÏ ¿¡·¯°¡ ³ª´Â ÀÌÀ¯¿¡ ´ëÇÏ¿© ¼³¸íÇÏ½Ã¿À.
try {
		int num = 6 / 0;
} catch (Exception e) {
		e.printStackTrace();
} catch (InputMismatchException e) {
		e.printStackTrace();
}

  - catch¿¡¼­ Ã¹¹øÂ° catch¿¡ InputMismatchExceptionº¸´Ù »óÀ§ Å¬·¡½º Exception°¡ ÀÖ¾î¼­ 
  	Àú ºĞ±â½Ä¿¡¼­´Â µÎ¹øÂ° catch¹®ÀÌ ½ÇÇàÀÌ ¾ÈµÈ´Ù. ±×·¡¼­ ¿À·ù°¡ ³­´Ù.
  	

 */

package summary;


public class sum_0511 {
	public static void main(String[] args) {
		
		
		
	}
}
