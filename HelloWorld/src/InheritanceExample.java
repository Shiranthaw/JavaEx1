// Inheritance & Super keyword
class Doctor
{
	String docStr = "Doctor String";
	void Doctor_Details()
	{
		 System.out.println("Doctor Details...");
	}
}

class Surgeon extends Doctor
{
	 void Surgeon_Details()
	 {
		 System.out.println("Surgen Detail...");
		 System.out.println("Parent class SUPER variable: " + super.docStr);
	 }
}

public class InheritanceExample
{
	 public static void main(String args[])
	 {
		  Surgeon s = new Surgeon();
		  s.Doctor_Details();
		  s.Surgeon_Details();
	 }
}
//Out Put:
//	Doctor Details...
//	Surgen Detail...
//	Parent class SUPER variable: Doctor String