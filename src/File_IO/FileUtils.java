package File_IO;

import java.io.*;

public class FileUtils {
    public static void main(String[] args) {
        //文件到文件
        try {
            InputStream is=new FileInputStream("a.txt");
            OutputStream os=new FileOutputStream("a_copy.txt");
            copy(is,os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //文件到字节数组
        byte[] datas=null;
        try {
            InputStream is = new FileInputStream("1002.jpg");
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            copy(is,os);
            datas=os.toByteArray();
            System.out.println(datas.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //字节数组到文件
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(datas);
            OutputStream os = new FileOutputStream("1025.jpg");
            copy(is,os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }




    public static void copy(InputStream is, OutputStream os){
        byte[] flush=new byte[1024*10];
        int len = -1;
        try {
            while((len=is.read(flush))!=-1){
                os.write(flush,0,len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        close2(is,os);
    }
    //释放资源方法一
    public static void close1(InputStream is,OutputStream os){
        if(null!=os){
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(null!=is){
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //释放资源方法二
    public static void close2(Closeable...ios){
        for(Closeable io:ios){
            if(null!=io){
                try {
                    io.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
