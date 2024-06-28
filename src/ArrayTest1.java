
public class ArrayTest1 {

	public static void main(String[] args) {
		// 1. Create an Array
		int[] numbers = {5,3,90,32,12};
		// 2. Access and Print
	    System.out.println(numbers[0]);
	    System.out.println(numbers[numbers.length-1]);
	    // 3. Reverse Order
        System.out.println("Elements in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
   	
	    }
        
     // 4. Bonus: Element Count
        System.out.println("Total elements in the array: " + numbers.length);

	}

}
