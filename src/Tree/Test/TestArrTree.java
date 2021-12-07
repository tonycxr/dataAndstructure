package Tree.Test;

import Tree.BinaryTrees.ArrBinaryTree;

public class TestArrTree {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        ArrBinaryTree arrBinaryTree = new ArrBinaryTree(arr);
        arrBinaryTree.preOrder();
    }
}
