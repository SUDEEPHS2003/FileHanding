
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriting {
    public static void main(String[] args) {
        try{
            FileWriter writingg = new FileWriter("alex.txt");

            writingg.write("File handling in Java refers to the process of interacting with "+
                   " files stored on a computer's disk, including operations like creating,"+
                     "reading, writing, and deleting files.\n"+
                    "Java provides comprehensive support for "+
                    "file handling through its java.io and"+
                    "java.nio.file packages.");
            writingg.close();
            System.out.println("Writing successfully ");

        }catch (IOException e){
            System.out.println("Error accured");
            e.printStackTrace();
        }
    }
}
