
class ExceptionExample
{
	 public static void main(String args[])
	 {
	  try 
	  	 {
		   int d = 0;
		   int n = 20;
		   int fraction = n / d;
//		   int g[] = { 1 };
//		   g[20] = 100;
	  	 }
	  	 // With below commented code, it will give compile error
	  	 /*catch(Exception e){
	  		System.out.println("In the catch clock due to Exception = "+e);
	  	 }*/
		  catch (ArithmeticException e) 
		  {
			  System.out.println("In the catch clock due to Exception = " + e);
		  } catch (ArrayIndexOutOfBoundsException e) 
		  {
			  System.out.println("In the catch clock due to Exception = " + e);
		  }
		  System.out.println("End Of Main");
		 }
}

//Out Put:
//	In the catch clock due to Exception = java.lang.ArithmeticException: / by zero
//	End Of Main
	