package filehandling;

import java.io.*;

public class BufferWriterAndReader {
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
        //Write file
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("\n hy komal how are you");
        bw.write(21);
        bw.close();

        //Reading file
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line!=null){
            System.out.println(line);
            line=br.readLine();
        }
        br.close();
    }
}
