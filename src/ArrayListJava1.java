import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListJava1 {

	public static void main(String[] args) {
		// ArrayList is a class in Java
		//create object of a class --> object.method
		ArrayList<String> a = new ArrayList<String>();
		a.add("cat");
		a.add("dog");
		a.add("rabbit");
		a.remove(2);
		a.add("swan");
		System.out.println(a.get(1));
		System.out.println("************");
		//iteration in ArrayList
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("_________");
		//Enhanced ArrayList
		for( String val: a) {
			System.out.println(val);
		}
		
		//Item is present in the ArrayList or not ??
		System.out.println(a.contains("swan"));
		
		
		//To convert Array to ArrayList
		String[] numbers = {"one", "two", "three"};
		List<String> numbersArrayList = Arrays.asList(numbers);
		System.out.println(numbersArrayList.contains("three"));
	}

}
