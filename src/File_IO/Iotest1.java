package File_IO;

import java.io.*;

public class Iotest1 {
    public static void main(String[] args) {
        File src=new File("a.txt");
//        try {
//            src.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            InputStream is=new FileInputStream(src);
            int data1=is.read();
            int data2=is.read();
            int data3=is.read();
            System.out.println((char)data1);
            System.out.println((char)data2);
            System.out.println((char)data3);
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
