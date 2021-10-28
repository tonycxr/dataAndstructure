package Queue;

public class ArrayQueue {
    private int max;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue(int maxSize){
        max=maxSize;
        arr = new int[maxSize];
        front = -1; //指向队列头部
        rear = -1; //指向队列尾部
    }

    public boolean isFull(){
        return rear == max - 1;
    }

    public boolean isEmpty(){
        return rear == front;
    }

    public void addQueue(int n){
        if(isFull()){
            System.out.println("队列已满");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        front++;
        return arr[front];
    }

    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列为空");
        }
        for(int num:arr){
            System.out.println(num);
        }
    }

    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return arr[front+1];
    }
}

