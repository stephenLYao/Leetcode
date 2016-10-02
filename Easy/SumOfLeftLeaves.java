// Find the sum of all left leaves in a given binary tree.
//
// Example:
//
//     3
//    / \
//   9  20
//     /  \
//    15   7
//
// There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.


// Definition for a binary tree node.


public class SumOfLeftLeaves{
  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }
  public int sumOfLeftLeaves(TreeNode root) {
      int result = 0;
      if(root != null){
          if(root.left == null && root.right == null){
              result += root.left.val;
          }
          else{
              result += sumOfLeftLeaves(root.left);
          }

          result += sumOfLeftLeaves(root.right);
      }
      return result;
  }
}
