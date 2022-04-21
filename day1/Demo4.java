package p1;
import java.util.*;
import java.io.*;
import java.sql.*;
class P extends Thread
{
		public void run()
		{
			try
			{
				for(int i =0;i<=10;i++)
				{
					System.out.println("I"+i);
					Thread.sleep(1000);
				
				}
			}
			catch(Exception e)
			{
			}
		}
}
class B extends Thread
{
		public void run()
		{
			try
			{
				for(int j =0;j<=10;j++)
				{
					System.out.println("    J"+j);
					Thread.sleep(1000);
				
				}
			}
			catch (Exception e)
			{
				
			}
		}
}
public class Demo4 
{
	public static void main(String[] args)
	{
		 P p = new P();
		B b = new B();
		p.start();
		b.start();	
		
	}
}
