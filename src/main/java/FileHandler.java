import java.io.FileNotFoundException;

public class FileHandler {
    public static void main(String[] args) {
        writeFileContents();
    }
    private static void writeFileContents() {
        FileWriter myFileWriter= new FileWriter();
        String data = "Hello! How are you today?";
        try {
            myFileWriter.writeFile("DataFile.txt", data);
        } catch (FileNotFoundException e) {
            System.out.printf("Use a valid name");
            e.printStackTrace();
        }
        System.out.println();
    }
}
