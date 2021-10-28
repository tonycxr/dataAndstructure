package Queue;

public class CircleQueueTest {
    public static void main(String[] args) {
        CircleQueue circleQueue = new CircleQueue(6);
        circleQueue.addQueue(5);
        circleQueue.addQueue(51);
        circleQueue.addQueue(52);
        circleQueue.addQueue(53);
        circleQueue.addQueue(54);
        circleQueue.addQueue(55);
        System.out.println(circleQueue.getQueue());
        System.out.println(circleQueue.getQueue());
        System.out.println(circleQueue.getQueue());
        circleQueue.showQueue();
    }
}
