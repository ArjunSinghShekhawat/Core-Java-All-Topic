package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintWriter {
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
        java.io.PrintWriter pw = new java.io.PrintWriter(fw);

        pw.println("Hello arjun singh");
        pw.println("21+90=111");
        pw.close();

    }

}
