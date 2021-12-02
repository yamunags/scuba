package com.scuba.testng;

import org.testng.annotations.Test;

public class Testngexample 
{
  @Test(priority=4,description="run first")
  public void firstprogram1()
{
	  System.out.println("program 1");
	   
  }
  @Test(priority=1,description="run second")
  public void firstprogram2()
{
	  System.out.println("program 2");
}
  @Test(priority=5,description="run third")
  public void firstprogram3()
{
	  System.out.println("program 3");
}
  @Test(priority=2,description="run fourth")
  public void firstprogram4()
{
	  System.out.println("program 4");
}
  @Test//(priority=3,description="run five")
  public void firstprogram5()
{
	  System.out.println("program 5");
}
  
}

