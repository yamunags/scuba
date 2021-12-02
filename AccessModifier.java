package com.java;

	class A 
	{ 
	void display() 
	    { 
	        System.out.println("private access modifier"); 
	    } 
	} 
	  
	 class AccessModifier 
	{

 
	public static void main(String args[]) 
	    { 
	        A obj = new A(); 
	        // Trying to access private method
	        // of another class 
	        obj.display(); 
	    } 
	} 

