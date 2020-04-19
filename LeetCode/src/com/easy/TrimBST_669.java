package com.easy;

import com.util.TreeNode;

public class TrimBST_669 {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null)
            return root;
        if(root.val < L)
            return trimBST(root.right, L, R);
        if(root.val > R)
            return trimBST(root.left, L, R);

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);

        return root;
    }
}