import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void writeFile(String fileName,String data) throws FileNotFoundException {
        FileOutputStream wr = new FileOutputStream(fileName);
        try (wr){
            wr.write(data.getBytes());
        } catch (IOException e) {
            System.out.println("Exception occured at:"+e.getMessage());
            e.printStackTrace();
        }
    }
}
