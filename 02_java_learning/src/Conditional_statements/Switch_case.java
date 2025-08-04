package Conditional_statements;
import java.util.*;

public class Switch_case 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Digit : ");
		int x = sc.nextInt();
		
        switch (x) 
        {
            case 1:
                System.out.println("Choice is 1");
                break;
            case 2:
                System.out.println("Choice is 2");
                break;
            case 3:
                System.out.println("Choice is 3");
                break;
            default:
                System.out.println("Invalid choice");
        }
	}

}
