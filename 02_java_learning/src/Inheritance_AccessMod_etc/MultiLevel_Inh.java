package Inheritance_AccessMod_etc;

class Gp
{
	String Gp = "Pralhad";
	void GP_name()
	{
		System.out.println("Grand Parent Name is : " + Gp);
	}
}

class P extends Gp
{
	String P = "Ganesh";
	void P_name()
	{
		System.out.println("Parent Name is : " + P);
	}
}

class C extends P
{
	String C = "Omkar";
	void C_name()
	{
		System.out.println("Child Name is : " + C);
	}
}

public class MultiLevel_Inh 
{
	public static void main(String[] args)
	{
		C obj = new C();
		
		obj.GP_name();
		obj.P_name();
		obj.C_name();
	}

}
