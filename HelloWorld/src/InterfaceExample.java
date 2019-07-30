// Java Interface example
interface Pet
{
	public void test();
	
}

class InterfaceExample implements Pet
{
	 public void test()
	 {
	    System.out.println("Interface Method Implemented");
	 }
	 
	 public static void main(String args[])
	 {
	    Pet p = new InterfaceExample();
	    p.test();
	 }
}