package COL;

import java.util.*;

public class Colection1 {
    public static void main(String[] args) {
        List<String> LL1=new ArrayList<>();
        LL1.add("张三");
        System.out.println(LL1.isEmpty());
        LL1.add("李四");
        LL1.add("王五");
        System.out.println(LL1);

        LL1.remove(1);
        System.out.println(LL1);
        System.out.println(LL1.indexOf("王五"));
        LL1.set(1,"王麻子");
        System.out.println(LL1);

        List<String> LL2=new ArrayList<>();
        LL2.add("赵柳");
        LL2.add("老马");
        System.out.println(LL1.containsAll(LL2));
        LL1.addAll(LL2);
        System.out.println(LL1);
        System.out.println(LL1.get(1));
        LL1.remove(2);
        System.out.println(LL1);
        System.out.println(LL1.size());
        LL1.retainAll(LL2);
        System.out.println("LL1=" + LL1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        for(Iterator<String> it=LL2.iterator();it.hasNext();){
            String tem=it.next();
            System.out.println(tem);
        }
        Collections.sort(LL2);
        System.out.println(LL2);


        HashMap<Integer,String> m1=new HashMap<Integer,String>();
        HashMap<Integer,String> m2=new HashMap<Integer,String>();
        m1.put(1001,"马");
        m1.put(1002,"王");
        m1.put(1003,"张1");
        m2.put(1003,"郑");
        m2.put(1004,"路");
        System.out.println(m1);
        System.out.println(m1.size());
        System.out.println(m1.containsKey(1002));
        System.out.println(m1.containsValue("王"));
        HashMap<Integer,String> m3=new HashMap<>();
        Hashtable<Integer,String> m4=new Hashtable<>();
        m3.putAll(m1);
        m4.putAll(m1);
        System.out.println(m3);
        System.out.println(m4);
        m4.putAll(m2);
        System.out.println(m4);
        System.out.println(m4.keySet());
        System.out.println(m4.values());
        m4.replace(1004,"岳飞");
        m4.put(1005,"辛弃疾");
        System.out.println(m4);
        String s1=new String();
        s1="人生得意须尽欢 莫使金樽空对月";
        System.out.println(s1.indexOf("莫"));
        System.out.println(s1.indexOf("人的生"));
        System.out.println(s1.charAt(5));
        String s2=s1.substring(3,5);
        System.out.println(s2);




        Set<Integer> ks=new HashSet<>();
        ks=m4.keySet();
        for(Iterator<Integer> it=ks.iterator();it.hasNext();){
            int aa=it.next();
            System.out.println(aa + "-->" + m4.get(aa));
        }



    }
}
