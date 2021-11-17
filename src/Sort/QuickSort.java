package Sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] ints = new int[]{-9,-78,0,23,-544,70};
        int[] ints1 = sortByQuick(ints,0,5) ;
        for(int i:ints1){
            System.out.print(i+",");
        }
    }

    public static int[] sortByQuick(int[] ints,int left,int right){
        int l = left;
        int r = right;
        int M = ints[(l+r)/2];
        int temp = 0;
        while (l<r){
            while (ints[l]<M){
                l++;
            }
            while (ints[r]>M){
                r--;
            }
            if(l>=r){
                break;
            }
            temp = ints[r];
            ints[r] = ints[l];
            ints[l] = temp;
            if(ints[l] == M){
                r--;
            }
            if(ints[r]==M){
                l++;
            }
        }
        if(l==r){
            l++;
            r--;
        }
        if(left<r){
            sortByQuick(ints,left,r);
        }
        if(right>l){
            sortByQuick(ints,l,right);
        }

        return ints;
    }
}
