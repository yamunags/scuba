package com.scuba.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization
{

	@Test  
	@Parameters("java")  
	public void mango(String j)  
	{  
	System.out.println("paramter=:  ");  
	System.out.println(j);  
	}  
	@Test  
	@Parameters("testng ")  
	public void orange(String t)  
	{  
	System.out.println(t);  
	}  
	}  

