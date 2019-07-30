//The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,... 
//The next number is found by adding up the two numbers before it.

public class ex_FibonacciNumber {
	
	public static Integer fibonacci(Integer n) 
	{
		if (n == 1)
		{
		    return 1;
		} else if (n == 0) 
		{
		    return 0;
		} else 
		{
		    return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
	public static void main(String args[])
	{
		System.out.println(fibonacci(6));
	}
}
