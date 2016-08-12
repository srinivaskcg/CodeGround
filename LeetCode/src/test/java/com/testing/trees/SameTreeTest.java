package com.testing.trees;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.practice.trees.SameTree;
import com.practice.util.TreeNode;

public class SameTreeTest {
	SameTree tree = new SameTree();

	@Test
	public void testIsSameTree1() {
		Integer[] p = { };
		Integer[] q = { };
		assertTrue(isSameTree(p, q));
	}
	
	@Test
	public void testIsSameTree2() {
		Integer[] p = { 1 };
		Integer[] q = { 1 };
		assertTrue(isSameTree(p, q));
	}
	
	@Test
	public void testIsSameTree3() {
		Integer[] p = { 1, 2 };
		Integer[] q = { 1, 2 };
		assertTrue(isSameTree(p, q));
	}
	
	@Test
	public void testIsSameTree4() {
		Integer[] p = { 1, 2, 3 };
		Integer[] q = { 1, 2, 4 };
		assertFalse(isSameTree(p, q));
	}
	
	@Test
	public void testIsSameTree5() {
		Integer[] p = { 1, -2, -3, 1, 3, -2, null, -1 };
		Integer[] q = { -2, null, -3 };
		assertFalse(isSameTree(p, q));
	}
	
	private boolean isSameTree(Integer[] p, Integer[] q) {
		TreeNode t1 = TreeNode.convert(p);
		TreeNode t2 = TreeNode.convert(q);
		return tree.isSameTree(t1, t2);
	}
}
