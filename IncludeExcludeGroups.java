package com.scuba.testng;

import org.testng.annotations.Test;

public class IncludeExcludeGroups
{
	@Test(groups={"smoketesting"})
	public void Test1()
	{
		  System.out.println("Test1");
		   
	  }
	 @Test(groups= {"sanitytesting"})
	  public void Test2()
	{
		  System.out.println("Test2");
	}
	
	
}
