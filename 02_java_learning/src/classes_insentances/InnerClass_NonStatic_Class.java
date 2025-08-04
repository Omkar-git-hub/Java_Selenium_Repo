package classes_insentances;

// outer class
public class InnerClass_NonStatic_Class // outer class
{
		// Inner Class
		class Inner_Class
		{
			void Display()
			{
				System.out.println("Display form Inner Class");
			}
		}
	
	public static void main(String[] args)
	{
		// Create instance of outer class
		InnerClass_NonStatic_Class OuterClassObj = new InnerClass_NonStatic_Class();
		
		
		// Create instance of outer class 
		InnerClass_NonStatic_Class.Inner_Class InnerClassObj = OuterClassObj.new Inner_Class();
		InnerClassObj.Display();
		
		
		
	}

}
