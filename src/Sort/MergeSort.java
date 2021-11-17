package Sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] ints = new int[]{-9,-78,0,23,-544,70};
        int[] ints1 = sortByMerge(ints,0,0,0,ints);
        for(int i:ints1){
            System.out.print(i+",");
        }
    }

    /**
     *
     * @param ints 排序的原始数组
     * @param left 左边有序序列初始索引
     * @param mid 中间索引
     * @param right 右边索引
     * @param temp 做中转的数组
     * @return
     */

    public static int[] sortByMerge(int[] ints,int left,int mid,int right,int[] temp){
        int i = left;
        int j = mid +1;
        int t = 0;
        while (i<=mid && j<=right){
            if(ints[i]<=ints[j]){
                temp[t] = ints[i];
                t++;
                i++;
            }else{
                temp[t] = ints[j];
                t++;
                j++;
            }
        }
        while (i<=mid){
            temp[t] = ints[i];
            t++;
            i++;
        }
        while (j<=right){
            temp[t] = ints[j];
            t++;
            j++;
        }

        t=0;
        int tempLeft = left;
        while (tempLeft<=right){
            ints[tempLeft] = temp[t];
            t++;

        }
        return ints;
    }

}
