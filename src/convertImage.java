import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.tomcat.util.codec.binary.Base64;

public class convertImage {

	public static void main(String[] args) {
		 File f =  new File("C:/Users/Rave Shem Tov/Desktop/1.jpg");
         String encodstring = encodeFileToBase64Binary(f);
         System.out.println(encodstring);
         
         decode(encodstring);
         System.out.println("decodeing");
   }

   private static String encodeFileToBase64Binary(File file){
        String encodedfile = null;
        try {
            FileInputStream fileInputStreamReader = new FileInputStream(file);
            byte[] bytes = new byte[(int)file.length()];
            fileInputStreamReader.read(bytes);
            fileInputStreamReader.close();
            encodedfile = new String(Base64.encodeBase64(bytes), "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return encodedfile;
    }
   
   private static void decode(String crntImage) {
	// Note preferred way of declaring an array variable
	   byte[] data = Base64.decodeBase64(crntImage);
	   try (OutputStream stream = new FileOutputStream("d:/decode/abc.bmp")) {
	       stream.write(data);
	   } catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
   }
}