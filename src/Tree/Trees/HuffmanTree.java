package Tree.Trees;

import Tree.Node.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {
    public static Node createHuffman(int[] arr){
        List<Node> nodes = new ArrayList<Node>();
        for(int value:arr){
            nodes.add(new Node(value));
        }
        while (nodes.size()>1){
            Collections.sort(nodes);
            Node left = nodes.get(0);
            Node right = nodes.get(1);
            Node parent = new Node(left.getValue()+right.getValue());
            parent.setLeft(left);
            parent.setRight(right);
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(parent);
        }
        return nodes.get(0);
    }
}
