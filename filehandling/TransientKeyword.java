package filehandling;

import java.io.*;

class Person implements Serializable {
    transient private String username;
    private String city;
    private double age;

    public Person(String username,double age,String city){
        this.username=username;
        this.age=age;
        this.city=city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TransientKeyword {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("arjun",21.5,"jaipur");

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

        //Serialization
        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(person);
        oos.flush();
        oos.close();

        //DeSerialization
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Person person1 = (Person)ois.readObject();
        System.out.println(person1);
        ois.close();

    }
}
