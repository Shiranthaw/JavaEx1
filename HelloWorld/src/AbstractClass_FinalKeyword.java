abstract class Shape
{
	final int b = 20;
	
	public void display()
	{
		System.out.println("This is display method in abstract class");
	}
	
	abstract public void calculateArea();
}

public class AbstractClass_FinalKeyword extends Shape
{
	public static void main(String args[])
	{
		AbstractClass_FinalKeyword obj = new AbstractClass_FinalKeyword();
		obj.display();
		//obj.b=200; // Will throw an error!
	}
	  
	public void calculateArea(){}
}