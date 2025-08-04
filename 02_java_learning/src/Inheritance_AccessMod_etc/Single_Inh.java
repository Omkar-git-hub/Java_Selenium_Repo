package Inheritance_AccessMod_etc;

// Parent Class
class Animal
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
	
	void move()
	{
		System.out.println("Animal is Moving");
	}
}

// Child Class
class Dog extends Animal
{
	void swim()
	{
		System.out.println("Dog is Swiming");
	}
	
	void play()
	{
		System.out.println("Dog is playing");
	}
}

// Main Class
public class Single_Inh 
{
	public static void main(String[] args)
	{
		Dog D = new Dog();
		
		// Child Class Access Methods of Parent Class
		D.eat();
		D.move();
		D.swim();
		D.play();
	}

}
