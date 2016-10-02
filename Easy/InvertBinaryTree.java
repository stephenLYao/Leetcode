// Invert a binary tree.
//
//      4
//    /   \
//   2     7
//  / \   / \
// 1   3 6   9
// to
//      4
//    /   \
//   7     2
//  / \   / \
// 9   6 3   1

public class InvertBinaryTree{
  class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ val = x;}
  }

  public TreeNode invertBinaryTree(TreeNode root){
    if(root == null) return null;
    TreeNode node = root.left;
    root.left = invertBinaryTree(root.right);
    root.right = invertBinaryTree(node);

    return root;
  }
}
