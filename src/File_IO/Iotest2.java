package File_IO;

import java.io.*;

public class Iotest2 {
    public static void main(String[] args) {
        File src=new File("a.txt");
//        try {
//            src.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        InputStream is=null;
        try {
            is=new FileInputStream(src);
            int temp;
            while((temp=is.read()) !=-1){
                System.out.println((char)temp);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(null != is) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
