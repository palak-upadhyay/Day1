package p1;
import java.util.*;
import java.io.*;
import java.sql.*;
class A
{
	void abc() throws FileNotFoundException, SQLException, NullPointerException
	{
		for(int i=0;i<=20;i++)
		{
			if(i==15) throw new NullPointerException();
			//if(i==7) throw new ArrayIndexOutOfBoundsException();
			//if(i==10) throw new NumberFormatException();
			//if(i==12) throw new SQLException();
			//if(i==8) throw new FileNotFoundException();
			System.out.println("I :"+i);
		}
	}
}
public class Demo3
{
	public static void main(String[] args)
	{
		try
		{
			A a=new A();
			a.abc();
		}
		catch(NullPointerException np)
		{
			System.out.println("NullPointerException came");
		}
		catch(ArrayIndexOutOfBoundsException ap)
		{
			System.out.println("ArrayIndexOutOfBoundsException came");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("NumberFormatException came");
		}
		catch(SQLException sq)
		{
			System.out.println("SQLException came");
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("FileNotFoundException came");
		}
		finally
		{
			System.out.println("Thank You");
		}
	}
}
