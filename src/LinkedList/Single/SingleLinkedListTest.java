package LinkedList.Single;

import java.util.Stack;

public class SingleLinkedListTest {
    public static int getCount(SingleLinkedList list){
        SingleHeroNode Head = list.getHead();
        int count = 0;
        while(true){
            if (Head.next==null){
                return count;
            }
            count++;
            Head = Head.next;
        }
    }

    public static SingleHeroNode getKthNode(SingleLinkedList list, int k){
        SingleHeroNode Head = list.getHead();
        while(true){
            if(Head.next==null){
                System.out.println("该节点不存在");
                return null;
            }
            if(Head.next.no==k){
                return Head.next;
            }
            Head=Head.next;
        }
    }

    public static SingleLinkedList Reverse(SingleLinkedList list){
        int count = getCount(list);
        SingleLinkedList target = new SingleLinkedList();
        while(count>0){
            SingleHeroNode singleHeroNode = getKthNode(list,count);
            singleHeroNode.next = null;
            target.add(singleHeroNode);
            count--;
        }
        return target;
    }

    public static void printReversedList(SingleLinkedList list){
        SingleHeroNode Head = list.getHead();
        if(Head.next==null){
            System.out.println("链表为空");
        }
        Stack<SingleHeroNode> stack = new Stack<>();
        SingleHeroNode temp = Head.next;
        while (temp!=null){
            stack.push(temp);
            temp = temp.next;
        }
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        SingleHeroNode h1 = new SingleHeroNode(1,"tom","t1");
        SingleHeroNode h2 = new SingleHeroNode(2,"tommy","t2");
        SingleHeroNode h3 = new SingleHeroNode(3,"tony","t3");

        SingleHeroNode h4 = new SingleHeroNode(4,"tommy2","t4");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addByOrder(h1);
        singleLinkedList.addByOrder(h4);
        singleLinkedList.addByOrder(h2);
        singleLinkedList.addByOrder(h3);
        singleLinkedList.update(h4);
        singleLinkedList.list();
        printReversedList(singleLinkedList);
//        SingleLinkedList list2 = Reverse(singleLinkedList);
//        System.out.println(getCount(singleLinkedList));
//        System.out.println(getKthNode(singleLinkedList,3));
//        list2.list();

    }
}
