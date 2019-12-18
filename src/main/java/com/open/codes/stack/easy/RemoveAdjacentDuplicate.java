package com.open.codes.stack.easy;

import java.util.Stack;

import org.junit.Test;

/*
 
 Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.

We repeatedly make duplicate removals on S until we no longer can.

Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.

 

Example 1:

Input: "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
 

Note:

1 <= S.length <= 20000
S consists only of English lowercase letters.

 */
public class RemoveAdjacentDuplicate {
	public String removeDuplicates(String S) {
        Stack stack = new Stack<>();
        for (char c : S.toCharArray()) {
			if(stack.isEmpty() || (char)stack.peek()!=c) {
				stack.push(c);
			} else if ((char)stack.peek()==c) {
				stack.pop();
			}
		}
        
        StringBuilder br = new StringBuilder();
        
        Object[] array = stack.toArray();
        for(int i=0;i<array.length;i++) {
        	br.append(array[i]);
        }
        return br.toString();
        
    }
	
	@Test
	public void testRemoveDuplicates() {
		System.out.println(new RemoveAdjacentDuplicate().removeDuplicates("abbaca"));
	}
}
