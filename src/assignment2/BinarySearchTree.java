package assignment2;

public class BinarySearchTree {
    private Node root;

    /**
     * Inserts a key into this binary search tree.
     * If there are n nodes in the tree, then the average runtime of
     this method should be log(n).
     *
     * @param key The key to insert.
     */
    public void insert(int key) {
        insert(this.root, key);
    }

    private void insert(Node root, int key){
        if(root == null){
            root = new Node();
            root.key = key;
            return;
        }
        if(root.key < key){
            insert(root.right, key);
        }else{
            insert(root.left, key);
        }
    }

    /**
     * Checks whether or not a key exists in this binary search tree.
     * If there are n nodes in the tree, then the average runtime of
     this method should be log(n).
     *
     * @param key The key to check for.
     * @return true if the key is present in this binary search tree,
    false otherwise.
     */

    public boolean find(int key) {
        return find(this.root, key);
    }

    private boolean find(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.key < key){
            return find(root.right, key);
        }
        else if (root.key > key){
            return find(root.left, key);
        }
        return true;
    }

    public static class Node {
        public int key;
        public Node left;
        public Node right;
    }
}
