import java.util.HashMap;
import java.util.Map;

public class JavaHashMap
{
	public static void main(String[] args) 
	{
	    Map<String, String> objMap = new HashMap<String, String>();
	    objMap.put("Name", "Suzuki");
	    objMap.put("Power", "220");
	    objMap.put("Type", "2 wheeler");
	    objMap.put("Price", "85000");
	    System.out.println("Elements of the Map:" + objMap);
	    
	    // Remove an element
	    objMap.remove("Type");
	    System.out.println("Elements after removing key Type:" + objMap);	    
	}
}

//Out Put:-
//Elements of the Map:{Type=2 wheeler, Price=85000, Power=220, Name=Suzuki}
//Elements after removing key Type:{Price=85000, Power=220, Name=Suzuki}
