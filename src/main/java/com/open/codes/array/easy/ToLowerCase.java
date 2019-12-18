package com.open.codes.array.easy;

import org.junit.Test;

import org.junit.Assert;
/*
   Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

 

Example 1:

Input: "Hello"
Output: "hello"
Example 2:

Input: "here"
Output: "here"
Example 3:

Input: "LOVELY"
Output: "lovely"
	
 */
public class ToLowerCase {
	public String toLowerCase(String str) {
        StringBuilder br = new StringBuilder();
        for (char c : str.toCharArray()) {
			if(c>=65 && c<=90) {
				br.append((char)(c+32));
			} else {
				br.append(c);
			}
		}
        return br.toString();
        //Time Taken - 5000 ms
    }
	
	public String toLowerCase1(String str) {
        return str.toLowerCase();
        //Time Taken - 3000 ms
    }
    
    @Test
    public void testToLowerCase() {
    	System.out.println(new ToLowerCase().toLowerCase("Hello"));
    	System.out.println(new ToLowerCase().toLowerCase("here"));
    	System.out.println(new ToLowerCase().toLowerCase("LOVELY"));
    	Assert.assertEquals("hello", new ToLowerCase().toLowerCase("Hello"));
    	Assert.assertEquals("here", new ToLowerCase().toLowerCase("here"));
    	Assert.assertEquals("lovely", new ToLowerCase().toLowerCase("LOVELY"));
    }
    
    @Test
    public void testToLowerCaseLoop() {
    	ToLowerCase clz = new ToLowerCase();
    	
    	long start = System.currentTimeMillis();
    	for(int i = 0; i<10000000;i++) {
    		clz.toLowerCase("Hi this Is a String to Manupulate THE ultimate String so That IT could HAve mUltiple EffEct.");
    	}
    	long end = System.currentTimeMillis();
    	System.out.println("Time Taken: " + (end - start));
    }
}
