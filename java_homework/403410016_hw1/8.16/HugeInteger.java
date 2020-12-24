
import java.util.Arrays;

public class HugeInteger {
	
	// This class has three private instance variables
	private int[] intArray;
	private int NumDigits;
	private boolean sign;
	// --- end of instance variables
	
	// Constructors
	public HugeInteger(String str) {
		intArray = new int[41];
		NumDigits = 0;
		parse(str);
	}
	
	// only can be used by member function
	private HugeInteger(int[] objArray, int objLength, Boolean objSign)
    {
		sign = objSign;

		int i;
		if(objArray[0] > 0)
		{
			NumDigits = objLength;
			intArray = new int[41];
			for(i = 0; i < objLength; i++)
        	intArray[i] = objArray[i];
		}
		else
		{
			NumDigits = objLength-1;
			intArray = new int[41];
			for(i = 1; i < objLength; i++)
				intArray[i-1] = objArray[i];
		}
    }

	public HugeInteger() {
		intArray = new int[41];
		intArray[0] = 0;
		NumDigits = 1;
		sign = true;
	}

	// Copy constructor
	public HugeInteger(HugeInteger hugeIntObject) {
		intArray = new int[41];
		for (int i = 0; i < hugeIntObject.NumDigits; i++)
			intArray[i] = hugeIntObject.intArray[i];
		sign = hugeIntObject.sign;
		NumDigits = hugeIntObject.NumDigits;
	}
	// --- end of constructors

	public void parse(String str) {
		if (str.charAt(0) == '-') {
			if (str.charAt(1) == '0')
				sign = true;
			NumDigits = str.length() - 1;
			for (int i = 0; i < NumDigits; i++) {
				intArray[i] = str.charAt(i + 1) - '0';
			}
		} else {
			NumDigits = str.length();
			sign = true;
			for (int i = 0; i < str.length(); i++)
				intArray[i] = str.charAt(i) - '0';
		}
	}
	
	// Access methods
	final public int getNumDigits() {
		return this.NumDigits;
	}

	final public boolean getSign() {
		return this.sign;
	}
	// --- end of access methods 

	public String toString() {
		// System.out.printf("Sign = %s\n", sign ? "true" : "false");
		String[] items = Arrays.toString(intArray).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "")
				.split(",");

		String strResult;
		char[] charResult = new char[NumDigits];
		for (int i = 0; i < NumDigits; i++)
			charResult[i] = items[i].charAt(0);
		strResult = String.valueOf(charResult);

