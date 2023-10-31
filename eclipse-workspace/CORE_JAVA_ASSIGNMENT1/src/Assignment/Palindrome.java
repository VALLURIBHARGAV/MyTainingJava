package Assignment;

import java.util.*;

public class Palindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		if (number<1000 || number>9999) {
			System.out.println("Please enter a valid 4-digit number.");
			return;
		}
		int reversedNumber = 0;
		int originalNumber = number;
		while (number != 0) {
			int digit = number%10;
			reversedNumber = reversedNumber*10 + digit;
			number /= 10;
		}

		if (originalNumber == reversedNumber) {
			System.out.println(originalNumber + " Number is a palindrome.");
		} else {
			System.out.println(originalNumber + " Number is not a palindrome.");
		}
		scanner.close();
	}

}
