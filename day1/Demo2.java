package p1;
import java.util.*;
import java.io.*;

public class Demo2
{
	public static void main(String[] args)
	{
		m1();
	}
	public static void m1()
	{
		m2();
	}
	public static void m2()
	{
		try
		{
			File f = new File("abc.txt");
			FileReader fr = new FileReader(f);
		}
		catch(FileNotFoundException fnf)
		{
			System.out.println("File not found");
		}
	}
}
