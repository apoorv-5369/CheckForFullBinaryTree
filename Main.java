class Node{
    int data;
    Node left, right;
    Node(int item){
        data=item;
        left=right=null;
    }
}
public class binaryTree{
    Node root;
    // Check for full binary tree.
    static boolean fullBinaryTree(Node node){
        // Check if the tree is empty.
        if(node==null) return true;
        if(node.left==null&&node.right==null) return true;
        if((node.left!=null)&&(node.right!=null)) return fullBinaryTree(node.left)&&fullBinaryTree(node.right);
        return false;
    }
    public static void main(String[] args){
        binaryTree tree = new binaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);
        if(tree.fullBinaryTree(tree.root)) System.out.println("The Tree is a Full Binary Tree.");
        else System.out.println("The Tree is not a Full Binary Tree.");
    }
}
