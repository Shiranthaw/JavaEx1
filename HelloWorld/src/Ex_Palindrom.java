// Palindrome
public class Ex_Palindrom
{
	public static void main(String args[])
	{
		String word = "abccba";
		boolean flag = true;
		
		int i1 = 0;
		int i2 = word.length() - 1;
		while (i2 > i1)
		{
		    if (word.charAt(i1) != word.charAt(i2))
		    {
		    	flag = false;
		    }
		    ++i1;
		    --i2;
		}

		System.out.println(flag);
	}
}
