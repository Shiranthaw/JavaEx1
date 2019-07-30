
public class thisExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		class Account
		{
			int a;
			int b;

			 public void setData(int a ,int b)
			 {
				 this.a = a;
				 this.b = b;
			 }
			 public void showData()
			 {
				 System.out.println("Value of A ="+a);
				 System.out.println("Value of B ="+b);
			 }			 
		} // End of Class Account
		
	   Account obj = new Account();
	   obj.setData(2,3);
	   obj.showData();
	}
}
