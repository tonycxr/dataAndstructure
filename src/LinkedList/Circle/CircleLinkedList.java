package LinkedList.Circle;

public class CircleLinkedList {
    private CircleHeroNode circleHeroNode = new CircleHeroNode(-1);
    public void addCircle(int nums){
        if(nums<1){
            System.out.println("数值不在合理范围内。");
        }
        CircleHeroNode temp = null;
        for(int i=1;i<=nums;i++){
            CircleHeroNode circle = new CircleHeroNode(i);
            if(i==1){
                circleHeroNode = circle;
                circleHeroNode.setNext(circleHeroNode);
                temp = circleHeroNode;
            }else{
                temp.setNext(circle);
                circle.setNext(circleHeroNode);
                temp = circle;
            }
        }
    }

    public void list(){
        if(circleHeroNode==null){
            System.out.println("环形链表为空");
        }
        CircleHeroNode temp = circleHeroNode;
        while (true){
            System.out.println("小孩的编号为："+temp.getNo());
            if(temp.getNext()==circleHeroNode){
                break;
            }
            temp = temp.getNext();
        }
    }

    public void countNode(int start,int count,CircleLinkedList list){
        if(list.circleHeroNode==null || start<1 ){
            return;
        }
        CircleHeroNode temp = list.circleHeroNode;
        while (true){
            if(temp.getNext()==list.circleHeroNode) {
                break;
            }
            temp=temp.getNext();
        }

    }
}
