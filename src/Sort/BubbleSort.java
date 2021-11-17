package Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3,4, 5, 6, 8, 7};
        sort(ints);
        for(int i:ints){
            System.out.print(i+" ");
        }
    }

    public static void sort(int[] arr){
        int temp = 0;
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    count++;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(count==0){
                break;
            }else{
                count = 0;
            }
        }
    }
}
