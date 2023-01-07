package sdf;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
    
    public static void main(String[] args) {
        
        Path cithPath = Paths.get("./cat_in_the_hat.txt");

        System.out.printf("File name: %s\n", cithPath);

        File cith = cithPath.toFile();
        
        System.out.printf("is directory: %b\n", cith.isDirectory());
        System.out.printf("is file: %b\n", cith.isFile());

        if (cith.isDirectory()) {
            System.out.printf("Contents of directory %s\n");

            // For-each loop
            for (File file : cith.listFiles()) {
                System.out.printf("\t%s (%d)\n", file.getAbsolutePath(), file.length());
            }
            /*for (int i = 0; i < files.length; i++) {
                
            }*/
        } else {
            System.out.printf("file size: %d\n", cith.length());
            System.out.printf("absolute path: %s\n", cith.getAbsolutePath());
        }
        System.out.printf("file length: %d\n", cith.length());
        System.out.printf("absolute path: %s\n", cith.getAbsolutePath());
    }
}
