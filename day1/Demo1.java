package p1;

import java.util.*;

public class Demo1 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			int n1 = sc.nextInt();
			int n2= sc.nextInt();
			System.out.println("Result is "+ (n1/n2));
		}
		catch(InputMismatchException b)
		{
			System.out.println("phir se dekh le ek baar");
		}
		catch(ArithmeticException b)
		{
			System.out.println("0 se divide ni hota bewakoof kahin ka.....");
		}
		
	}

}
