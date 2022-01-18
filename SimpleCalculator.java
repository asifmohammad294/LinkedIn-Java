
// Challenge 1
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first numeric value");
		String input1 = sc.nextLine();
		double d1 = Double.parseDouble(input1);
		
		System.out.println("Enter second numeric value");
		String input2 = sc.nextLine();
		double d2 = Double.parseDouble(input2);
		
		double result = d1 + d2;
		System.out.println("The Result is: "+ result);

	}
}
