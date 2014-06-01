package org.hnm736.interviewPrograms;

public class ReverseNum2 {
	
	public static int reverse(int valueToReverse){
		int temporaryValue = 0;
		
		while (valueToReverse != 0){
			temporaryValue *=10;
			temporaryValue += valueToReverse%10;
			valueToReverse /=10;
		}
		return temporaryValue;
	}
	
	public static void main(String [] args)	{
		System.out.println(reverse(192));
	}
}
