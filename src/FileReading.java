import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        try{
            File reading = new File("alex.txt");
            Scanner data = new Scanner(reading);
            while(data.hasNextLine()){
                String reading1 = data.nextLine();
                System.out.println(reading1);
            }

        }catch (IOException e){
            System.out.println("Error accured");
            e.printStackTrace();
        }
    }
}