		if (sign == true)
			return strResult;
		return "-" + strResult;
	}
	
	public static String toString(int[] objArray, boolean objSign) {
		String[] items = Arrays.toString(objArray).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "")
				.split(",");

		String strResult;
		char[] charResult = new char[objArray.length];
		for (int i = 0; i < objArray.length; i++)
			charResult[i] = items[i].charAt(0);
		strResult = String.valueOf(charResult);

		if (objSign == true)
			return strResult;
		return "-" + strResult;
	}

	// predicate methods (non-static)
	public boolean isEqualTo(HugeInteger hugeIntObject) {
		if (this.NumDigits != hugeIntObject.NumDigits || this.sign != hugeIntObject.sign)
			return false;
		else {
			for (int i = 0; i < this.NumDigits; i++)
				if (this.intArray[i] != hugeIntObject.intArray[i])
					return false;
			return true;
		}
	}

	public boolean isGreaterThan(HugeInteger hugeIntObject) {
		if (this.isEqualTo(hugeIntObject) || this.sign == false && hugeIntObject.sign == true)
			return false;
		else if (this.sign == true && hugeIntObject.sign == false)
			return true;
		else if (this.sign == true)
		{
			if(this.NumDigits > hugeIntObject.NumDigits)
				return true;
			else if (this.NumDigits < hugeIntObject.NumDigits)
				return false;
			else {
				for(int i = 0; i < this.NumDigits; i++)
				{
					if(this.intArray[i] == hugeIntObject.intArray[i])
						continue;
					if(this.intArray[i] > hugeIntObject.intArray[i])
						return true;
					else
						break;
				}
				return false;
			}
		}
		else // if the two huge integer are both negative
		{
			if (this.NumDigits < hugeIntObject.NumDigits)
				return true;
			else if (this.NumDigits > hugeIntObject.NumDigits)
				return false;
			else 
			{
				for (int i = 0; i < this.NumDigits; i++)
				{
					if (this.intArray[i] == hugeIntObject.intArray[i])
						continue;
					if(this.intArray[i] < hugeIntObject.intArray[i])
						return true;
					else
						break;
				}
				return false;
			}
		}
	}
	
	public boolean isLessThan(HugeInteger hugeIntObject) {
		return hugeIntObject.isGreaterThan(this);
	}
	
	public boolean isGreaterThanOrEqualTo(HugeInteger hugeIntObject)
	{
		return this.isEqualTo(hugeIntObject) || this.isGreaterThan(hugeIntObject);
	}
	
	public boolean isLessThanOrEqualTo(HugeInteger hugeIntObject)
	{
		return this.isEqualTo(hugeIntObject) || this.isLessThan(hugeIntObject);
	}
	
	public boolean isZero()
	{
		return this.isEqualTo(new HugeInteger());
	}
	// --- end of predicate methods
	
	// Arithmetic methods
	final public static HugeInteger add(HugeInteger leftValue, HugeInteger rightValue)
	{
		int i, carry = 0;
		int[] sum;
		if (leftValue.sign == rightValue.sign)
		{
			if (leftValue.NumDigits >= rightValue.NumDigits)
			{
				sum = new int[leftValue.NumDigits+1];
				for(i = leftValue.NumDigits; i > leftValue.NumDigits - rightValue.NumDigits; i--)
				{
					sum[i] = leftValue.intArray[i-1] + rightValue.intArray[i - leftValue.NumDigits + rightValue.NumDigits - 1] + carry;
					carry = sum[i] / 10;
					sum[i] %= 10;
				}
				for(; i > 0; i--)
				{
					sum[i] = leftValue.intArray[i-1] + carry;
					carry = sum[i] / 10;
					sum[i] %= 10;
				}
				sum[0] = carry;
				
				return new HugeInteger(sum, leftValue.NumDigits+1, leftValue.sign);
			}
			else return add(rightValue, leftValue);
		}
		else return subtract(leftValue, negative(rightValue));
	}
	
	final public static HugeInteger subtract(HugeInteger leftValue, HugeInteger rightValue)
	{
		int i, carry = 0;
		int[] sum;
		if(leftValue.sign == rightValue.sign)
		{
			if(leftValue.NumDigits > rightValue.NumDigits)
			{
				sum = new int[leftValue.NumDigits+1];
				for(i = leftValue.NumDigits; i > leftValue.NumDigits - rightValue.NumDigits; i--)
				{
					sum[i] = leftValue.intArray[i-1] - rightValue.intArray[i - leftValue.NumDigits + rightValue.NumDigits-1] - carry;
					if(sum[i] < 0){
						carry = 1;
						sum[i] += 10;
					}
					else carry = 0;
				}
				for( ; i > 0; i--)
				{
					sum[i] = leftValue.intArray[i-1] - carry;
					if(sum[i]<0){
						carry = 1;
						sum[i] += 10;
					}
					else carry = 0;
				}
				
				int length = 0;
				for(i = 1; sum[i] == 0 && i < leftValue.NumDigits; i++, length++)
					;// do nothing
				
				int[] dst = new int[leftValue.NumDigits - length];
				System.arraycopy(sum, length+1, dst, 0, leftValue.NumDigits - length);
				
				return new HugeInteger(dst, leftValue.NumDigits - length, leftValue.sign);
			}
			else if (leftValue.NumDigits == rightValue.NumDigits)
			{
				sum = new int[leftValue.NumDigits+1];
				for(i = 0; i < leftValue.NumDigits; i++)
					if(leftValue.intArray[i] > rightValue.intArray[i])
					{
						for(i = leftValue.NumDigits; i > 0; i--)
						{
							sum[i] = leftValue.intArray[i-1] - rightValue.intArray[i-1] - carry;
							if(sum[i] < 0)
							{
								carry = 1;
								sum[i] += 10;
							}
							else carry = 0;
						}
						
						int length = 0;
						for(i = 1; sum[i] == 0 && i < leftValue.NumDigits; i++, length++)
							;// do nothing
						
						int[] dst = new int[leftValue.NumDigits - length];
						System.arraycopy(sum, length+1, dst, 0, leftValue.NumDigits - length);
						
						return new HugeInteger(dst, leftValue.NumDigits - length, leftValue.sign);
					}
					else if(leftValue.intArray[i] < rightValue.intArray[i])
						return negative(subtract(rightValue, leftValue));
					else
						continue;
			}
			else return negative(subtract(rightValue, leftValue));	
		}
		else return add(leftValue, negative(rightValue));

		return new HugeInteger();
	}
	
	final public static HugeInteger multiply(HugeInteger leftValue, HugeInteger rightValue)
	{
		if (leftValue.isZero() || rightValue.isZero())
		{
			return new HugeInteger();
		}
		int i, j, carry;
		int[] sum = new int[leftValue.NumDigits + rightValue.NumDigits];
		Arrays.fill(sum, 0);// initialize
		
		for(i = leftValue.NumDigits-1; i >= 0; i--)
		{
			carry = 0;
			for(j = rightValue.NumDigits-1; j >= 0; j--)
			{
				sum[i+j+1] += carry + leftValue.intArray[i]*rightValue.intArray[j];
				carry = sum[i+j+1] / 10;
				sum[i+j+1] %= 10;
			}
			sum[i+j+1] += carry;
		}
		
		if(leftValue.sign == rightValue.sign)
			return new HugeInteger(sum, leftValue.NumDigits + rightValue.NumDigits, true);
		else
			return new HugeInteger(sum, leftValue.NumDigits + rightValue.NumDigits, false);
	}
	
	final public static HugeInteger divide(HugeInteger leftValue, HugeInteger rightValue)
	{
		HugeInteger quotient = new HugeInteger(), magnificent = rightValue, divident = leftValue, divisor = rightValue;
		divident.sign = divisor.sign = true;
		if(divident.isLessThan(divisor))
			return new HugeInteger();
		if(divident.isGreaterThan(divisor))
			magnificent = magnificent.leftShift(divident.NumDigits - divisor.NumDigits);
		
		if(divident.isGreaterThanOrEqualTo(magnificent))
			quotient.NumDigits = leftValue.NumDigits - rightValue.NumDigits + 1;
		else
		{
			quotient.NumDigits = leftValue.NumDigits - rightValue.NumDigits;
			magnificent = magnificent.rightShift();// magnificent = magnificent/10
		}
		
		quotient.intArray = new int[quotient.NumDigits];
		Arrays.fill(quotient.intArray, 0);// initialize
		
		int index = 0;
		while (divident.isGreaterThanOrEqualTo(divisor))
		{
			while (divident.isGreaterThanOrEqualTo(magnificent))
			{
				quotient.intArray[index]++;
				divident = subtract(divident, magnificent);
			}
			magnificent = magnificent.rightShift();// magnificent = magnificent/10
			index++;
		}
		
		if(leftValue.getSign() == rightValue.getSign())
			return new HugeInteger(quotient.intArray, quotient.NumDigits, quotient.sign);
		else
			return new HugeInteger(quotient.intArray, quotient.NumDigits, !quotient.sign);
	}
	
	final public static HugeInteger remainder(HugeInteger leftValue, HugeInteger rightValue)
	{
		if(leftValue.isLessThan(rightValue))
			return leftValue;
		return subtract(leftValue, multiply(rightValue, divide(leftValue, rightValue)));
	}
	
	final public HugeInteger rightShift()
	{
		HugeInteger result = new HugeInteger(intArray, NumDigits-1, sign);
		return result;
	}
	
	final public HugeInteger leftShift(int times)
	{
		int[] arr = new int[NumDigits + times];
		int i;
		for(i = 0; i < NumDigits; i++)
			arr[i] = intArray[i];
		for(; i < NumDigits; i++)
			arr[i] = 0;
		
		HugeInteger result = new HugeInteger(arr, NumDigits + times, sign);
		return result;
	}
	
	// get the negative value of the hugeIntObject
	final static public HugeInteger negative(HugeInteger hugeIntObj)
	{
		HugeInteger result = new HugeInteger(hugeIntObj.intArray, hugeIntObj.NumDigits, !hugeIntObj.sign);
		return result;
	}
	// --- end of arithmetic methods
}
