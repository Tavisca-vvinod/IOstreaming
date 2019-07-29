package dataStreams;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ConsoleReader {

    public static void main(String[] a)
    {
        writeFile("Hi");
    }

    public static void writeFile(String data)
    {
        OutputStream writer= new BufferedOutputStream(System.out);
        try(writer){
            writer.write(data.getBytes());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
