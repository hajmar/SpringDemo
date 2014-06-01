package org.hnm736.examples;

public class MiddleIndex {
	public static void main(String [] args){
		//Find middle index of array
		System.out.println("Start main function");
		
	}
	
	public Integer getIndex(int [] intArray){
		int leftSum = 0;
		int rightSum = 0;
		int allSum = 0;
		
		for ( int i :intArray){
			allSum +=i;
		}
		
		rightSum = allSum;
		
		for(int i=0 ; i<intArray.length; i++)	{
			leftSum += intArray[i];
			rightSum -= intArray[i];
			
			if (leftSum == rightSum){
				return i;
			}
		}
		
		return null;
	}
	
	
}
