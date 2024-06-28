
public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		System.out.println("num: " + num );
		String website = "Shubhada Dange";
		char letter = 'j';
		double dec = 09.0;
		float hen = 0.0f;
		boolean card = true;
		
		System.out.println("website: " + website );
		System.out.println("letter: " + letter );
		System.out.println("dec: " + dec );
		System.out.println("hen: " + hen );
		System.out.println("card: " + card );
		
		//Arrays in Java:
		int[] arr = new int[5];
		arr[0] = 9;
		arr[1] = 6;
		arr[2] = 5;
		arr[3] = 1;
		arr[4] = 8;
		
		int[] arr2 = {1,2,3,4,5};
		System.out.println(arr2[3]);
		System.out.println("**********");
		
		//for loop
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		String[] numbers = {"one", "two", "three"};
		
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//Enhanced for loop syntax
		for(String s: numbers) {
			System.out.println(s);
		}
		
		System.out.println("VVVVVVVVV");
		for(int s: arr) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
