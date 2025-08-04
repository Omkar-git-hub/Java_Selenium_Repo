package classes_insentances;

public class OuterClass_project_1 {
	
	String OuterClassVariable;
	
	 class InnerClass
	{
		public void Inner_class_method_Set()
		{
			OuterClassVariable = "Omkar";
		}
		
		public void Inner_class_method_Get()
		{
			System.out.println("The Value of OuterClassVariable : " + OuterClassVariable);
		}
	}

}
