package com.practice.trees;

import com.practice.util.TreeNode;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null || q == null)
			return (p == q);

		return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right) && (p.val == q.val));
	}
}
