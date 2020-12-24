
public class HugeIntegerDemo 
{
	public static void main(String[] args) 
	{
		HugeInteger number0 = new HugeInteger();
		HugeInteger number1 = new HugeInteger("0");
		HugeInteger number2 = new HugeInteger("123456789123456789");
		HugeInteger number3 = new HugeInteger("123456789123456789");
		HugeInteger number4 = new HugeInteger("-123456789123456789");
		HugeInteger number5 = new HugeInteger("200000000000000000");
		HugeInteger number6 = new HugeInteger("999999999999999999999");
		HugeInteger number7 = new HugeInteger("-400000000000000000");
		
		// Initialized huge integers
		System.out.println("\nInitialized huge integers:\n");
		System.out.println("number0 = " + number0);
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		System.out.println("number3 = " + number3);
		System.out.println("number4 = " + number4);
		System.out.println("number5 = " + number5);
		System.out.println("number6 = " + number6);
		System.out.println("number7 = " + number7);
		
		// Predicate methods
		System.out.println("\nPredicate methods:");
		System.out.println("\nEqual to:");
		System.out.printf("%s == %s: %s\n", number0, number1, number0.isEqualTo(number1) ? "true" : "false");
		System.out.printf("%s == %s: %s\n", number2, number3, number2.isEqualTo(number3) ? "true" : "false");
		System.out.printf("%s == %s: %s\n", number3, number4, number3.isEqualTo(number4) ? "true" : "false");
		
		System.out.println("\nGreater than:");
		System.out.printf("%s > %s: %s\n", number6, number2, number6.isGreaterThan(number2) ? "true" : "false");
		System.out.printf("%s > %s: %s\n", number2, number4, number2.isGreaterThan(number4) ? "true" : "false");
		System.out.printf("%s > %s: %s\n", number2, number3, number2.isGreaterThan(number3) ? "true" : "false");
		
		System.out.println("\nLess than:");
		System.out.printf("%s < %s: %s\n", number3, number4, number3.isLessThan(number4) ? "true" : "false");
		System.out.printf("%s < %s: %s\n", number5, number6, number5.isLessThan(number6) ? "true" : "false");
		System.out.printf("%s < %s: %s\n", number0, number1, number0.isLessThan(number1) ? "true" : "false");
		
		System.out.println("\nGreater than or equal to:");
		System.out.printf("%s >= %s: %s\n", number0, number1, number0.isGreaterThanOrEqualTo(number1) ? "true" : "false");
		System.out.printf("%s >= %s: %s\n", number5, number7, number5.isGreaterThanOrEqualTo(number7) ? "true" : "false");
		System.out.printf("%s >= %s: %s\n", number7, number6, number7.isGreaterThanOrEqualTo(number6) ? "true" : "false");
		
		System.out.println("\nLess than or equal to:");
		System.out.printf("%s <= %s: %s\n", number2, number3, number2.isLessThanOrEqualTo(number3) ? "true" : "false");
		System.out.printf("%s <= %s: %s\n", number6, number4, number6.isLessThanOrEqualTo(number4) ? "true" : "false");
		System.out.printf("%s <= %s: %s\n", number4, number6, number4.isLessThanOrEqualTo(number6) ? "true" : "false");
		
		System.out.println("\nIs zero:");
		System.out.printf("%s == zero: %s\n", number1, number1.isZero() ? "true" : "false");
		System.out.printf("%s == zero: %s\n", number3, number3.isZero() ? "true" : "false");
		System.out.printf("%s == zero: %s\n", number7, number7.isZero() ? "true" : "false");
		
		// Arithmetic methods
		System.out.println("\nArithmetic methods:");
		System.out.printf("%s + %s = %s\n",number0, number1, HugeInteger.add(number0, number1));
		System.out.printf("%s + %s = %s\n",number1, number2, HugeInteger.add(number1, number2));
		System.out.printf("%s + %s = %s\n",number3, number4, HugeInteger.add(number3, number4));
		
		System.out.printf("%s - %s = %s\n",number5, number6, HugeInteger.subtract(number5, number6));
		System.out.printf("%s - %s = %s\n",number7, number2, HugeInteger.subtract(number7, number2));
		System.out.printf("%s - %s = %s\n",number6, number7, HugeInteger.subtract(number6, number7));
		System.out.printf("%s - %s = %s\n",number7, number7, HugeInteger.subtract(number7, number7));
		
		System.out.printf("%s * %s = %s\n",number5, number6, HugeInteger.multiply(number5, number6));
		System.out.printf("%s * %s = %s\n",number7, number2, HugeInteger.multiply(number7, number2));
		System.out.printf("%s * %s = %s\n",number6, number7, HugeInteger.multiply(number6, number7));
		System.out.printf("%s * %s = %s\n",number7, number7, HugeInteger.multiply(number7, number7));
		
		System.out.printf("%s / %s = %s\n",number5, number6, HugeInteger.divide(number5, number6));
		System.out.printf("%s / %s = %s\n",number7, number2, HugeInteger.divide(number7, number2));
		System.out.printf("%s / %s = %s\n",number6, number7, HugeInteger.divide(number6, number7));
		System.out.printf("%s / %s = %s\n",number7, number7, HugeInteger.divide(number7, number7));
		
		System.out.printf("%s %% %s = %s\n",number5, number6, HugeInteger.remainder(number5, number6));
		System.out.printf("%s %% %s = %s\n",number7, number2, HugeInteger.remainder(number7, number2));
		System.out.printf("%s %% %s = %s\n",number6, number7, HugeInteger.remainder(number6, number7));
		System.out.printf("%s %% %s = %s\n",number7, number7, HugeInteger.remainder(number7, number7));
		
		
	}
}
