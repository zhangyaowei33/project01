package File_IO;

import java.io.*;

public class Iotest4 {
    public static void main(String[] args) {

        File dest=new File("dest.txt");
        OutputStream os=null;
        try {
            os=new FileOutputStream(dest,true);
            String msg="IO is so easy\r\n";
            byte[] datas=msg.getBytes();
            os.write(datas,0,datas.length);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
