package com.open.codes.array.easy;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
/*

You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
	
 */
public class JewelsInStores {
	public int numJewelsInStones1(String J, String S) {
		Set<String> charSet = new HashSet<>();
		int count = 0;
		for(char c : J.toCharArray()) {
			charSet.add(String.valueOf(c));
		}
        for (char c : S.toCharArray()) {
			if(charSet.contains(String.valueOf(c))) {
				count++;
			}
		}
        return count;
        //Time Taken = 1592 ms
    }
	
	public int numJewelsInStones2(String J, String S) {
		Set charSet = new HashSet();
		int count = 0;
		for(char c : J.toCharArray()) {
			charSet.add(c);
		}
        for (char c : S.toCharArray()) {
			if(charSet.contains(c)) {
				count++;
			}
		}
        return count;
        //Time Taken = 986 ms
    }
	
	public int numJewelsInStones3(String J, String S) {
		return S.replaceAll("[^" + J + "]", "").length();
        //Time Taken = 4000 ms
    }
    
    @Test
    public void testnumJewelsInStones() {
    	System.out.println(new JewelsInStores().numJewelsInStones1("aA", "aAAbbbb"));
    	System.out.println(new JewelsInStores().numJewelsInStones1("z", "ZZ"));
    	Assert.assertEquals(3, new JewelsInStores().numJewelsInStones1("aA", "aAAbbbb"));
    	Assert.assertEquals(0, new JewelsInStores().numJewelsInStones1("z", "ZZ"));
    	
    	System.out.println(new JewelsInStores().numJewelsInStones2("aA", "aAAbbbb"));
    	System.out.println(new JewelsInStores().numJewelsInStones2("z", "ZZ"));
    	Assert.assertEquals(3, new JewelsInStores().numJewelsInStones2("aA", "aAAbbbb"));
    	Assert.assertEquals(0, new JewelsInStores().numJewelsInStones2("z", "ZZ"));
    }
    
  @Test
    public void testnumJewelsInStonesLoop() {
    	JewelsInStores clz = new JewelsInStores();
    	
    	long start = System.currentTimeMillis();
    	for(int i = 0; i<10000000;i++) {
    		clz.numJewelsInStones3("aA", "aAAbbbb");
    	}
    	long end = System.currentTimeMillis();
    	System.out.println("Time Taken: " + (end - start));
    }
}
