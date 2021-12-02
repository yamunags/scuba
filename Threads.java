package com.scuba.testng;


	

	class You extends Thread
	{
		public void run()
		{
			for (int i=1; i<=5; i++)
			{
				System.out.println("You");
				try
				{
					Thread.sleep(1000);
				}
				catch (Exception e)
				{

				}
			}
		}
	}

	class Me extends Thread
	{
		public void run()
		{
			for (int i=1; i<=5; i++)
			{
				System.out.println("Me");
				try
				{
					Thread.sleep(1000);
				}
				catch (Exception e)
				{

				}
			}
		}
	}

	public class Threads {
		public static void main(String[] args)
		{
			You obj1 = new You();
			Me obj2 = new Me();
			obj1.start();
			obj2.start();
		}

	}
