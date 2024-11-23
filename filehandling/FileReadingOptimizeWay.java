package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingOptimizeWay {
    public static void main(String[] args) throws IOException {
        //Create Directory
        File dir = new File("CodeForJava");
        if(!dir.exists()){
            boolean isDirPresent = dir.mkdir();
            if(isDirPresent){
                System.out.println("Directory is present "+dir);
            }
        }
        //Create File
        File file = new File(dir,"StudentInformation.txt");
        if(!file.exists()){
            boolean isFilePresent = file.createNewFile();
            if(isFilePresent){
                System.out.println("File is present "+file);
            }
        }

        FileReader fr = new FileReader(file);
        char[]container = new char[(int)file.length()];
        fr.read(container);

        for(char ch:container){
            System.out.println((char) ch);
        }

    }
}
