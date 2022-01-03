package COL;

import java.util.Arrays;

public class boolsort {
    public static void main(String[] args) {
        int[] value={9,7,5,3,1,8,4,6,2};
        myboolsort(value);
        System.out.println(Arrays.toString(value));
        System.out.println(binsearh(value,9));
        System.out.println(Arrays.binarySearch(value,6));
        int[] der=Arrays.copyOfRange(value,2,5);
        System.out.println(Arrays.toString(der));
        int[]dd=Arrays.copyOfRange(value,0,value.length);
        boolean sf=Arrays.equals(value,dd);
        System.out.println(sf);
        int[] dde=new int[5];
        Arrays.fill(dde,1,3,5);
        System.out.println(Arrays.toString(dde));

    }
    public static void myboolsort(int[] ss){
        for(int j=ss.length-1;j>0;j--){
            for(int i=0;i<j;i++){
                if(ss[i]>ss[i+1]){
                    int tem=ss[i];
                    ss[i]=ss[i+1];
                    ss[i+1]=tem;
                }
            }
        }
    }
    public static int binsearh(int[] ss,int a){
        int low=0,high=ss.length-1;
        while (low<=high){
            int mid=(low+high)>>1;
            if(ss[mid]==a){
                return mid;
            }else if(ss[mid]<a){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return -1;
    }
}
