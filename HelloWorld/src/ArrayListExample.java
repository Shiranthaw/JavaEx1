import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		System.out.println("********** Array List Example **********");
		
		  //Creating a generic ArrayList
		  ArrayList arlTest = new ArrayList();
		  //Size of arrayList
		  System.out.println("Size of ArrayList at creation: " + arlTest.size());
		  //Lets add some elements to it
		  arlTest.add("D");
		  arlTest.add("U");
		  arlTest.add("K");
		  arlTest.add("E");

		  //Recheck the size after adding elements
		  System.out.println("Size of ArrayList after adding elements: " + arlTest.size());
		  
		  //Display all contents of ArrayList
		  System.out.println("List of all elements: " + arlTest);

		  //Remove some elements from the list
		  arlTest.remove("D");
		  System.out.println("See contents after removing one element: " + arlTest);

		  //Remove element by index
		  arlTest.remove(2);
		  System.out.println("See contents after removing element by index: " + arlTest);

		  //Check size after removing elements
		  System.out.println("Size of arrayList after removing elements: " + arlTest.size());
		  System.out.println("List of all elements after removing elements: " + arlTest);

		  //Check if the list contains "K"
		  System.out.println(arlTest.contains("K"));
	}
}

//Out Put:-
//********** Array List Example **********
//Size of ArrayList at creation: 0
//Size of ArrayList after adding elements: 4
//List of all elements: [D, U, K, E]
//See contents after removing one element: [U, K, E]
//See contents after removing element by index: [U, K]
//Size of arrayList after removing elements: 2
//List of all elements after removing elements: [U, K]
//true