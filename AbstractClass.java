package com.java;

	abstract class scuba{  
		abstract void java();  
		}  
	
		class scuba1  extends scuba{  
		void java(){System.out.println("scuba program");}  
		}  
		class scuba11 extends scuba{  
		void java(){System.out.println("rookie program");}  
		}  
		
		public class AbstractClass 
		{

		public static void main(String args[]){  
		scuba s=new scuba1();
		s.java();  
		}  
		}  

