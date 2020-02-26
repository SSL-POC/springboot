package com.erp.util;

public class AdditionOfString {

	public int sumOfDigits(String stng) 
	{
	  int l = stng.length();
	  int sum = 0;
	  for (int i = 0; i < l; i++) 
	  {
	    if (Character.isDigit(stng.charAt(i))) 
		{
	      String tmp = stng.substring(i,i+1);
	      sum += Integer.parseInt(tmp);
	    }
	  }
	  return sum;
	}
	
}