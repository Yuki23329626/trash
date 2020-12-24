#include <stdio.h>
#include <stdlib.h>

int main()
{
    float Celsius;
    scanf("%f",&Celsius);

    printf("Fahrenheit = %.2f\n",(Celsius*9)/5+32);
    printf("Absolute temperature = %.2f\n",Celsius+273.15);

    return 0;
}
