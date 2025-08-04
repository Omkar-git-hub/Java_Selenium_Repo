package Inheritance_AccessMod_etc;

class Display implements printable, showable
{
	public void print()
	{
		System.out.println("Printing...");
	}
	
	public void show()
	{
		System.out.println("Showing...");
	}
}

public class Multiple_Inh_Using_Interfaces 
{
	public static void main(String[] args)
	{
		Display D = new Display();
		
		D.print();
		D.show();
	}

}
