package com.yxl.classroom;
import java.util.Arrays;
import static com.yxl.classroom.Coed5.arrAgs;

public class Coed6 {

    public static void main(String[] args) {
       int [] arr= arrAgs(10);
        fenSu(arr,arrMaxMin(arr)[0],arrMaxMin(arr)[1]);
        System.out.println("去掉最高分和最低分"+Arrays.toString(arrMaxMin(arr)));
    }

    public static int[] arrMaxMin(int[] arr) {
        int max=arr[0],min=arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return new int[]{max,min};
    }
    public static void fenSu(int[] arr,int max,int min){
        int sum=0;double avg=0;
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        avg=  (double) (sum - max - min) /(arr.length-2);
        System.out.println("平均分"+avg);
    }
}
