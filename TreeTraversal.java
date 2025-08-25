import java.util.*;
class TreeTraversal {
  static int count = 0;
  public static void main(String []args) {
    TreeNode node = new TreeNode(1);
    node.left = new TreeNode(2);
    node.right = new TreeNode(3);
    node.left.left = new TreeNode(4);
    node.left.right = new TreeNode(5);
    node.right.left = new TreeNode(6);
    node.right.right = new TreeNode(7);
    inorder(node);
    System.out.println();
    preorder(node);
    System.out.println();
    postorder(node);
    System.out.println();
    levelorder(node);
    System.out.println();
    System.out.print(count);
  }
  public static void levelorder(TreeNode node) {
    Queue<TreeNode> q = new LinkedList<>();
    q.add(node);
    while(!q.isEmpty()) {
      TreeNode current = q.poll();
      System.out.print(current.data + " ");
      count++;
      if(current.left != null) q.add(current.left);
      if(current.right != null) q.add(current.right);
    }
  }
  public static void inorder(TreeNode node) {
    if(node == null) return;
    inorder(node.left);
    System.out.print(node.data + " ");
    inorder(node.right);
  }
  public static void preorder(TreeNode node) {
    if(node == null) return;
    System.out.print(node.data +  " ");
    preorder(node.left);
    preorder(node.right);
  }
  public static void postorder(TreeNode node) {
    if(node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.data + " ");
  }
}
class TreeNode {
  int data;
  TreeNode right, left;
  TreeNode(int val) {
    data = val;
    right = left = null;
  }
}