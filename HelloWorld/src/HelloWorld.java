

class testClass
{
	int a;
	String str;
	
	public String getValues()
	{
		return ("Value of a= "+ a + " ,Value of Str = "+ str);
	}
	
}

public class HelloWorld
{
	public static void main(String[] args) 
	{
		System.out.println("********** Java Class **********");
		
		testClass cls = new testClass();
		cls.a=20;
		cls.str = "Java class";
		
		System.out.println(cls.getValues());
		
		System.out.println("********** Array **********");
		int intArray[] = {1, 2, 3, 4};
		System.out.println("Length of intArray="+ intArray.length);
		System.out.println("2nd elment of intArray="+ intArray[1]);
		
	}
}

//Out Put:-
//********** Java Class **********
//Value of a= 20 ,Value of Str = Java class
//********** Array **********
//Length of intArray=4
//2nd elment of intArray=2