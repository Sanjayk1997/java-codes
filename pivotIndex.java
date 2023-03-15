package javacodes;

import java.util.Scanner;
import java.util.stream.Stream;

public class pivotIndex {

	public static void main(String[] args) {

		Scanner input =  new Scanner(System.in);
		System.out.println("Please array seperated by commas:");
		String line = input.nextLine();
		input.close();
		
		int[] inputArray = Stream.of(line.split(",")).mapToInt(Integer::parseInt).toArray();
		int index = pivotIndexFinder(inputArray);
		System.out.println("The pivot index is " + index);

	}

	public static int pivotIndexFinder(int[] array) {
		
		int totalSum = 0;
        int leftSum = 0;
        
        // Traverse the elements and add them to store the totalSum...
        for (int ele : array)
            totalSum += ele;
       
        // Again traverse all the elements through the for loop and store the sum of i numbers from left to right...
        for (int i = 0; i < array.length; i++) {
        	// check if leftSum == totalSum - leftSum - array[i]...
            if (leftSum * 2 == totalSum - array[i])
                return i;    
            leftSum += array[i];
        }
        return -1; 
	}
}
