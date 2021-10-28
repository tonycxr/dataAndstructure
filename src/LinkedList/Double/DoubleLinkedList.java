package LinkedList.Double;

public class DoubleLinkedList {
    private DoubleHeroNode head = new DoubleHeroNode(0,"","");
    public DoubleHeroNode getHead(){
        return head;
    }
    public void list(){
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }
        DoubleHeroNode temp = head.next;
        while(true){
            if(temp == null){
                break;
            }
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }

    public void add(DoubleHeroNode doubleHeroNode){
        DoubleHeroNode temp = head;
        while(true){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = doubleHeroNode;
        doubleHeroNode.pre=temp;
    }

    public void update(DoubleHeroNode doubleHeroNode){
        DoubleHeroNode temp = head;
        boolean isFlag = true;
        while(true){
            if(temp.next==null){
                System.out.println("所需要修改的英雄不存在");
                isFlag = false;
                break;
            }
            if(temp.no==doubleHeroNode.no){
                break;
            }
            temp=temp.next;
        }
        if(isFlag){
            temp.name = doubleHeroNode.name;
            temp.nickname = doubleHeroNode.nickname;
        }
    }

    public void delete(int no){
        if(head.next==null){
            System.out.println("链表为空，无法删除");
            return;
        }
        DoubleHeroNode temp = head.next;
        boolean flag = false;
        while (true){
            if(temp==null){
                break;
            }
            if(temp.no==no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.pre.next = temp.next;
            if(temp.next!=null){
                temp.next.pre = temp.pre;
            }
        }else{
            System.out.println("要删除的节点不存在");
        }
    }
}
