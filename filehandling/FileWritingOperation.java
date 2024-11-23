package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingOperation {
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
        FileWriter fw = new FileWriter(file,true);
        fw.write('\n');
        fw.write('a');
        fw.write('r');
        fw.write('j');
        fw.write('u');
        fw.write('n');
        fw.write(1);
        fw.close();
    }
}
