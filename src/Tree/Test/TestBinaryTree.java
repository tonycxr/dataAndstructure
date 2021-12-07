package Tree.Test;

import Tree.BinaryTrees.BinaryTree;
import Tree.Node.HeroNode;

public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        HeroNode root = new HeroNode(1,"宋江");
        HeroNode node1 = new HeroNode(2,"吴勇1");
        HeroNode node2 = new HeroNode(3,"吴勇2");
        HeroNode node3 = new HeroNode(4,"吴勇3");

        root.setLeft(node1);
        root.setRight(node2);
        node2.setRight(node3);
        binaryTree.setRoot(root);
        binaryTree.preOrder();
//        binaryTree.infixOrder();
//        binaryTree.postOrder();
        binaryTree.delNode(1);
        binaryTree.preOrder();
    }
}
