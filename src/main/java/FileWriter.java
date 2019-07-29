import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void writeFile(String fileName,String data) throws FileNotFoundException {
        FileOutputStream wr = new FileOutputStream(fileName,true);
        BufferedOutputStream buff=new BufferedOutputStream(wr);
        try (buff){
            buff.write(data.getBytes());
        } catch (IOException e) {
            System.out.println("Exception occured at:"+e.getMessage());
            e.printStackTrace();
        }
    }
}
