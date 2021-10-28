package LinkedList.Single;

public class SingleLinkedList {
    private SingleHeroNode head = new SingleHeroNode(0,"","");

    public SingleHeroNode getHead() {
        return head;
    }

    public void add(SingleHeroNode singleHeroNode){
        SingleHeroNode temp = head;
        while(true){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = singleHeroNode;
    }

    public void list(){
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }
        SingleHeroNode temp = head.next;
        while(true){
            if(temp == null){
                break;
            }
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }

    public void addByOrder(SingleHeroNode singleHeroNode){
        SingleHeroNode temp = head;
        boolean flag = false;
        while (true){
            if(temp.next==null){
                break;
            }
            if(temp.next.no> singleHeroNode.no){
                break;
            }else if(temp.next.no == singleHeroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.println("添加失败，准备插入的英雄编号已经存在:"+ singleHeroNode.no);
        }else{
            singleHeroNode.next = temp.next;
            temp.next = singleHeroNode;
        }
    }

    public void update(SingleHeroNode singleHeroNode){
        SingleHeroNode temp = head;
        boolean isFlag = true;
        while(true){
            if(temp.next==null){
                System.out.println("所需要修改的英雄不存在");
                isFlag = false;
                break;
            }
            if(temp.no== singleHeroNode.no){
                break;
            }
            temp=temp.next;
        }
        if(isFlag){
            temp.name = singleHeroNode.name;
            temp.nickname = singleHeroNode.nickname;
        }
    }
    public void delete(SingleHeroNode singleHeroNode){

    }
}
