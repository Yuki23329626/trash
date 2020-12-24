
import java.util.Scanner;

public class RationalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		RationalNumber number0 = new RationalNumber();
		RationalNumber number1 = new RationalNumber(1, 3);
		RationalNumber number2 = new RationalNumber(6, 9);
		RationalNumber number3 = new RationalNumber(66, 42);
		RationalNumber number4 = new RationalNumber(-21, 57);
		RationalNumber number5 = new RationalNumber(40, -16);

		// Initialized rational numbers
		System.out.println("\nInitialized rational numbers:");
		System.out.println("number0 = " + number0);
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		System.out.println("number3 = " + number3);
		System.out.println("number4 = " + number4);
		System.out.println("number5 = " + number5);

		// Arithmetic methods
		System.out.println("\nArithmetic methods:");
		System.out.println("number0 + numbaer1 = " + RationalNumber.add(number0, number1));
		System.out.println("number2 + numbaer3 = " + RationalNumber.add(number2, number3));
		System.out.println("number4 - numbaer5 = " + RationalNumber.subtract(number4, number5));
		System.out.println("number1 - numbaer2 = " + RationalNumber.subtract(number1, number2));
		System.out.println("number3 * numbaer4 = " + RationalNumber.multiply(number3, number4));
		System.out.println("number5 * numbaer0 = " + RationalNumber.multiply(number5, number0));
		System.out.println("number1 / numbaer3 = " + RationalNumber.divide(number1, number3));
		System.out.println("number2 / numbaer4 = " + RationalNumber.divide(number2, number4));

		// toString and toFloat methods
		System.out.println("\ntoString and toFloat methods:");
		System.out.println("String of number0: " + number0.toString());
		System.out.println("String of number1: " + number1.toString());
		System.out.println("String of number2: " + number2.toString());
		System.out.println("Floating point of number3(2 digits of precision): " + number3.toFlaot(2));
		System.out.println("Floating point of number4(3 digits of precision): " + number4.toFlaot(3));
		System.out.println("Floating point of number5(6 digits of precision): " + number5.toFlaot(6));

		input.close();
	}

}
