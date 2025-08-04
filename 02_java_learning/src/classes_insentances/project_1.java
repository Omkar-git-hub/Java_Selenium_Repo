package classes_insentances;

public class project_1 {
	
	public static void main(String[] args)
	{
		OuterClass_project_1 OuterClassOBJ = new OuterClass_project_1();
		OuterClass_project_1.InnerClass InnerClassOBJ = OuterClassOBJ.new InnerClass();
		
		InnerClassOBJ.Inner_class_method_Set();
		InnerClassOBJ.Inner_class_method_Get();
		
	}

}
