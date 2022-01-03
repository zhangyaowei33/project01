package File_IO;

import java.io.*;

public class Iotest3 {
    public static void main(String[] args) {
        File src=new File("a.txt");

        InputStream is=null;
        try {
            is=new FileInputStream(src);
            byte[] temp=new byte[3];
            int len=-1;
            while((len=is.read(temp)) !=-1){
                //字节数组---》字符串（解码）
                String str=new String(temp,0,len);
                System.out.println(str);
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
