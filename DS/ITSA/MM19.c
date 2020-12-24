#include <stdio.h>
#include <stdlib.h>

int main()
{
    int ncase,molecular,denominator;
    scanf("%d",&ncase);

    float min = 10000000000;
    while(ncase--){
        float height,width,depth,tmp;
        scanf("%f %f %f",&height,&width,&depth);
        tmp = ((height*width+height*depth+width*depth)*2)/(height*width*depth);
        if(tmp < min){
            min = tmp;
            molecular = (int)((height*width+height*depth+width*depth)*2);
            denominator = (int)(height*width*depth);
        }
    }

    int a=molecular,b=denominator;
    while(1)
    {
        if(a>b)
            a-=b;
        else if(b>a)
            b-=a;
        else{
            molecular/=a;
            denominator/=a;
            break;
        }
    }

    printf("%d/%d\n",molecular,denominator);

    return 0;
}
