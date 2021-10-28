package Queue;

public class CircleQueue {
    private int max;
    private int front;
    private int rear;
    private int[] arr;

    public CircleQueue(int maxSize){
        max=maxSize;
        arr = new int[maxSize];
        front = 0; //指向队列头部
        rear = 0; //指向队列尾部
    }

    public boolean isFull(){
        return (rear+1) % max == front;
    }

    public boolean isEmpty(){
        return rear == front;
    }

    public void addQueue(int n){
        if(isFull()){
            System.out.println("队列已满");
            return;
        }
        arr[rear] = n;
        rear = (rear+1) % max;
    }

    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int temp = front;
        front=(front+1) % max;
        return arr[temp];
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
