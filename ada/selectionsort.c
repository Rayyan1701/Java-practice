#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int* sort(int arr[],int n)
{
	int small,pos;
	for(int i=0;i<n;i++)
	{
		small=arr[i]; pos=i;
		for(int j=i+1;j<n;j++)
		{
			if(small>arr[j])
			{
				small=arr[j]; pos=j;
			}
			
		}
		int temp=arr[i];
		arr[i]=small;
		arr[pos]=temp;
	}
	return arr;
}

int main()
{
	clock_t start,end;
	int a[1000];
	
	
	for(int i=0;i<15;i++)
	{
		a[i]=rand()%50;
	}
		start=clock();
	    sort(a,15);
	    end=clock();
	    
	    printf("sorted array:-\n");
	    for(int j=0;j<15;j++)
	    {
			printf("%d\t",a[j]);
		}printf("\n");
		
	  	
	  	printf("\n\n");
	

	float t=(start-end)/CLOCKS_PER_SEC;
	  	printf("time taken :-   %f",t);
	
}
