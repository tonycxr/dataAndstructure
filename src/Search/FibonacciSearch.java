package Search;

import java.util.Date;

public class FibonacciSearch {
    public static void main(String[] args) {
        int[] arr = new int[10000000];
        for(int i=0;i<arr.length;i++){
            arr[i] = i+1;
        }
        System.out.println(new Date());
        System.out.println(FibonacciSearch1(arr,0,arr.length-1,36));
        System.out.println(new Date());
    }

    public static int FibonacciSearch1(int[] arr,int left,int right,int toFind){
        if(left>right || toFind<arr[0] || toFind>arr[arr.length-1]){
            return -1;
        }
        //上述条件是必须而不是可有可无，否则mid可能会越界
        int mid = left+(right-left)*(toFind-arr[left])/(arr[right]-arr[left]);
        int arrMid = arr[mid];
        if(toFind>arrMid){
            return FibonacciSearch1(arr,mid+1,right,toFind);
        }else if(toFind<arrMid){
            return FibonacciSearch1(arr,left,mid-1,toFind);
        }else {
            return mid;
        }
    }
}
