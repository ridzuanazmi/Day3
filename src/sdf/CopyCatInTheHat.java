package sdf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyCatInTheHat {
    
    public static void main(String[] args) throws Exception {
        
        // Read the File the_cat_in_th_hat.txt
        Path cithPath = Paths.get("./cat_in_th_hat.txt"); // To get file path
        File cith = cithPath.toFile(); // Put the file path into a file

        // Check if the file exist
        if (!cith.exists()) {
            System.err.println("Cannot find file");
            System.exit(1);
        }

        // Read the lines in the file. Read characters
        FileReader fr = new FileReader(cith);
        BufferedReader br = new BufferedReader(fr);

        // Creater a new file name and store it in writer
        FileWriter writer = new FileWriter("CAT_IN_THE_HAT.txt");
        String line;

        // Reads each line and converts it into uppercase characters
        while (null != (line = br.readLine())) {
            writer.write(line.toUpperCase());
            writer.write("\n");
        }

        // Close the reader
        br.close();
        fr.close();

        // Close the writer
        writer.flush();
        writer.close();

    }
}
