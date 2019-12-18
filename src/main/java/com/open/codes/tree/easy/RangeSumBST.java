package com.open.codes.tree.easy;

import org.junit.Test;

import org.junit.Assert;
/*
Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.

 

Example 1:

Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32
Example 2:

Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
Output: 23

Note:

The number of nodes in the tree is at most 10000.
The final answer is guaranteed to be less than 2^31.
	
 */


 class TreeNode {
	  int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) 
      { val = x; }
  }
 
public class RangeSumBST {
	public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null) {
        	return 0;
        }
        if(root.val < L) {
        	return 	rangeSumBST(root.right, L, R);
        }
        if(root.val > R) {
        	return rangeSumBST(root.left, L, R);
        }
        
        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
    
    @Test
    public void testBalancedStringSplit() {
    	TreeNode root = new TreeNode(10);
    	TreeNode firstLeftChild = new TreeNode(5);
    	root.left = firstLeftChild;
    	TreeNode firstRightChild = new TreeNode(15);
    	root.right = firstRightChild;
    	firstLeftChild.left = new TreeNode(3);
    	firstLeftChild.right = new TreeNode(7);
    	
    	firstRightChild.left = null;
    	firstRightChild.right = new TreeNode(18);
    	
    	System.out.println(new RangeSumBST().rangeSumBST(root, 7, 15));
    	Assert.assertEquals(32, new RangeSumBST().rangeSumBST(root, 7, 15));
    }
}
