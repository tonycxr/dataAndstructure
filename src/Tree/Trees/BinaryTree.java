package Tree.Trees;

import Tree.Node.HeroNode;

public class BinaryTree {
    private HeroNode root;

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
