#include <iostream>
#include <cstdlib>
#include <cstring>
using namespace std;
/*
    Name: 沈濃翔
    Student ID: 403410016
    Dept: 資工二
*/

// Class of BigInt
class BigInt
{
public:
    // constructor
    BigInt(const char *str);
    BigInt(int num);
    BigInt();
    BigInt(const BigInt& iniObj);

    // accessor function
    int getLength() const;
    bool getSign() const;

    // operator overloading
    friend ostream& operator <<(ostream& outputStream, const BigInt& amount);
    friend const BigInt operator +(const BigInt& amount1, const BigInt& amount2);
    friend const BigInt operator -(const BigInt& amount1, const BigInt& amount2);
    friend const BigInt operator -(const BigInt& amount);
    BigInt& operator =(const BigInt& rightValue);

    // destructor
    ~BigInt();
private:
    int *digit;
    int length;
    bool sign;
};

int main(void)
{
    BigInt a("314159265358979323846264338327950288419716939937510"), c(a);
    BigInt *b = new BigInt(1123581321);

    c = a + *b;
    cout << a << " + " << *b << " = " << c << endl;
    c = a - *b;
    cout << a << " - " << *b << " = " << c << endl << endl;

    BigInt d("-987654321987654321"), e(-987654321);

    a = d - e;
    cout << d << " - " << e << " = " << a <<endl;

    *b = e - -111111111;
    cout << e << " - " << -111111111 << " = " << *b <<endl;

    c = d + "123456789123456789";
    cout << d << " + " << "123456789123456789" << " = " << c <<endl;

    cout <<  a << " + " << *b << " = " <<  a + *b <<endl;
    cout <<  a << " + " <<  c << " = " <<  a +  c <<endl;
    cout <<  a << " + " <<  d << " = " <<  a +  d <<endl;
    cout <<  a << " - " <<  e << " = " <<  a -  e <<endl;
    cout << *b << " - " <<  c << " = " << *b -  c <<endl;
    cout << *b << " - " <<  d << " = " << *b -  d <<endl;
    cout << *b << " - " <<  e << " = " << *b -  e <<endl;
    cout <<  c << " - " <<  d << " = " <<  c -  d <<endl;
    cout <<  c << " - " <<  e << " = " <<  c -  e <<endl;
    cout <<  d << " - " <<  e << " = " <<  d -  e <<endl<<endl;

    BigInt aa, bb, cc, dd;
    aa =  97, bb = -97, cc = "197", dd = "-107";
    cout << aa << " + " << bb << " = " << aa + bb << endl;
    cout << aa << " + " << cc << " = " << aa + cc << endl;
    cout << aa << " + " << dd << " = " << aa + dd << endl;
    cout << bb << " + " << cc << " = " << bb + cc << endl;
    cout << bb << " + " << dd << " = " << bb + dd << endl;
    cout << cc << " + " << dd << " = " << cc + dd << endl;
    cout << aa << " - " << bb << " = " << aa - bb << endl;
    cout << aa << " - " << cc << " = " << aa - cc << endl;
    cout << aa << " - " << dd << " = " << aa - dd << endl;
    cout << bb << " - " << cc << " = " << bb - cc << endl;
    cout << bb << " - " << dd << " = " << bb - dd << endl;
    cout << cc << " - " << dd << " = " << cc - dd << endl;

    return 0;
}

BigInt::BigInt(const char *str)
    : digit(), length(0), sign(0)
{
    if(str[0] == '-')  //Analyzing minus sign
    {
        if(str[1] != '0')
            sign = 1;
        length = strlen(str)-1;
        digit = new int[length];
        int i;
        for(i=0 ; i<length; i++)
            digit[i] = str[i+1] - '0';
    }
    else
    {
        int i;
        length = strlen(str);
        digit = new int[length];
        for(i=0 ; i<length; i++)
            digit[i] = str[i] - '0';
    }
}

BigInt::BigInt(int num)
    : digit(), length(0), sign(0)
{
    if(num < 0)
        sign = 1,num *= -1;

    int i, temp = num;
    if(num == 0)  //if input is zero
    {
        digit = new int(0);
        length = 1;
        sign = 0;
        return;
    }
    while(temp > 0)
        temp /= 10, length++;
    digit = new int[length];

    for(i=1 ; i<=length; i++)
        digit[length-i] = num%10, num /= 10;
}

BigInt::BigInt()
    : digit(), length(1), sign(0)
{
    digit = new int(0);
}

// Copy constructor
BigInt::BigInt(const BigInt& iniObj)
    : digit(),length(iniObj.getLength()), sign(iniObj.getSign())
{
    digit = new int[length];
    int i;
    for(i = 0; i < length; i++)
        digit[i] = iniObj.digit[i];
}

// Destructor
BigInt::~BigInt()
{
    delete [] digit;
}

int BigInt::getLength() const
{
    return length;
}

