
public class StringExamples {

	public static void main(String[] args) {

		// String objects are immutable -  i.e once created the value cannot be altered.
		System.out.println("********** String Examples **********");

		String str1 = "hello";
		String str2 = "world!";
		System.out.println(str1 + " " + str2);
		
		String str = str1 + " " + str2;
		System.out.println("Length of String: " + str.length());
		
		System.out.println("Character at position 6: " + str.charAt(6));
		System.out.println("Index of character 'w': " + str.indexOf('w'));

		String compStr = "Hello";
		System.out.println("Compare To 'HELLO': " + compStr.compareTo("HELLO"));
		System.out.println("Compare To 'HELLO' - Case Ignored: " + compStr.compareToIgnoreCase("HELLO"));
		
		System.out.println("Contains sequence 'wor': " + str.contains("wor"));
		
		System.out.println("EndsWith character '!': " + str.endsWith("!"));
		
		System.out.println("Replace 'Hello' with 'My': " + str.replace("hello", "My"));
		System.out.println("Replace first 'l' with 'X': " + str.replaceFirst("l", "X"));
		String str3 = str.replaceAll("\\s", "");
		System.out.println("Removed all white spaces: " + str3);
		
		System.out.println("Convert to LowerCase: " + str.toLowerCase());
		System.out.println("Convert to UpperCase: " + str.toUpperCase());
		
		String intStr = "200";
		int iConv = Integer.parseInt(intStr);
		System.out.println("Converted string to integer with Integer.parseInt: " + iConv);
		int iValOf = Integer.valueOf(intStr);
		System.out.println("Converted string to integer with Integer.valueOf: " + iValOf);
	}

}

//Out put:-
//********** String Examples **********
//hello world!
//Length of String: 12
//Character at position 6: w
//Index of character 'w': 6
//Compare To 'HELLO': 32
//Compare To 'HELLO' - Case Ignored: 0
//Contains sequence 'wor': true
//EndsWith character '!': true
//Replace 'Hello' with 'My': My world!
//Replace first 'l' with 'X': heXlo world!
//Removed all white spaces: helloworld!
//Convert to LowerCase: hello world!
//Convert to UpperCase: HELLO WORLD!
//Converted string to integer with Integer.parseInt: 200
//Converted string to integer with Integer.valueOf: 200


