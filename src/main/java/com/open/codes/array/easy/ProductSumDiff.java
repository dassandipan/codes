package com.open.codes.array.easy;

import org.junit.Test;

import org.junit.Assert;
/*
  Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 

Example 1:

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
	
 */
public class ProductSumDiff {
	public int subtractProductAndSum1(int n) {
        int product = 1 ;
        int sum = 0;
        
        while(n!=0) {
        	int digit = n%10;
        	product = product * digit;
        	sum = sum + digit;
        	n = n/10;
        }
        return product - sum;
    }
    
    @Test
    public void testSubtractProductAndSum() {
    	System.out.println(new ProductSumDiff().subtractProductAndSum1(234));
    	System.out.println(new ProductSumDiff().subtractProductAndSum1(4421));
    	System.out.println(new ProductSumDiff().subtractProductAndSum1(10));
    	Assert.assertEquals(15, new ProductSumDiff().subtractProductAndSum1(234));
    	Assert.assertEquals(21, new ProductSumDiff().subtractProductAndSum1(4421));
    	Assert.assertEquals(-1, new ProductSumDiff().subtractProductAndSum1(10));
    }
    
    @Test
    public void testSubtractProductAndSumLoop() {
    	ProductSumDiff clz = new ProductSumDiff();
    	
    	long start = System.currentTimeMillis();
    	for(int i = 0; i<10000000;i++) {
    		clz.subtractProductAndSum1(365465463);
    	}
    	long end = System.currentTimeMillis();
    	System.out.println("Time Taken: " + (end - start));
    }
}
