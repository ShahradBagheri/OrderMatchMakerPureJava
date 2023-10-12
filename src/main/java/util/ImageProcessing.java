package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImageProcessing {
    public static byte[] imageToBytes(String filepath){
        try{
            return Files.readAllBytes(Paths.get(filepath));
        }catch (IOException e){
            System.err.println(e.getMessage());
            return null;
        }
    }
}
