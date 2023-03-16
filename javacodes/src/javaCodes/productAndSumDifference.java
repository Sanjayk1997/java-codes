package javaCodes;

import java.util.Scanner;


public class productAndSumDifference {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("Please enter the number:");
		String line = input.nextLine();
		input.close();
		
		int inputVal = Integer.parseInt(line);
		int differenceVal = subtractProductAndSum(inputVal);
		
		System.out.println("The difference between the product and sum is " + differenceVal);
	}
	
    public static int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
      
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        return product - sum;
    }

}
