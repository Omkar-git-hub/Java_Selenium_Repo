package Inheritance_AccessMod_etc;


// Class
class parent
{	
	void L_Name()
	{
		System.out.println("Nikam");
	}
}

// sub class 1
class C1 extends parent
{
	void c1_name()
	{
		String c1 = "Ganesh";
	}
}

// sub class 2
class C2 extends parent
{
	void c2_name()
	{
		String c2 = "Ashok";
	}
}


public class Hierarchical_Inh 
{
	public static void main(String[] args)
	{
		// creating object
		C1 obj1 = new C1();
		C2 obj2 = new C2();
		
		obj1.L_Name();
		obj2.L_Name();
	}

}
