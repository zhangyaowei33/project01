package File_IO;

import java.io.*;
///拷贝文件
public class mycopy {
    public static void main(String[] args) {
        copy("1002.jpg","1003.jpg");

    }
    public static void copy(String srcPath,String destPath){
        File src=new File(srcPath);
        File dest=new File(destPath);
        InputStream is=null;
        OutputStream os=null;

        try {
            is=new FileInputStream(src);
            os=new FileOutputStream(dest);
            byte[]flush=new byte[1024];//缓冲容器
            int len=-1;
            while((len=is.read(flush))!=-1){
                os.write(flush,0,len);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //释放，先打开的后关闭
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
    }
}
