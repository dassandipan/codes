package com.open.codes.array.easy;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
/*
  		Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

 

Example 1:


Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Example 2:

Input: head = [0]
Output: 0
Example 3:

Input: head = [1]
Output: 1
Example 4:

Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
Output: 18880
Example 5:

Input: head = [0,0]
Output: 0
	
 */

 class ListNode {
     int val;
     ListNode next;
    ListNode(int x) { val = x; }
 }

public class ConvertBinaryInLinkedList {
	public int getDecimalValue(ListNode head) {
		StringBuilder sb = new StringBuilder();
        while(head!=null) {
        	sb.append(head.val);
        	head = head.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
	
	 public int uniqueMorseRepresentations(String[] words) {
	        String[] morseCodes = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
	                         "....","..",".---","-.-",".-..","--","-.",
	                         "---",".--.","--.-",".-.","...","-","..-",
	                         "...-",".--","-..-","-.--","--.."};
	        
	        Set<String> seen = new HashSet<>();
	        for (String word : words) {
				StringBuilder sb = new StringBuilder();
				for (char c : word.toCharArray()) {
					sb.append(morseCodes[c-'a']);
				}
				seen.add(sb.toString());
			}
	        return seen.size();
	        
	 }
	
}
