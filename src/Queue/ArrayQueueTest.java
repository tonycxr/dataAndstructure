package Queue;

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.addQueue(10);
        arrayQueue.addQueue(8);
        arrayQueue.addQueue(5);
        arrayQueue.showQueue();
        System.out.println(arrayQueue.headQueue());
        arrayQueue.addQueue(80);
    }
}
