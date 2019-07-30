
public class ControlFlowsAndLoopsExamples
{
	public static void main(String args[])
	{
		// IF-THEN-ELSE example
		int time = 22;
		if (time < 10)
		{
			System.out.println("Good morning.");
		}	else if (time < 20) 
		{
			System.out.println("Good day.");
		} else 
		{
			System.out.println("Good evening.");
		}
		
		// WHILE Loop
		int i=5;
		while (i<10)
		{
			System.out.println(i);
			i++;
		}
		
	    // "BREAK" example
	    for (int j = 0; j < 10; j++) 
	    {
	    	  if (j == 4)
	    	  {
	    	    break;
	    	  }
	    	  System.out.println(j);
	    }
	    
	    // "CONTINUE" example
	    // The continue statement breaks one iteration (in the loop),
	    // if a specified condition occurs, and continues with the 
	    // next iteration in the loop
	    for (int k = 0; k < 10; k++)
	    {
	    	  if (k == 4) {
	    	    continue; // "4" will not be printed
	    	  }
	    	  System.out.println(k);
	    }
	    
	    // BOOLEAN
	    boolean isJavaFun = true;
	    boolean isFishTasty = false;
	    System.out.println(isJavaFun);     // Outputs true
	    System.out.println(isFishTasty);   // Outputs false
	    
	} // end of main class
}


