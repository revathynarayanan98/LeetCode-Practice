/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null|| t == null){
            return false;
        }
         else if(isSameTree(s, t)){
             return true;
         }
        else {
            return isSubtree(s.right, t) || isSubtree(s.left, t);
        }
        
    
    }
     public boolean isSameTree(TreeNode s, TreeNode t){
        if(s == null || t == null){
            return s == null && t == null;
        } 
        else if(s.val == t.val){
            return isSameTree(s.right, t.right) && isSameTree(s.left, t.left);
        }
        
        else {
            return false;
        }
    }
}