package org.hnm736.interviewPrograms;

import org.mockito.ReturnValues;

public class ReverseNum {
	
	public int reverse(int number){
		int reversValue = 0;
		String reverseStr = "";
		
		while( number != 0)	{
			reverseStr += number%10;
			number /= 10;
		}
		
		reversValue = Integer.valueOf(reverseStr);
		return reversValue;
	}
	public static void main(String[] args) {
		int test = 102;
		
		ReverseNum num = new ReverseNum();
		
		System.out.println(num.reverse(test));
	}
}
