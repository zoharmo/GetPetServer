package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.tomcat.util.codec.binary.Base64;

public class Utils {


   public static  String encodeFileToBase64Binary(String picName){
		 File file =  new File("C:/Users/Mor Zohar/workspace/GetPet/src/data/pics/"+ picName + ".jpg");

        String pic = null;
        try {
            FileInputStream fileInputStreamReader = new FileInputStream(file);
            byte[] bytes = new byte[(int)file.length()];
            fileInputStreamReader.read(bytes);
            fileInputStreamReader.close();
            String encodedfile = new String(Base64.encodeBase64(bytes), "UTF-8");
           pic = new StringBuilder().append("data:image/jpeg;base64,").append(encodedfile).toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pic;
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