package com.open.codes.array.easy;

import org.junit.Test;

import org.junit.Assert;
/*
   Given a valid (IPv4) IP address, return a defanged version of that IP address.
   A defanged IP address replaces every period "." with "[.]".
   	Example 1:
	=========
	Input: address = "1.1.1.1"
	Output: "1[.]1[.]1[.]1"
	
	Example 2:
	=========
	Input: address = "255.100.50.0"
	Output: "255[.]100[.]50[.]0"
	
	Constraints:
	===========
	The given address is a valid IPv4 address.
	
 */
public class DefangIPAddress {
    public String defangIPaddr1(String address) {
    	return address.replace(".", "[.]");
    	// Time Avg = 4087 ms
    }
    
    public String defangIPaddr2(String address) {
    	return address.replaceAll("\\.", "[.]");
    	// Time Avg = 3950 ms
    }
    
    public String defangIPaddr3(String address) {
    	StringBuilder sb = new StringBuilder();
    	
    	for (char c : address.toCharArray()) {
			if(c == '.') {
				sb.append("[.]");
			} else {
				sb.append(c);
			}
		}
    	return sb.toString();
    	// Time Avg = 867 ms
    }
    
    @Test
    public void testDefangIPAddress() {
    	System.out.println(new DefangIPAddress().defangIPaddr1("127.0.0.1"));
    	System.out.println(new DefangIPAddress().defangIPaddr2("127.0.0.1"));
    	System.out.println(new DefangIPAddress().defangIPaddr3("127.0.0.1"));
    	Assert.assertEquals("127[.]0[.]0[.]1", new DefangIPAddress().defangIPaddr1("127.0.0.1"));
    	Assert.assertEquals("127[.]0[.]0[.]1", new DefangIPAddress().defangIPaddr2("127.0.0.1"));
    	Assert.assertEquals("127[.]0[.]0[.]1", new DefangIPAddress().defangIPaddr3("127.0.0.1"));
    }
    
    //@Test
    public void testDefangIPAddressLoop() {
    	DefangIPAddress clz = new DefangIPAddress();
    	
    	long start = System.currentTimeMillis();
    	for(int i = 0; i<10000000;i++) {
    		clz.defangIPaddr3("127.0.0.1");
    	}
    	long end = System.currentTimeMillis();
    	System.out.println("Time Taken: " + (end - start));
    }
}
