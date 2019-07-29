import java.io.FileNotFoundException;

public class FileHandler {
    public static void main(String[] args) {
        writeFileContents();
        readFileContents();
    }
    public static void readFileContents(){
        FileReader fileReader=new FileReader();
        try{
            String contents=fileReader.readFile("DataFile.txt");
            System.out.println(contents);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    private static void writeFileContents() {
        FileWriter myFileWriter= new FileWriter();
        String data = "Hello! How are you toooday?";
        try {
            myFileWriter.writeFile("DataFile.txt", data);
        } catch (FileNotFoundException e) {
            System.out.printf("Use a valid name");
            e.printStackTrace();
        }
        System.out.println();
    }
}
