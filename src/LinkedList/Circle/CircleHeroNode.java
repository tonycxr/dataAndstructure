package LinkedList.Circle;

public class CircleHeroNode {
    private int no;
    private CircleHeroNode next;

    public CircleHeroNode(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public CircleHeroNode getNext() {
        return next;
    }

    public void setNext(CircleHeroNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "CircleHeroNode{" +
                "no=" + no +
                '}';
    }
}
