
public class RationalNumber {

	// This class has two private instance variables
	private int numerator;
	private int denominator;
	//--- end of instance variables

	// Constructors
	public RationalNumber(int numeratorValue, int denominatorValue)
	{
		if ((numeratorValue > 0 && denominatorValue > 0) || (numeratorValue < 0 && denominatorValue < 0))
			numerator = Math.abs(numeratorValue);
		else
			numerator = Math.abs(numeratorValue)*-1;
		
		denominator = Math.abs(denominatorValue);
		normalize();
	}
	
	public RationalNumber(int numeratorValue)
	{
		numerator = numeratorValue;
		denominator = 1;
	}
	
	// No-argument constructor
	public RationalNumber()
	{
		numerator = 0;
		denominator = 1;
	}
	//--- end of constructors
	
	// Access methods
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	//--- end of access methods

	public void normalize()
	{
		if(denominator == 0)
		{
			System.out.println("Denominator must be positive integer!");
			System.exit(0);
		}
		if(numerator == 0)
		{
			numerator = 0;
			denominator = 1;
		}
		int sumGCD = gcd(Math.abs(numerator), denominator);
		numerator = numerator/sumGCD;
		denominator = denominator/sumGCD;
	}
	
	final static int gcd(final int value1, final int value2)
	{
		int temp, leftValue = value1, rightValue = value2;
		while(leftValue > 0)
		{
			temp = leftValue;
			leftValue = rightValue % leftValue;
			rightValue = temp;
		}
		return rightValue;
	}
	
	public String toString()
	{
		if(numerator == 0)
			return "0";
		return numerator + "/" + denominator;
	}
	
	// specify the number of digits of precision to the right of the decimal point.
	public String toFlaot(int digits)
	{
		String str = null;
		str = String.format("%."+digits+"f", (float)numerator/(float)denominator);
		return str;
	}
	
	final public static RationalNumber add(final RationalNumber value1, final RationalNumber value2)
	{
		int sumNumerator = value1.getNumerator()*value2.getDenominator() + value2.getNumerator()*value1.getDenominator();
		int sumDenominator = value1.getDenominator() * value2.getDenominator();
		int sumGCD = gcd(Math.abs(sumNumerator), sumDenominator);
		RationalNumber result = new RationalNumber(sumNumerator/sumGCD, sumDenominator/sumGCD);
		
		return result;
	}
	
	final public static RationalNumber subtract(final RationalNumber value1, final RationalNumber value2)
	{
		return RationalNumber.add(value1, RationalNumber.negative(value2));
	}
	
	final public static RationalNumber negative(final RationalNumber value)
	{
		RationalNumber result = new RationalNumber(-1*value.getNumerator(), value.getDenominator());
		return result;
	}
	
	final public static RationalNumber multiply(final RationalNumber value1, final RationalNumber value2)
	{
		int sumNumerator = value1.getNumerator()*value2.getNumerator();
		int sumDenominator = value1.getDenominator()*value2.getDenominator();
		int sumGCD = gcd(Math.abs(sumNumerator), sumDenominator);
		RationalNumber result = new RationalNumber(sumNumerator/sumGCD, sumDenominator/sumGCD);
		return result;
	}
	
	final public static RationalNumber divide(final RationalNumber value1, final RationalNumber value2)
	{
		RationalNumber tempValue = new RationalNumber(value2.getDenominator(), value2.getNumerator());
		return RationalNumber.multiply(value1, tempValue);
	}
	
}
