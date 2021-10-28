package Stack;

public class CalculatorByStack {
    private int maxSize;
    private int[] stack;
    private int top = -1;

    public CalculatorByStack(int maxSize){
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

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("栈是空的");
        }
        return stack[top];
    }

    public void list(){
        if(isEmpty()){
            System.out.println("栈是空的");
        }
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }

    public int prior(int oper){
        if(oper == '*' || oper == '/'){
            return 1;
        }else if(oper == '+' || oper == '-'){
            return 0;
        }else{
            return -1;
        }
    }

    public boolean isOper(char val){
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    public int cal(int num1,int num2,int oper){
        int target = 0;
        switch (oper){
            case '+':
                target = num2+num1;
                break;
            case '-':
                target = num2-num1;
                break;
            case '*':
                target = num1*num2;
                break;
            case '/':
                target = num2/num1;
                break;
        }
        return target;
    }
}
