package Tree.Test;

import Tree.Node.Node;

import static Tree.Trees.HuffmanTree.createHuffman;

public class TestHuffman {
    public static void main(String[] args) {
        int[] arr = {13,7,8,3,29,6,1};
        Node root = createHuffman(arr);
        root.preOrder();
    }
}
