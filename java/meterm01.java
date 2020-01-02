package meterm;

import java.util.Arrays;
import java.util.Random;

public class meterm01 {

	public static void main(String[] args) {
		
		//Initiate the array of integer with 15 elements		
				int[] numbers = new int[15];
				//Assign random number between -5 to 5
				for (int i = 0; i < numbers.length; i++) {
					numbers[i] = new Random().nextInt(11)-5;
				}
				//Output the array as string in the console
				System.out.println(Arrays.toString(numbers));
				
				//a. find the largest number in this array
				   int largest = numbers[0];
				   for( int i = -0; i<numbers.length; i++) {
					  if( largest <numbers[i]) {
						  System.out.println(numbers[i]);
					  }
				   }
				   
				//b. find the smallest number in this array
				   int smaller = numbers[0];
				   for( int i = 0; i<numbers.length; i++) {
					  if( smaller >numbers[i]) {
						  System.out.println(numbers[i]);
					  }
				   }
				   
				  // Display how many numbers greater than zero or even appears in this arrays
				   
				   int even = numbers[0];
				   for( int i = 0; i<numbers.length; i++) {
					  if( numbers[i] /2 == 0) {
						  
						  System.out.print(even);
					  }
				   } 
	}

}
