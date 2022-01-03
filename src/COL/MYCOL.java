package COL;

class MyCollec<T>{
    Object obj[]=new Object[5];
    public T get(int i){
        return (T)obj[i];
    }

    public void set(T e,int i){
        obj[i]= e;
    }
}


public class MYCOL {
    public static void main(String[] args) {
        MyCollec<String> mc=new MyCollec<>();
        MyCollec<Integer> mc1=new MyCollec<Integer>();
        mc.set("aaa",0);
        mc.set("bbb",1);
        System.out.println(mc.get(1));

    }
}
