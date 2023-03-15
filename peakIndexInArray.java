package javacodes;


import java.util.Scanner;
import java.util.stream.Stream;

public class peakIndexInArray {
	
	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		System.out.println("Please array seperated by commas:");
		String line = input.nextLine();
		input.close();
		
		int[] inputArray = Stream.of(line.split(",")).mapToInt(Integer::parseInt).toArray();
		
		int maxAt = 0;

		for (int i = 0; i < inputArray.length; i++) {
		    maxAt = inputArray[i] > inputArray[maxAt] ? i : maxAt;
		}
			
		System.out.println("The peak value is: " + inputArray[maxAt]);
		System.out.println("Its the "+(maxAt + 1)+"th element");
		
	}

}
