
class Example {
    static int staticVar = 10;  // Static variable
    int nonStaticVar = 20;  // Non-static variable

    static void staticMethod() {  // Static method
        System.out.println("Static Method: " + staticVar);
        //System.out.println(nonStaticVar);  ❌ Cannot access non-static directly
    }

    void nonStaticMethod() {  // Non-static method
        System.out.println("Non-static Method: " + nonStaticVar);
        System.out.println("Accessing static inside non-static: " + staticVar); // ✅ Allowed
    }
}

public class Static_vs_NonStatic_Methods 
{
	public static void main(String[] args) {
        // Calling static method (No object needed)
        Example.staticMethod();

        // Creating object to call non-static method
        Example obj = new Example();
        obj.nonStaticMethod();
    }

}
