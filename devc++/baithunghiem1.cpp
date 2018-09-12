#include "stdio.h"

int main()
{
	float a[2][3], *pa; 
	int i;
	pa = (float*) a; 
	for (i = 0; i < 6; i++){
		scanf("%f", pa+i); 
	}
	for (i = 0; i < 6; i++){
		printf("%f   ", *(pa+i)); 
	}
	return 0;
}
