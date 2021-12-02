package com.java;


	import java.util.*;  
	public class Arraylist
	{

	   public static void main(String args[]){  
	      ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("yamuna");
	      alist.add("gayathri");
	      alist.add("sam");
	      alist.add("scuba");
	      alist.add("maveric");
	      alist.add("rookie");
	  
	    
	      System.out.println(alist);
	  
	      
	      alist.add(3, "yamuna");
	  
	    
	      System.out.println(alist);
	   }  
	}

