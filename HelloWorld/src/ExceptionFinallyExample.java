// "Finally" block is executed even though an exception is raised
class ExceptionFinallyExample {
	   public static void main(String args[]){
	    try{
	       int d = 1;
	       int n =20;
	       int fraction = n/d;
	    }
	  catch(ArithmeticException e){
	    System.out.println("In the catch clock due to Exception = "+e);
	  }
	  finally{
		System.out.println("Inside the finally block");
	  }
	}
	}

//Out Put:
//With d=1: Inside the finally block
//With d=0:
//	In the catch clock due to Exception = java.lang.ArithmeticException: / by zero
//	Inside the finally block
	