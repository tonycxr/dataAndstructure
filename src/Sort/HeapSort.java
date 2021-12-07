package Sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {4,6,8,5,9,12,45,66,2};
        System.out.println(Arrays.toString(heap(arr)));

    }

    public static int[] heap(int[] arr){
        int temp = 0;
        for(int i=arr.length/2-1;i>=0;i--){
            adjustHeap(arr,i,arr.length);
        }
        for(int j=arr.length-1;j>0;j--){
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjustHeap(arr,0,j);
        }

        return arr;
    }

    public static void adjustHeap(int arr[],int i,int len){
        int temp = arr[i];
        for(int k=2*i+1;k<len;k=2*k+1){
            if(k+1<len && arr[k]<arr[k+1]){
                k++;
            }
            if(arr[k]>temp){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;
    }
}
