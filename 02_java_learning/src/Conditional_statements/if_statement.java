package Conditional_statements;
import java.util.Scanner;

public class if_statement 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int num = sc.nextInt();

        // If Statement
        if (num > 0) {
            System.out.println("Number is positive");
        }
	}
	

}
