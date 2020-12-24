#include <stdio.h>
#include <mmintrin.h>
#include <xmmintrin.h>

int main(void)
{
	FILE *fptr,*nptr;
	if((fptr = fopen("data.txt","r"))==NULL){
		printf("data.txt is not exist!\n");
		return 0;
	}
	nptr = fopen("output.txt","w+");

	int i,j,k,m;
	float input[200][200];

	for(i=0;i<200;i++)
		for(j=0;j<200;j++)
			fscanf(fptr,"%f",&input[i][j]);

	float A[4]__attribute__((aligned(16)));
	float B[4]__attribute__((aligned(16)));
	float C[4]__attribute__((aligned(16)));
	float D[4]__attribute__((aligned(16)));
	__m128 *a, *b, *c, *d;

	for(i=0;i<200;i++)
    {
		float sum = 0,row_result[200] = {0};

		for(j=0;j<200;j++){
			for(k=0;k<200;k++)
			{
				A[k%4] = input[i][k];
				B[k%4] = input[j][k];

				if(k%4==3)
				{
					a = (__m128*)A;
					b = (__m128*)B;
					c = (__m128*)C;
					d = (__m128*)D;
					*c = _mm_mul_ps(*a, *b);
					*d = _mm_add_ps(*c, *d);
					for(m=0;m<4;m++)
						row_result[k-3+m] = D[m],D[m]=0;
				}
			}
			for(m=0;m<200;m++)
				sum+=row_result[m];
		}
		fprintf(nptr,"%f\n",sum);
	}
	return 0;
}

