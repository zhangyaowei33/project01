package File_IO;

import java.io.*;

public class Iotest3_zifu {
    public static void main(String[] args) {
        File src=new File("a.txt");
        Reader reader=null;
        try {
            reader=new FileReader(src);
            char[] temp=new char[1024];
            int len=-1;
            while((len=reader.read(temp)) !=-1){
                //字节数组---》字符串（
                String str=new String(temp,0,len);
                System.out.println(str);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(null != reader) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
