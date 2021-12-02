package com.java;
	  
	
	interface In1
	{
	    
	    final int a = 10;
	    void display();
	}
	  
	
	class TestClass implements In1
	{
	    
	    public void display()
	    {
	        System.out.println("scuba");
	    }
	    public class Interface 
	    {

	  
	    public void main (String[] args)
	    {
	        TestClass t = new TestClass();
	        t.display();
	        System.out.println(a);
	    }
	}
}
