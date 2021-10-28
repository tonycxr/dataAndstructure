package SparseArray;

public class day01 {
    public static int[][] sparseIntoNormal(int[][] nums){
        int[][] target = new int[nums[0][0]][nums[0][1]];
        for(int i=1;i<nums.length;i++){
            target[nums[i][0]][nums[i][1]] = nums[i][2];
        }
        return target;
    }

    public static int[][] normalIntoSparse(int[][] nums){
        int sum = 0;
        for (int[] num : nums) {
            for (int i : num) {
                if (i != 0) {
                    sum++;
                }
            }
        }
        int[][] sparseArr = new int[sum+1][3];
        int count = 0;
        sparseArr[0][0] = nums.length;
        sparseArr[0][1] = nums[0].length;
        sparseArr[0][2] = sum;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j] !=0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = nums[i][j];
                }
            }
        }
        return sparseArr;
    }
    public static void main(String[] args) {
        int[][] ints = new int[11][11];
        ints[1][2] = 1;
        ints[2][3] = 2;
        ints[4][5] = 2;
//        for (int[] row:ints){
//            for(int data: row){
//                System.out.printf("%d\t",data);
//            }
//            System.out.println();
//        }
        int[][] sparseArr = normalIntoSparse(ints);
//        for (int[] row:sparseArr){
//            for(int data: row){
//                System.out.printf("%d\t",data);
//            }
//            System.out.println();
//        }
        int[][] newArray = sparseIntoNormal(sparseArr);
        for (int[] row:newArray){
            for(int data: row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }

}
