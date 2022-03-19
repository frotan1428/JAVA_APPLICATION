package TypesOfExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class E04 {

    public static void main(String[] args) {

        File file=new File("src\\TypesOfExceptions\\file.txt");
         boolean b= file.canWrite();
        System.out.println(b);

        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File Does not Exits.");
        }
    }
}
