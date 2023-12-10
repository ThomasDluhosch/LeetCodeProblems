package _DailyQuestions;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/*
    DailyProblem 09.12.2023
    Given the root of a binary tree,
    return the inorder traversal of its nodes' values.
 */
public class BinaryTreeInorderTraversal {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
/*
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        return inorder(root, list);
    }


    public List<Integer> inorder(TreeNode root, List<Integer> nums) {

        if (root == null) return nums;
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
        return nums;

    }

 */

}
