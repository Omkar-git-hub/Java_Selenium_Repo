package basicDay1;

public class classes_in_java  
{
	String globalName;
	
	classes_in_java() // Constructor
	{
		this.globalName = "Omkar";
	}
	
	private void myCustomMethod(String myArgs)
	{
		globalName = "Nikam";
		System.out.println(myArgs);
		
		System.out.println("Global Name : " + globalName);
	}
	
	
	public static void main(String[] args) // main class
	{
		// Instance of class in java
		classes_in_java obj = new classes_in_java();
		
		obj.myCustomMethod("ADCET");
		
	}
	
}



