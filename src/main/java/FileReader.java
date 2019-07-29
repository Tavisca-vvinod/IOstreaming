import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public String readFile(String fileName) throws FileNotFoundException {
        String contents="";
        FileInputStream fileInputStream=new FileInputStream(fileName);
        try(fileInputStream) {
            byte [] buffer =  new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            contents=new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contents;
    }
}
