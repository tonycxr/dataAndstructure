package Sort;

public class InsertSort {
    public static int[] sortByInsert(int[] ints){
        int temp = 1;
        int index = 0;
        for(int i=1;i<ints.length;i++){
            temp = ints[i];
            index = i-1;
            while(index>=0 && temp<ints[index]){
                ints[index+1] = ints[index];
                index--;
            }
            ints[index+1] = temp;

        }
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{1,8,3,7,2,6,4,5};
        int[] ints1 = sortByInsert(ints);
        for(int i:ints1){
            System.out.print(i+",");
        }
    }
}
