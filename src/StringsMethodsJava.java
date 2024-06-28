
public class StringsMethodsJava {

	public static void main(String[] args) {
		// Declare String and String methods
		//string is an object that represents sequence of characters!! 
		
		//declare1 - String literal
		String s = "Shubhada Dange";
		String s1 = "Shubhada Dange";
		
		//declare2 - String object with memory using 'new'
		String a = new String("World");
		String b = new String("World");
		
		String ss = "Shubhada Krishna Dange";
		String [] SplittedString = ss.split("Krishna");
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1]);
		System.out.println(SplittedString[1].trim());
		for(int i=0; i<ss.length(); i++) {
			System.out.println(ss.charAt(i));
		}
		
		//Reverse the string
		for(int i=ss.length()-1; i>=0; i--) {
			System.out.println(ss.charAt(i));
		}
	}

}
