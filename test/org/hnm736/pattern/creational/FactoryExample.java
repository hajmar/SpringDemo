package org.hnm736.pattern.creational;

import java.util.Scanner;

public class FactoryExample {
	public static void main(String[] args) {
		System.out.println("START");
		Release release;
		// Scanner scanner = new Scanner(System.in);
		String providedReleaseName = new Scanner(System.in).nextLine();
		System.out.println(providedReleaseName);
		
		if ("BPR2014".equalsIgnoreCase(providedReleaseName))	{
			release = new BPR2014();
		} else if ( "BPR2013".equalsIgnoreCase(providedReleaseName) )	{
			release = new BPR2013();
		} else	{
			release = new NullRelease();
		}
		
		release.showMembers();
		
	}
}

interface Release	{
	String getVersion();
	void showMembers();
}

class BPR2014 implements Release	{
	final static String RELEASE_NAME ="BPR2014";
	final static String REL_NAME = BPR2014.class.getName();
	
	@Override
	public String getVersion() {
		return RELEASE_NAME;
	}
	
	@Override
	public void showMembers() {
		System.out.println("BPR2014 show members");
	}
}

class BPR2013 implements Release	{
	final static String RELEASE_NAME ="BPR2013";
	final static String REL_NAME = BPR2013.class.getCanonicalName();
	
	@Override
	public String getVersion() {
		return RELEASE_NAME;
	}
	
	@Override
	public void showMembers() {
		System.out.println("BPR2013 all members");
	}
}

class NullRelease	implements Release	{
	@Override
	public String getVersion() {
		return "NULL";
	}
	
	@Override
	public void showMembers() {
		System.out.println("Nothing to show");
	}
}