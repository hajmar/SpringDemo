package org.hnm736.interviewPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i<30 ; i++)	{
			numbers.add(i);
		}
		
		//add one duplicate
		numbers.add(22);
		
		FindDuplicate dn = new FindDuplicate();
		
		System.out.println("Duplicate number :  "  + dn.duplicateNumber(numbers));
	}
	
	public int duplicateNumber(List<Integer> numbers)	{
		int highestNumber = numbers.size() -1;
		int total = getSum(numbers);
		int duplicate = total - (highestNumber*(highestNumber+1)/2);
		return duplicate;
	}

	public int getSum(List<Integer> numbers) {
		int sum = 0;
		
		for (Integer item : numbers) {
			sum+= item;
		}
		
		return sum;
	}
}
