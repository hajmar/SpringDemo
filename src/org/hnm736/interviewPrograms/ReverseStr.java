package org.hnm736.interviewPrograms;

public class ReverseStr {
	
	public String reverse(String stringToReverse)	{
		String returnValue = "";
		
		if (stringToReverse.length() == 1)	{
			return stringToReverse;
		} else 	{
			returnValue += stringToReverse.charAt(stringToReverse.length() -1) +
					reverse(stringToReverse.substring(0,stringToReverse.length() -1));
			return returnValue;
		}
		
		
	}
}