bool BigInt::getSign() const
{
    return sign;
}

ostream& operator <<(ostream& outputStream, const BigInt& amount)
{
    if(amount.sign == 1)
        outputStream << "-";
    int i;
    for(i=0 ; i<amount.length ; i++)
        outputStream << amount.digit[i];

    return outputStream;
}

const BigInt operator +(const BigInt& amount1, const BigInt& amount2)
{
    int *sum,carry(0),i;
    if(amount1.sign == amount2.sign)
    {
        if(amount1.length >= amount2.length)
        {

            sum = new int[amount1.length+1];
            for(i = amount1.length ; i > amount1.length - amount2.length; i--)
            {
                sum[i] = amount1.digit[i-1] + amount2.digit[i-amount1.length+amount2.length-1] + carry;
                carry = sum[i]/10;
                sum[i] %= 10;
            }
            for(; i>0; i--)
            {
                sum[i] = amount1.digit[i-1] + carry;
                carry = sum[i]/10;
                sum[i]%=10;
            }
            char *str = new char[amount1.length+1];
            if(carry == 0)
            {
                for(i=0; i<amount1.length; i++)
                    str[i] = sum[i+1]+'0';
                str[i] = '\0';
            }
            else // if(carry > 0)
            {
                str[0] = carry + '0';
                for(i=1; i<=amount1.length; i++)
                    str[i] = sum[i] + '0';
                str[i] = '\0';
            }
            if(amount1.sign == 0)
                return BigInt(str);
            else
                return -BigInt(str);
        }
        else return amount2+amount1;
    }
    else return amount1 - (-amount2);
}

const BigInt operator -(const BigInt& amount1, const BigInt& amount2)
{
    int *sum,carry(0),i;
    if(amount1.sign == amount2.sign)
    {
        if(amount1.length > amount2.length)
        {
            sum = new int[amount1.length+1];
            for(i = amount1.length ; i > amount1.length - amount2.length; i--)
            {
                sum[i] = amount1.digit[i-1] - amount2.digit[i-amount1.length+amount2.length-1] - carry;
                if(sum[i]<0)
                    carry = 1, sum[i] += 10;
                else carry = 0;
            }
            for( ; i>0; i--)
            {
                sum[i] = amount1.digit[i-1] - carry;
                if(sum[i]<0)
                    carry = 1, sum[i] += 10;
                else carry = 0;
            }
            char *str = new char[amount1.length+2];
            int len(0);
            for(i=1 ; sum[i] == 0 && i < amount1.length; i++,len++);
            for(i = len ; i < amount1.length; i++)
                str[i-len] = sum[i+1] + '0';
            str[i-len] = '\0';

            if(amount1.sign == 0)
                return BigInt(str);
            else
                return -BigInt(str);
        }
        else if(amount1.length == amount2.length)
        {
            sum = new int[amount1.length+1];
            for(i = 0 ; i<amount1.length ; i++)  // if amount1 is same as amount2
                if(amount2.digit[i]!=amount1.digit[i])
                    break;
            if(i == amount1.length)
                return BigInt();

            for(i = 0 ; i<amount1.length ; i++)
                if(amount1.digit[i]>amount2.digit[i])
                {
                    for(i = amount1.length ; i>0; i--)
                    {
                        sum[i] = amount1.digit[i-1] - amount2.digit[i-1] - carry;
                        if(sum[i]<0)
                            carry = 1, sum[i] += 10;
                        else carry = 0;
                    }
                    char *str = new char[amount1.length+2];
                    int len(0);
                    for(i=1 ; sum[i] == 0 && i <= amount1.length; i++,len++);
                    for(i = len ; i < amount1.length; i++)
                        str[i-len] = sum[i+1] + '0';
                    str[i-len] = '\0';

                    if(amount1.sign == 0)
                        return BigInt(str);
                    else
                        return -BigInt(str);
                }
                else if(amount1.digit[i] < amount2.digit[i])
                    return -(amount2 - amount1);
        }
        else
            return -(amount2 - amount1);
    }
    else
        return amount1 + (-amount2);
}

const BigInt operator -(const BigInt& amount)
{
    int i;
    char *str = new char[amount.length+2];
    if(amount.sign == 1)
    {
        for(i=0; i<amount.length; i++)
            str[i] = amount.digit[i] + '0';
    }
    else
    {
        str[0] = '-';
        for(i=1; i<=amount.length; i++)
            str[i] = amount.digit[i-1] + '0';
    }
    str[i] = '\0';
    return BigInt(str);
}

BigInt& BigInt::operator =(const BigInt& rightObj)
{
    if(length != rightObj.length)
    {
        delete [] digit;
        digit = new int[rightObj.length];
    }
    length = rightObj.length;
    sign = rightObj.sign;
    int i;
    for(i = 0; i < rightObj.length; i++)
        digit[i] = rightObj.digit[i];

    return *this;
}
