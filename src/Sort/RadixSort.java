package Sort;

public class RadixSort {
    public static void main(String[] args) {
        int[] ints = new int[]{-9,-78,0,23,-544,70};
        int[] ints1 = sortByRadix(ints);
        for(int i:ints1){
            System.out.print(i+",");
        }
    }

    public static int[] sortByRadix(int[] ints){
        int[][] bucket = new int[10][ints.length];
        int[] bucketElementCounts = new int[10];
        for(int j=0;j<ints.length;j++){
            int digit = ints[j]%10;
            bucket[digit][bucketElementCounts[digit]] = ints[j];
            bucketElementCounts[digit]++;
        }
        return ints;
    }
}
