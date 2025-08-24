import java.io.File;
import java.io.IOException;


public class FileCreating {
    public static void main(String[] args) {
        try{
            File myFile = new File("alex.txt");
            if(myFile.createNewFile()){
                System.out.println("File created "+myFile.getName());
            }else{
                System.out.println(myFile.getName()+" File already exists");
            }
        }catch (IOException a){
            System.out.println("Error accured");
            a.printStackTrace();
        }
    }
}
