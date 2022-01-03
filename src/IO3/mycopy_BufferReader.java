package IO3;

import java.io.*;

///拷贝文件
public class mycopy_BufferReader {
    public static void main(String[] args) {
        long t1= System.currentTimeMillis();
        copy("a.txt","aaa.txt");
        long t2=System.currentTimeMillis();
        System.out.println(t2-t1);

    }
    public static void copy(String srcPath,String destPath){
        File src=new File(srcPath);
        File dest=new File(destPath);


        try {
            BufferedReader br=new BufferedReader(new FileReader(src));
            BufferedWriter bw=new BufferedWriter(new FileWriter(dest));
            //逐行读取
            String lene=null;
            while((lene=br.readLine())!=null){
               bw.write(lene);  //逐行写出
               bw.newLine();
            }
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
