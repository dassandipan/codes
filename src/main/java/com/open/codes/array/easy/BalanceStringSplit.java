package com.open.codes.array.easy;

import org.junit.Test;

import org.junit.Assert;
/*
  		
	
 */
public class BalanceStringSplit {
	public int balancedStringSplit(String s) {
        int balanceDiff = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
			if(c=='L') {
				balanceDiff++;
			} else {
				balanceDiff--;
			}
			
			if(balanceDiff == 0) {
				count++;
			}
		}
        return count;
    }
	
	public int balancedStringSplit1(String s) {
		int res = 0, cnt = 0;
	    for (int i = 0; i < s.length(); ++i) {
	        cnt += s.charAt(i) == 'L' ? 1 : -1;
	        if (cnt == 0) ++res;
	    }
	    return res;   
    }
    
    @Test
    public void testBalancedStringSplit() {
    	System.out.println(new BalanceStringSplit().balancedStringSplit("RLRRLLRLRL"));
    	System.out.println(new BalanceStringSplit().balancedStringSplit("RLLLLRRRLR"));
    	System.out.println(new BalanceStringSplit().balancedStringSplit("LLLLRRRR"));
    	System.out.println(new BalanceStringSplit().balancedStringSplit("RLRRRLLRLL"));
    	Assert.assertEquals(4, new BalanceStringSplit().balancedStringSplit("RLRRLLRLRL"));
    	Assert.assertEquals(3, new BalanceStringSplit().balancedStringSplit("RLLLLRRRLR"));
    	Assert.assertEquals(1, new BalanceStringSplit().balancedStringSplit("LLLLRRRR"));
    	Assert.assertEquals(2, new BalanceStringSplit().balancedStringSplit("RLRRRLLRLL"));
    }
    
    @Test
    public void testBalancedStringSplitLoop() {
    	BalanceStringSplit clz = new BalanceStringSplit();
    	
    	long start = System.currentTimeMillis();
    	for(int i = 0; i<10000000;i++) {
    		clz.balancedStringSplit1("RLRRLLRLRL");
    	}
    	long end = System.currentTimeMillis();
    	System.out.println("Time Taken: " + (end - start));
    }
    
}
