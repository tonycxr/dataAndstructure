package Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,7,8,13,13,13,29,36};
        System.out.println(BinarySearch1(arr,0,arr.length-1,8));
    }

    public static int BinarySearch1(int[] arr,int left,int right,int toFind){
        if(left>right){
            return -1;
        }
        int mid = (left+right) / 2;
        int arrMid = arr[mid];
        if(toFind>arrMid){
            return BinarySearch1(arr,mid,right,toFind);
        }else if(toFind<arrMid){
            return BinarySearch1(arr,left,mid,toFind);
        }else {
            return mid;
        }

    }
}
