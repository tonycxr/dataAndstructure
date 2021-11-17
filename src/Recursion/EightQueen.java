package Recursion;
public class EightQueen {
    static int AnswerCount = 0;
    static int max = 8;
    int[] array = new int[max];
    public static void main(String[] args) {
        EightQueen eightQueen = new EightQueen();
        eightQueen.check(0);
        System.out.println(AnswerCount);
    }
    public void check(int n){
        if(n==max){
            AnswerCount++;
            return;
        }
        for(int i=0;i<max;i++){
            array[n] = i;
            if(judge(n)){
                check(n+1);
            }
        }
    }
    public boolean judge(int n){
        for(int i=0;i<n;i++){
            if(array[i] == array[n] || Math.abs(n-i)==Math.abs(array[i]-array[n])){
                return false;
            }
        }
        return true;
    }
}
