package Stack;

public class StackByArray {
    private int maxSize;
    private int[] stack;
    private int top = -1;

    public StackByArray(int maxSize){
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    public boolean isFull(){
        return top==maxSize-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("栈已经满了");
            return;
        }
        top++;
        stack[top] = value;
    }

    public int getPop(){
        if(isEmpty()){
            throw new RuntimeException("栈是空的");
        }
        int temp = top;
        top--;
        return stack[temp];
    }

    public void list(){
        if(isEmpty()){
            System.out.println("栈是空的");
        }
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
