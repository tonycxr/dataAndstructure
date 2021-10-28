package LinkedList.Double;

import sun.security.krb5.internal.tools.Klist;

public class DoubleLinkedListTest {
    public static void main(String[] args) {
        DoubleHeroNode d1 = new DoubleHeroNode(1,"Tom1","mot1");
        DoubleHeroNode d2 = new DoubleHeroNode(2,"Tom2","mot2");
        DoubleHeroNode d3 = new DoubleHeroNode(3,"Tom3","mot3");
        DoubleHeroNode d4 = new DoubleHeroNode(4,"Tom4","mot4");
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(d1);
        doubleLinkedList.add(d2);
        doubleLinkedList.add(d3);
        doubleLinkedList.add(d4);
        doubleLinkedList.list();
        DoubleHeroNode doubleHeroNode = new DoubleHeroNode(2, "Tony", "ynoT");
        doubleLinkedList.update(doubleHeroNode);

        doubleLinkedList.delete(3);
        doubleLinkedList.list();

    }
}
