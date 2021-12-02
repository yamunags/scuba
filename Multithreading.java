package com.java;



	public class Multithreading 
	{
		
	       public static void main(String[] args) {
	        Thread guruThread1 = new Thread("test1");
	        Thread guruThread2 = new Thread("test2");
	        guruThread1.start();
	        guruThread2.start();
	        System.out.println("Thread names are following:");
	        System.out.println(guruThread1.getName());
	        System.out.println(guruThread2.getName());
	    }
	    public void run() {
	    }
	}

