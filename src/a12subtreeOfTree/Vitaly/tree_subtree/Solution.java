package a12subtreeOfTree.Vitaly.tree_subtree;

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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        if(root.val==subRoot.val) {
            if (isSame(root,subRoot)) return true;
            //System.out.println("matching heads");
        }

        return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
    }


    public static boolean isSame(TreeNode root, TreeNode subRoot){
        // check all possible cases and only proceed if values are aequal and not null
        // x = null     , y = notNull       1
        // x = notNull  , y = Null          2
        // x = null     , y = null          4
        // both notNull and equal           5
        // both notNull and notEqual        6
//         if 1,2,6 -> isSame -> false
//         if 6 -> proceed testing
//         if 4 -> isSame -> true
        if(root==null && subRoot!=null) return false;   //case 1
        if(root!=null && subRoot == null) return false; //case 2

        if(subRoot==null && root==null)return true;
        if(root.val!=subRoot.val) return false;
        return (isSame(root.left,subRoot.left) && isSame(root.right,subRoot.right));

    }
}

