package File_IO;

import java.io.*;

public class Iotest4_zifu {
    public static void main(String[] args) {

        File dest=new File("dest.txt");
        Writer writer=null;
        try {
            writer=new FileWriter(dest);
            //写法一
//            String msg="IO is so easy\r\n人生得意须尽欢，莫使金樽空对月";
//            char[] datas=msg.toCharArray();  //字符串---->字符数组
//            writer.write(datas,0,datas.length);
            //写法二
//            String msg="IO is so easy\r\n人生得意须尽欢，莫使金樽空对月";
//            writer.write(msg,1,22);
            //写法三
            writer.append("IO is so easy\r\n").append("人生得意须尽欢").append("莫使金樽空对月");
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
