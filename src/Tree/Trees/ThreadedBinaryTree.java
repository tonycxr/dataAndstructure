package Tree.Trees;

import Tree.Node.HeroNode;

public class ThreadedBinaryTree {
    private HeroNode root;

    private HeroNode pre = null;
    public void threadedNodes(HeroNode node){
        if(node==null){
            return;
        }
        threadedNodes(node.getLeft());
        if(node.getLeft()==null){
            node.setLeft(pre);
            node.setLeftType(1);
        }
        if(pre!=null && pre.getRight()==null){
            pre.setRight(node);
            pre.setRightType(1);
        }
        pre=node;
        threadedNodes(node.getRight());

    }

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    public void delNode(int no){
        if(root!=null){
            if(root.getNo()==no){
                root = null;
            }else{
                root.delNode(no);
            }
        }else{
            System.out.println("空树，删除失败。");
        }
    }

    public void preOrder(){
        if(this.root!=null){
            this.root.preOrder();
        }else{
            System.out.println("二叉树为空");
        }
    }

    public void infixOrder(){
        if(this.root!=null){
            this.root.infixOrder();
        }else{
            System.out.println("二叉树为空");
        }
    }

    public void postOrder(){
        if(this.root!=null){
            this.root.postOrder();
        }else{
            System.out.println("二叉树为空");
        }
    }
}
