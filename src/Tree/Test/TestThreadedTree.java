package Tree.Test;

import Tree.BinaryTrees.ThreadedBinaryTree;
import Tree.Node.HeroNode;

public class TestThreadedTree {
    public static void main(String[] args) {
        HeroNode root = new HeroNode(1,"1");
        HeroNode node2 = new HeroNode(2,"3");
        HeroNode node3 = new HeroNode(3,"6");
        HeroNode node4 = new HeroNode(4,"8");
        HeroNode node5 = new HeroNode(5,"10");
        HeroNode node6 = new HeroNode(6,"14");
        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        ThreadedBinaryTree threadedBinaryTree = new ThreadedBinaryTree();
        threadedBinaryTree.setRoot(root);
//        threadedBinaryTree.preOrder();
        threadedBinaryTree.threadedNodes(root);
    }

}
