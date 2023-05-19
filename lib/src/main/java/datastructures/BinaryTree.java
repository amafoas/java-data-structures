package datastructures;

class TreeNode {
  int data;
  TreeNode left;
  TreeNode right;

  public TreeNode(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
  }
}


public class BinaryTree {
  TreeNode root;

  public BinaryTree(){
    this.root = null;
  }

  public void insert(int value){
    TreeNode node = new TreeNode(value);
    if (this.root == null) {
      this.root = node;
      return;
    }
    TreeNode curr = this.root;
    while(curr != null){
      if (curr.data > value) {
        if (curr.left == null) {
          curr.left = node;
          return;
        } else {
          curr = curr.left;
        }
      } else {
        if (curr.right == null) {
          curr.right = node;
          return;
        } else {
          curr = curr.right;
        }
      }
    }
  }

  public void delete(int value){
    this.root = deleteRec(root, value);
  }
  
  private TreeNode deleteRec(TreeNode node, int value){
    if (node == null) return node;

    if (value < node.data) {
      root.left = deleteRec(node.left, value);
    } else if (value > node.data) {
      root.right = deleteRec(node.right, value);
    } else {
      // Case 1: is a leaf
      if (node.left == null && node.right == null) {
        return null;
      } else if (node.left == null) { // Case 2: one child
        return node.right;
      } else if (node.right == null) {
        return node.left;
      } else { // Case 3: two childs
        TreeNode successor = findMinValueNode(node.right);
        node.data = successor.data;
        node.right = deleteRec(node.right, successor.data);
      }
    }

    return node;
  }

  private TreeNode findMinValueNode(TreeNode node) {
    TreeNode current = node;
    while (current.left != null) {
      current = current.left;
    }
    return current;
  }

  public boolean search(int value){
    TreeNode curr = this.root;
    while(curr != null){
      if (curr.data == value) {
        return true;
      }
      if (curr.data > value) {
        curr = curr.left;
      } else {
        curr = curr.right;
      }
    }
    return false;
  }

  public int height(){
    return heightRec(root);
  }

  private int heightRec(TreeNode node){
    if (node == null) return -1;

    int leftHeight = heightRec(node.left);
    int rightHeight = heightRec(node.right);

    return Math.max(leftHeight, rightHeight) + 1;
  }
}
