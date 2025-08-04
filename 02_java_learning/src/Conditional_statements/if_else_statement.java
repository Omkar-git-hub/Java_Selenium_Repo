package Conditional_statements;
import java.util.*;

public class if_else_statement 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int x = sc.nextInt();
		
		if (x%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}
