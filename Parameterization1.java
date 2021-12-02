package com.scuba.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization1 
{

	@Test  
	@Parameters("selenium")  
	public void c(String s)  
	{  
	System.out.println("parameter1=:");  
	System.out.println(s);  
	}  
	@Test  
	@Parameters("maven")  
	public void orange(String m)  
	{  
	System.out.println(m);  
	}  
	}  

