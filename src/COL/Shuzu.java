package COL;

import java.util.Arrays;

class Man{
    private int ID;
    private String name;
    public Man(int ID,String name){
        this.ID=ID;
        this.name=name;
        }

    @Override
    public String toString() {
        return "Man{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }

}
public class Shuzu {
    public static void main(String[] args) {
        Man[] mans;
        mans =new Man[3];
        Man m1=new Man(1,"zhang");
        Man m2=new Man(2,"wang");
        mans[1]=m1;
        mans[2]=m2;
        System.out.println(mans[1].toString());
        System.out.println(mans[2].toString());
        System.out.println(m1);

        int[] a=new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=i*10;
            System.out.println(a[i]);
        }
        String[] s = {"阿里","尚学堂","京东","搜狐","网易"};
        String[] ss=new String[6];
        System.arraycopy(s,2,ss,1,2);
        for (String s1 : ss) {
            System.out.println(s1);
        }
        System.out.println(Arrays.toString(ss));
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        int[] aa= {1,3,5,7,9,11,15};
        System.out.println("该数组索引="+ Arrays.binarySearch(aa,5));
        Arrays.fill(aa,2,4,20);
        System.out.println(Arrays.toString(aa));

        int[][] ab=new int[][]{{1,2,3},{4,5},{6,7,8,9}};
        int[][] ac=new int[3][];
        ac[0]=new int[]{9,8,7};
        ac[1]= new int[]{6, 8, 7};
        ac[2]=new int[]{5,8,7};
        System.out.println(Arrays.toString(ab[0]));
        System.out.println(Arrays.toString(ac[1]));

        Object[] a1=new Object[]{1001,"zhang",18};
        Object[] a2=new Object[]{1002,"wang",19};
        Object[] a3={1003,"ma",19};
        Object[][] em=new Object[3][];
        em[0]=a1;
        em[1]=a2;
        em[2]=a3;
        System.out.println(Arrays.toString(em[0]));
        System.out.println(Arrays.toString(em[1]));
        System.out.println(Arrays.toString(em[2]));

    }

}
