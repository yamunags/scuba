package com.java;
	 
	class one{
	    public void scuba()
	    {
	        System.out.println("scuba");
	    }
	}
	 
	class two extends one{
	    public void print_for() 
	    { 
	    	System.out.println("scuba");
	    	}
	}
	
	public class Inheritance  {
	    public static void main(String[] args)
	    {
	        two g = new two();
	        g.print_for();
	        g.print_for();
	        g.print_for();
	    }
	}

