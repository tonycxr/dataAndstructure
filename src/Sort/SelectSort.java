package Sort;

import java.util.HashMap;

public class SelectSort {
    public static void main(String[] args) {
        int[] ints = {3, 2, 1,4, 15, 6, 8, 7,10,9};
        sort(ints);
        for(int i:ints){
            System.out.print(i+" ");
        }
    }

    public static void sort(int[] arr){
        int min ;
        int temp = 0;
        boolean isFlag = false;
        for(int i=0;i<arr.length-1;i++){
            min = i;
            isFlag = false;
            for(int j=i;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    isFlag = true;
                    min = j;
                }
            }
            if(isFlag){
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
