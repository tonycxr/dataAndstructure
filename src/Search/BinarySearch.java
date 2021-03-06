package Search;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = new int[]{13,13,13,13,13,13,13,29,36};
//        System.out.println(BinarySearch1(arr,0,arr.length-1,36));
//        System.out.println(BinarySearch2(arr,0,arr.length-1,13));
        int[] arr = new int[10000000];
        for(int i=0;i<arr.length;i++){
            arr[i] = i+1;
        }
        System.out.println(new Date());
        System.out.println(BinarySearch1(arr,0,arr.length-1,36));
        System.out.println(new Date());
    }

    public static int BinarySearch1(int[] arr,int left,int right,int toFind){
        if(left>right){
            return -1;
        }
        int mid = (left+right) / 2;
        int arrMid = arr[mid];
        if(toFind>arrMid){
            return BinarySearch1(arr,mid+1,right,toFind);
        }else if(toFind<arrMid){
            return BinarySearch1(arr,left,mid-1,toFind);
        }else {
            return mid;
        }
    }

    public static List<Integer> BinarySearch2(int[] arr, int left, int right, int toFind){
        ArrayList<Integer> allTheIndex = new ArrayList<>();
        if(left>right){
            allTheIndex.add(-1);
            return allTheIndex;
        }
        int mid = (left+right) / 2;
        int arrMid = arr[mid];
        if(toFind>arrMid){
            return BinarySearch2(arr,mid+1,right,toFind);
        }else if(toFind<arrMid){
            return BinarySearch2(arr,left,mid-1,toFind);
        }else {
            allTheIndex.add(mid);
            int temp1 = mid-1;
            int temp2 = mid+1;
            while ( temp1>-1 && arr[temp1]==toFind){
                allTheIndex.add(temp1);
                temp1--;
            }
            while (temp2<arr.length && arr[temp2]==toFind){
                allTheIndex.add(temp2);
                temp2++;
            }
            return allTheIndex;
        }
    }
}
