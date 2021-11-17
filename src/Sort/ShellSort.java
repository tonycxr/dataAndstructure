package Sort;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8,9,1,7,2,3,5,4,6,0};
        shell2(arr);
        for(int i:arr){
            System.out.print(i+",");
        }
    }

    public static int[] shell(int[] ints){
        int temp = 0;
        for(int len=ints.length/2;len>0;len /=2){
            for(int i=len;i<ints.length;i++){
                for(int j=i-len;j>=0;j-=len){
                    if(ints[j]>ints[j+len]){
                        temp = ints[j];
                        ints[j] = ints[j+len];
                        ints[j+len] = temp;
                    }
                }
            }
        }
        return ints;
    }

    public static int[] shell2(int[] ints){
        int temp = 0;
        for(int len=ints.length/2;len>0;len /=2){
            for(int i=len;i<ints.length;i++){
                int j=i;
                temp = ints[j];
                if(ints[j]<ints[j-len]){
                    while (j>=len && temp<ints[j-len]){
                        ints[j] = ints[j-len];
                        j -=len;
                    }
                    ints[j] = temp;
                }
            }
        }
        return ints;
    }
}
