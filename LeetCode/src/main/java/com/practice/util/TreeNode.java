package com.practice.util;

public class TreeNode {
	public int val;
	public TreeNode left, right;

	TreeNode(int x) {
		val = x;
	}
	
	public static TreeNode convert(Integer[] array) {
		TreeNode root = createTreeNode(array, 1);
		return root;
	}

	private static TreeNode createTreeNode(Integer[] input, int index) {
		if (index <= input.length) {
			Integer value = input[index - 1];
			if (value != null) {
				TreeNode t = new TreeNode(value);
				t.left = createTreeNode(input, index * 2);
				t.right = createTreeNode(input, index * 2 + 1);
				return t;
			}
		}
		return null;
	}
}
