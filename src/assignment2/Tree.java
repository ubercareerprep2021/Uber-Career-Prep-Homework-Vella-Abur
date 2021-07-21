package assignment2;

public class Tree {
    public TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(6, null, null);
        TreeNode rightChild = new TreeNode(3, null, null);
        TreeNode left = new TreeNode(7, null, null);
        TreeNode right = new TreeNode(17, leftChild, rightChild);
        TreeNode root = new TreeNode(1, left, right);
        Tree tree = new Tree(root);
        print(tree.root);
    }

    public static class TreeNode {
        public int data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    //EX1
    public static void print(TreeNode node) {
        System.out.print(node.data + " ");
        if (node.left != null ){
            print(node.left);
        }
        if (node.right != null){
            print(node.right);
        }
        return;
    }

    //EX2
}
