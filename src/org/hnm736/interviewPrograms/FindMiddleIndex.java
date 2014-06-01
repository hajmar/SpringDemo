package org.hnm736.interviewPrograms;

public class FindMiddleIndex {
	public static int getIndex (int [] number) throws Exception	{
		int endIndex = number.length -1;
		int startIndex = 0;
		int leftSum = 0;
		int rightSum = 0;
		
		while(true)	{
			if(leftSum > rightSum)	{
				rightSum += number[endIndex--];
			} else {
				leftSum += number[startIndex++];
			} 
			
			if (startIndex > endIndex){
				if(leftSum  == rightSum	)	{
					break;
				} else 	{
					throw new Exception("Please pass proper array to analyze");
				}
				
			}
		}
		
		return startIndex;
	}
	
	public static void main(String [] args) throws Exception{
		int [] arrayToTest = {1,2,0,0,0,3,3,2,1,0};
		System.out.println(getIndex(arrayToTest));
	}
}
