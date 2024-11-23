package filehandling;

import java.io.File;
import java.io.IOException;

public class FileWritingAndReadingOperation {
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

        String[] listOfFiles = dir.list();
        int count=0;

        for(String fileName:listOfFiles){
            System.out.println(fileName);
            count++;
        }
        System.out.println("Number of Files "+count);
    }
}
