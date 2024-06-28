
public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// If else conditions
		
		int[] arr2 = {1,9,3,4,5,100};
		
		//check if array has multiple of 2 
		for(int i=0; i<arr2.length; i++) {
			
			if(arr2[i]%2 == 0) {
				System.out.println(arr2[i]);
				break;
			}
			else {
				System.out.println(arr2[i]+ " is not a multiple of 2");
			}
		}

	}

}
