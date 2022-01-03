package IO3;

import java.io.*;

public class Iotest_Buffer {
    public static void main(String[] args) {
        File src=new File("a.txt");
        BufferedReader read = null;
        try {
            read= new BufferedReader(new FileReader(src));
            String line=null;
            while((line=read.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
