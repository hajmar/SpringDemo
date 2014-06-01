package org.hnm736.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;

public class DuplicationNumber {
	
	public List<Integer> findDuplicateNumber(List<Integer> numbers)	{
		Set<Integer> duplicate = new HashSet<>(10);
		
		for ( Integer i :numbers){
			if ( duplicate.contains(i) )	{
				System.out.println("Find duplication :" + i);
			}
			
			duplicate.add(i);
		}
		
		return numbers;
	}

	private int getSum(List<Integer> numbers) {
		int sum = 0;
		for(int num: numbers)	{
			sum += num;
		}
		return sum;
	}

	
	public static int findMiddleIndex(int []numbers) throws Exception	{
		return 0;
	}
	
	
	public static void main(String []args)	{
		System.out.println("Start");
		int [] intArray = {1,2,3,4,5,2,3,7};
		
		DuplicationNumber d2 = new DuplicationNumber();
		DuplicationNumber.InternalDuplicate id1 = new InternalDuplicate();
		
		//InternalDuplicate i = new DuplicationNumber()new InternalDuplicate();
		
	}

	private static class InternalDuplicate {
		static void findDuplicate(int [] arrayToSearch){
			Set<Integer> integerStorageSet = new LinkedHashSet<>();
			for ( int i: arrayToSearch)	{
				if ( integerStorageSet.contains(i))	{
					System.out.println("This is duplicate value: " + i);
				}
				integerStorageSet.add(i);
			}
		}
		
	}
	
	protected class InternalProtected	{
		public void findDuplicate(Collection<Integer> collection)	{
			Set<Integer> internalSet = new TreeSet<>();
			for ( int i : collection )	{
				if ( internalSet.contains(i))	{
					System.out.println("Duplicate :" + i);
				}
				internalSet.add(i);
			}
			
		}
		
		private void foo()	{
			System.out.println("Foo method");
		}
	}
}

