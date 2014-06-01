package org.hnm736.interviewPrograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DuplicateObject {
	public static void main(String [] args){
		List testedList = new LinkedList<>();
		
		testedList.add("34343");
		testedList.add(4);
		testedList.add("4");
		testedList.add('4');
		
		DuplicateObject dp = new DuplicateObject();
		
		Object result = dp.getDuplicate(testedList);
		
		System.out.println(result);
	}
	
	public Object getDuplicate(List<Object> values){
		List<Object> internalList = new ArrayList<>();
		
		for (Object item : values) {
			if ( internalList.contains(item)){
				return item;
			}
			internalList.add(item);
		}
		return null;
	}
	
	
}
