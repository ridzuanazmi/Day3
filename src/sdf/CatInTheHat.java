package sdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CatInTheHat {
    
    //public static void main(String[] args) throws FileNotFoundException {
    public static void main(String[] args) throws IOException {
        
    // Read the file the_cat_in_the_hat
    Path cithPath = Paths.get("./cat_in_th_hat.txt");
    File cith = cithPath.toFile();
        
        try {
            // Open a file
            InputStream is = new FileInputStream(cith);
            OutputStream os = new FileOutputStream("copy_of_cat_in_the_hat.txt");
            byte[] buffer = new byte[512]; //1/2K buffer

            // Read
            int size = is.read(buffer);
            // Size >0 when nit EOF, size == -1 at EOF
            while (size >= 0) {
                System.out.printf("read: %s\n", size);
                os.write(buffer, 0, size);
                size = is.read(buffer);
            }
           
            // Close the input stream
            is.close();

            // Close the output stream
            os.flush();
            os.close();

            // Close a file
            is.close();
        } catch (FileNotFoundException ex) {
            System.out.printf("IO exception: %s\n", ex.getMessage());
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.printf("IO exception: %s\n", ex.getMessage());
            ex.printStackTrace();
        }
        
    }
        
        
}

