package classes_insentances;


// Outer Class
public class Stativ_nested_Classes {
	
	// Inner Class
	public static class Inner_Class // used static keyword for making this class static
	{
		void Display()
		{
			System.out.println("Display message form Inner Class");
		}
	}
	
	public static void main(String[] args)
	{
		Stativ_nested_Classes.Inner_Class nested_Obj = new Stativ_nested_Classes.Inner_Class();
		nested_Obj.Display();
	}
	

}
